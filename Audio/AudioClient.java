import java.io.*;
import java.net.*;
import javax.sound.sampled.*;

public class AudioClient {
    public static void main(String[] args) throws Exception {
        if (args.length > 0) {
            File soundFile = AudioUtil.getSoundFile(args[0]);
            System.out.println("Client: " + soundFile);
            try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(soundFile))) {
                play(in);
            }
        }
        else {
            // play soundfile from server
            System.out.println("Client: reading from localhost:2222");
            try (Socket socket = new Socket("localhost", 2222)) {
                if (socket.isConnected()) {
                    InputStream in = new BufferedInputStream(socket.getInputStream());
                    play(in);
                }
            }
        }

        System.out.println("Client: end");
    }


    private static synchronized void play(final InputStream in) throws Exception {
        AudioInputStream ais = AudioSystem.getAudioInputStream(in);
        try (Clip clip = AudioSystem.getClip()) {
            clip.open(ais);
            clip.start();
            Thread.sleep(100); // given clip.drain a chance to start
            clip.drain();
        }
    }
}
