package simulationduck.behaviorimpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import simulationduck.behavior.QuackBehavior;

/**
 * description.
 *
 * @outhor liujian
 * @create 2020 -01-16 22:42
 */
public class Squeak implements QuackBehavior {

    /**
     * The constant logger.
     */
    public static final Logger logger = LoggerFactory.getLogger(Squeak.class);

    @Override
    public void quack() {
        logger.info("Squeak");
    }
}
