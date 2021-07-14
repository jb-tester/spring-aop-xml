package a.b.c;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * *
 * <p>Created by irina on 15.07.2021.</p>
 * <p>Project: spring-aop-xml</p>
 * *
 */
public class RunFoo {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-configuration.xml");
        Foo foo = ctx.getBean(Foo.class);
        foo.doSomething();
    }
}
