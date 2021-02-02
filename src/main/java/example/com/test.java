package example.com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Recept recept = context.getBean("recept", Recept.class);
        recept.may();
        context.close();
    }
}
