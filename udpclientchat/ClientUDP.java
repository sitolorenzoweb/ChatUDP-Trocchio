/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientudp;

import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Asus_X555LD
 */
public class ClientUDP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnknownHostException {

        new Runnable() {
            @Override
            public void run() {
                try {
                    new ClientChat();
                } catch (SocketException | UnknownHostException ex) {
                    Logger.getLogger(ClientChat.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }.run();

    }

}