package linhtran;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by linhtran on 24/04/2017.
 */
public class Test {
    public static void main(String[] args) {
        String bean[] ={"bean.xml"};
        AbstractApplicationContext context=new ClassPathXmlApplicationContext(bean);
        context.registerShutdownHook();

//        User user= (User) context.getBean("user");
//        System.out.println(user);
//
        Person p= (Person) context.getBean("person");
        System.out.println(p);

    }

}
