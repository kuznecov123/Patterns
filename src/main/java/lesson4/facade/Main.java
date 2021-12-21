package lesson4.facade;

import java.io.IOException;
import java.net.InetAddress;

public class Main {

    public static void main(String[] args) throws IOException {
        ConsoleFacade facade = new ConsoleFacade();

        System.out.print("Show facade to string >>>>");
        String s = facade.getString();
        System.out.println(s);

        System.out.print("Show facade to int >>>>");
        int n = facade.getInt();
        System.out.println(n);

        System.out.print("Show facade to double >>>>");
        double d = facade.getDouble();
        System.out.println(d);

        System.out.print("Show facade to ip >>>>");
        InetAddress ip = facade.getIp();
        System.out.println(ip);
        
    }
}
