package pro1.logging.systemY;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.time.LocalDateTime;

public class EngineY {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    public void startEngine(int level) {
        logger.info("Engine started with level: {}", level);
    }

    public void transformObject(Object object) {
        if(object == null) {
            logger.warn("Object is null - nothing to transform");
            return;
        }

        logger.debug("Start transforming object: {}", object);
        LocalDateTime start = LocalDateTime.now();

        try {
            Thread.sleep(1001);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if(object.toString().equals("ERROR")) {
            logger.error("Error during object transformation", new RuntimeException("Unknown problem during object transformation"));
        } else {
            logger.info("Transformation ended without error");
        }

        Duration duration = Duration.between(start, LocalDateTime.now());
        logger.debug("Stop transforming object: {}, time elapsed: {} ms", object, duration.toMillis());
    }

    public void stopEngine() {
        logger.info("Engine stopped");
    }
}