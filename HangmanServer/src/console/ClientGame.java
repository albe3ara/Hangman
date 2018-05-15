package console;

import java.io.IOException;
import java.net.InetAddress;

public class ClientGame {
    public static void main(String[] args){
        try{
            ClientPlayer clientPlayer = new ClientPlayer(InetAddress.getByName("192.168.6.25"),8888);
            clientPlayer.playGame();

        }catch(IOException e){
            System.out.println("Errore sulla porta");
            System.exit(1);
        }
    }
}
