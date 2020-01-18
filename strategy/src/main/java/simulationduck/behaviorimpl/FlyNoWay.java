package simulationduck.behaviorimpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import simulationduck.behavior.FlyBehavior;

/**
 * description.
 *
 * @outhor liujian
 * @create 2020 -01-16 22:18
 */
public class FlyNoWay implements FlyBehavior {

    // 日志
    private static final Logger logger = LoggerFactory.getLogger(FlyNoWay.class);

    @Override
    public void fly() {
        logger.info("I am not fly !");
    }
}
