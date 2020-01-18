package strategyenumerate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

/**
 * description:
 *
 * @outhor liujian
 * @create 2020 -01-18 19:28
 */
public class Client {

    /**
     * The constant logger.
     */
    public static final Logger logger = LoggerFactory.getLogger(Client.class);

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (Calculator calculator : Calculator.values()) {
            logger.info("输出结果：{}  {}", calculator.getValue(), calculator.exec(a, b));
        }
    }

}
