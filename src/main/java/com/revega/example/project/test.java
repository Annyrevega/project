package com.revega.example.project;

import com.revega.example.project.model.Recept;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("src/main/webapp.WEB-INF/applicationContext.xml");
        Recept recept = context.getBean("recept", Recept.class);
        recept.may();
        context.close();
    }
}
