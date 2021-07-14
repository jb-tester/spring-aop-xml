package a.b.c;

public class FooBeforeAspect {

    

    public void beforeAdvice() throws Throwable {
        System.out.println("executed before intercepted method ");
    }
}