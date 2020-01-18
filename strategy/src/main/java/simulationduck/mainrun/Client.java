package simulationduck.mainrun;

import simulationduck.behaviorimpl.FlyNoWay;
import simulationduck.behaviorimpl.MuteQuack;
import simulationduck.duck.Duck;
import simulationduck.duck.MallardDuck;
import simulationduck.duck.ModelDuck;

/**
 * description.
 *
 * @outhor liujian
 * @create 2020 -01-16 23:03
 */
public class Client {

    /**
     * Main.
     *
     * @param args the args
     */
    public static void main(String[] args){
        // 绿头鸭
        Duck mallDuck = new MallardDuck();
        mallDuck.performFly();
        mallDuck.performQuack();
        mallDuck.swim();
        // 模型鸭
        Duck modelDuck = new ModelDuck();
        modelDuck.performQuack();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyNoWay());
        modelDuck.setQuackBehavior(new MuteQuack());
        modelDuck.performQuack();
        modelDuck.performFly();
        modelDuck.swim();
    }

}
