package linhtran.BeanFactoryPostProcessor;

import linhtran.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by linhtran on 25/04/2017.
 */
public class Test {
    public static void main(String[] args) {
        String bean[]={"bean-factory.xml"};
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(bean);
        Person person= (Person) applicationContext.getBean("person");
        System.out.println(person);
        Person person2= (Person) applicationContext.getBean("person2");
        System.out.println(person2);
        Person person3= (Person) applicationContext.getBean("person3");
        System.out.println(person3);

        Person person4= (Person) applicationContext.getBean("person4");
        System.out.println(person4);

    }
}
