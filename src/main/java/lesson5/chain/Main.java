package lesson5.chain;

public class Main {
    public static void main(String[] args) {
        Handler handler = new ConnectHandler();

        handler.link(new Connector("№1"))
                .link(new Connector("№2"))
                .link(new Connector("№3"))
                .link(handler);



        for (int i = 0;i<10;i++) {
            final int temp = i;
            handler.handle(new Request() {
                @Override
                public String getData() {
                    return Integer.toString(temp);
                }
            });
        }
    }
}
