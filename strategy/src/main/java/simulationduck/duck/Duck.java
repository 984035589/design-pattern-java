package simulationduck.duck;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import simulationduck.behavior.FlyBehavior;
import simulationduck.behavior.QuackBehavior;

/**
 * description.
 *
 * @outhor liujian
 * @create 2020 -01-16 22:44
 */
public abstract class Duck  {

    /**
     * The constant logger.
     */
    public static final Logger logger = LoggerFactory.getLogger(Duck.class);

    /**
     * The Fly simulationduck.behavior.
     */
    FlyBehavior flyBehavior;

    /**
     * The Quack simulationduck.behavior.
     */
    QuackBehavior quackBehavior;

    /**
     * Instantiates a new Duck.
     */
    public Duck() {
    }

    /**
     * Display.
     */
    public abstract void display();

    /**
     * Perform fly.
     */
    public void performFly(){
        flyBehavior.fly();
    }

    /**
     * Perform quack.
     */
    public void performQuack(){
        quackBehavior.quack();
    }

    /**
     * Swim.
     */
    public void swim(){
        logger.info("All ducks float , even decoys !");
    }

    /**
     * Gets fly simulationduck.behavior.
     *
     * @return the fly simulationduck.behavior
     */
    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    /**
     * Sets fly simulationduck.behavior.
     * 用于动态改变使用的策略.
     * @param flyBehavior the fly simulationduck.behavior
     */
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    /**
     * Gets quack simulationduck.behavior.
     *
     * @return the quack simulationduck.behavior
     */
    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    /**
     * Sets quack simulationduck.behavior.
     * 用于动态改变使用的策略.
     * @param quackBehavior the quack simulationduck.behavior
     */
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
