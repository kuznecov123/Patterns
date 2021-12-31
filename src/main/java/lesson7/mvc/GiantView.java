package lesson7.mvc;
import lombok.extern.slf4j.Slf4j;

import java.util.logging.Logger;


@Slf4j
public class GiantView {
    Logger LOGGER = Logger.getLogger(GiantView.class.getName());
    public void displayGiant(GiantModel giant) {
        LOGGER.info(giant.toString());
    }
}
