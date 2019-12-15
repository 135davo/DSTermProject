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
## Functionality:

Users can send messages to a chat room where they can also see what other users have entered sent to the chat room.
Users can send video messages to each other on the same port as well


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
## Device Manager: 
Handle call initiation to all attendees
Handle data capture to all attendees
Handle delivery to all attendees
## Resource Management:
Thread pool that can handle n number of connection
Use array threads to take ip 
Attempt use of arrays to create audio channel 
Attempt use of microphone thread to gain access to user’s microphone  
## Compatibility:
Java environment needed to run program 
Microphone or proper audio format file 
## Github Link:
https://github.com/135davo/DSTermProject.git
	
