package simulationduck.duck;

import simulationduck.behaviorimpl.FlyWithWings;
import simulationduck.behaviorimpl.MuteQuack;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @outhor liujian
 * @create 2020-01-18 14:56
 */
public class ModelDuck extends Duck{

    public static final Logger logger = LoggerFactory.getLogger(ModelDuck.class);

    public ModelDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        logger.info("I am a Model Duck !");
    }
}
