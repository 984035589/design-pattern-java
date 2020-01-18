package simulationduck.duck;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import simulationduck.behaviorimpl.FlyWithWings;
import simulationduck.behaviorimpl.Quack;

/**
 * description.
 *
 * @outhor liujian
 * @create 2020-01-16 22:48
 */
public class MallardDuck extends Duck {

    public static final Logger logger = LoggerFactory.getLogger(MallardDuck.class);

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        logger.info("I am a Mall Duck !");
    }
}
