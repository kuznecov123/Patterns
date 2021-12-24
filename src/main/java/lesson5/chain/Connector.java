package lesson5.chain;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor

public class Connector extends Handler {

    private final String name;
    @Override
    public void handle(Request request) {
        if(isBusy()) {
            System.out.printf("fiber optic line %s is busy\n", name);
            super.handle(request);
        }
        else {
            System.out.printf("fiber optic line %s is processing Request %s\n",
                    name, request.getData());
        }
    }

    private boolean isBusy() {
        return Math.random() < probability;
    }


    private final double probability = 0.9;

}
