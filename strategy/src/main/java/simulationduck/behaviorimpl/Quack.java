package simulationduck.behaviorimpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import simulationduck.behavior.QuackBehavior;

/**
 * description.
 *
 * @outhor liujian
 * @create 2020-01-16 22:39
 */
public class Quack implements QuackBehavior {

    public static final Logger logger = LoggerFactory.getLogger(Quack.class);

    @Override
    public void quack() {
        logger.info("Quack");
    }
}
