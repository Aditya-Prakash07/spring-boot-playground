package helloworld;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
       //1. Launch a spring Context.
        //2. Configure the thing that we want Spring to manage
        //HelloWorldConfiguration -- @Configuration
        // name @Bean
       var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("address2"));
        System.out.println(context.getBean(Address.class));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("Person2MethodCall"));
        System.out.println(context.getBean("Person3Parameters"));
        System.out.println(context.getBean(Person.class));
        //System.out.println(context.getBean(Address.class));
        System.out.println(context.getBean("Person5Qualifier"));

        //Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println); //(functional programming)

    }
}
