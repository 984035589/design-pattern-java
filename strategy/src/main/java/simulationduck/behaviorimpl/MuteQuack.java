package simulationduck.behaviorimpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import simulationduck.behavior.QuackBehavior;

/**
 * description.
 *
 * @outhor liujian
 * @create 2020 -01-16 22:41
 */
public class MuteQuack implements QuackBehavior {

    /**
     * The constant logger.
     */
    public static final Logger logger = LoggerFactory.getLogger(MuteQuack.class);

    @Override
    public void quack() {
        logger.info("Silence");
    }
}
