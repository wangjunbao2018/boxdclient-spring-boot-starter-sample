package one.contentbox.boxd.spring.sample;

import one.contentbox.boxd.exception.BoxdException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Sample {
    public static void main(String[] args)  throws BoxdException {

        ConfigurableApplicationContext applicationContext  =SpringApplication.run(Sample.class, args);
        BoxdClientWrapper t = applicationContext.getBean(BoxdClientWrapper.class);
        System.out.println(t.height());
    }
}