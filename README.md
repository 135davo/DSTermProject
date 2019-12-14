# DSTermProject

### Sheku Bangura
### David Moevi
## Operating systems
# Phase I: Design Document
### Target Audience: Mac os
### Programming language: Java
 
 
 ## Network Communication:	
Port is selected and a socket is created to allow server to 
Clients and servers exchange messages in a request–response messaging pattern.
When the server receives a request message from a User/client inviting another party to join a session, the server acts as a proxy and forwards the invitation to its destination.
searches for two endpoints and finds the best path to pass the pieces of information from one end to the other.
How to handle messages.
Chat server and client.
How do they  communicate?
 
Read me file- client, server what language you have to speak to each other. What kind of data?
Functionality. 
Use cases. Flags in the message. A response or a broadcast? 
What are different circumstances that need to be covered?
How are we going to store all this.  What kind of data structure are we going to use? Get a copy of the buffer and send every user the buffer. 
 ## Protocols: 
 
 Understanding every protocol.












## Steps:

Create a server socket at the beginning of main and initiate it with a port number.
Loop continuously to keep accepting clients. 
Create the new clients threads.
Create the server thread
Make the Client thread send and receive data
In the client thread make a private buffered reader to receive data from clients. And a writer to write to the client. 
Create a getter for the writer, initialize the writer to run with the sockets output stream and the bufferReader with a new Input stream reader using the sockets input stream.
Create a loop to check any new inputs and print the input to all clients.
Create two different threads to receive data from the user and from the server.
Create a loop to continually check for new inputs

Capture the buffer through an output stream and broadcast the message to everyone else 
Device Manager
Handle call initiation, data capture and delivery to all attendees
Resource Management 
Thread pool that can handle n number of connection
Use array threads to take ip 
Attempt use of arrays to create audio channel
Attempt use of microphone thread to gain access to user’s microphone  
## Compatibility 
	
