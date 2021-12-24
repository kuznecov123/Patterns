package lesson5.chain;

public class ConnectHandler  extends Handler {

    private Request request;

    @Override
    public void handle(Request request) {
        if(this.request == request)
            System.out.println("All fiber optic lines are busy, please wait");
        else
            this.request = request;

        super.handle(request);
    }
}
