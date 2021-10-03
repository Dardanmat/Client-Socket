package it.fi.meucci;

public class App 
{
    public static void main( String[] args )
    {
        
        String ipserver = "localhost";  //ip del server con cui comunicare (localhost = 127.0.0.1, la comunicazione è interna)
        int port = 5000;                //deve essere maggiore di 1023
        String messaggio = "nadraD oaiC"; //messaggio da inviare al server, verrà ricevuto all'incontrario
        
        Cliente cliente = new Cliente(ipserver, port, messaggio);
        cliente.connetti();
        cliente.comunica();
    }
}
