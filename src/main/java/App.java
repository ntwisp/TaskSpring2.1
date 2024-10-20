import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanHW1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanHW2 =
                (HelloWorld) applicationContext.getBean("helloworld");

        Cat cat1 = (Cat) applicationContext.getBean("cat");
        Cat cat2 = (Cat) applicationContext.getBean("cat");


        if (cat1 == cat2) {
            System.out.println("cat1 и cat2 имеют одинаковые ссылки");
        } else {
            System.out.println("cat1 и cat2 имеют разные ссылки");
        }
        if (beanHW1 == beanHW2) {
            System.out.println("beanHW1 и beanHW2 имеют одинаковые ссылки");
        } else {
            System.out.println("beanHW1 и beanHW2 имеют разные ссылки");
        }
    }
}