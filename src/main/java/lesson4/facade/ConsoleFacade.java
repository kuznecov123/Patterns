package lesson4.facade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;

public class ConsoleFacade {

    private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public String getString() throws IOException {
        return reader.readLine();
    }

    public int getInt() throws IOException {
        return Integer.parseInt(reader.readLine());
    }

    public InetAddress getIp() throws IOException {
        String s = reader.readLine();
        return InetAddress.getByName(s);
    }

    public double getDouble() throws IOException {
        return Double.parseDouble(reader.readLine());
    }
}
