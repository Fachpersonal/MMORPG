package net.falscherIdiot.MMORPG.network;

import java.net.ServerSocket;
import java.net.Socket;

import net.falscherIdiot.MMORPG.App;

public class Server {

    private ServerSocket ss;

    private static Server server;

    public static Server getServer() {
        if (server == null) {
            server = new Server(App.PORT);
        }
        return server;
    }

    private Server(int PORT) {
        try {
            ss = new ServerSocket(PORT);
            ss.setReuseAddress(true);
            ss.setSoTimeout(120000);

            Socket c;

            while (true) {
                c = ss.accept();

                ClientHandler ch = new ClientHandler(c);
                new Thread(ch).start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
