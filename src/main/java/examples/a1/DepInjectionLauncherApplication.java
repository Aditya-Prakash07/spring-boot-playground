package examples.a1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;
//@Component
//class YourBusinessClass{
//    // this called field injection because here we are using reflection not setter or constructor.
//    @Autowired
//    Dependency1 dependency1;
//    @Autowired
//    Dependency2 dependency2;
//
//    public String toString() {
//        return new StringBuffer("Using " ).append(dependency1).append(" and ").append(dependency2).toString();
//    }
//}




//@Component
//class YourBusinessClass{
//    // this called setter based injection because here we are injecting dependency using setter
//
//    Dependency1 dependency1;
//    Dependency2 dependency2;
//    @Autowired
//    public void setDependency1(Dependency1 dependency1) {
//        System.out.println("Setter Injection - setDependency1");
//        this.dependency1 = dependency1;
//    }
//    @Autowired
//    public void setDependency2(Dependency2 dependency2) {
//        System.out.println("Setter Injection - setDependency2");
//        this.dependency2 = dependency2;
//    }
//
//    public String toString() {
//        return new StringBuffer("Using " ).append(dependency1).append(" and ").append(dependency2).toString();
//    }
//}
//






@Component
class YourBusinessClass{
    // this called constructor based injection because here we are injecting dependency using constructor
    // Autowired is not mendatory in constructor injection
    // SpringBoot automaticaly use the constructor to create the object even if you don't have @Autowired over there
    //Spring Team recommends the Constructor Based Injection Because all the initialisation happens in just one method
    Dependency1 dependency1;
    Dependency2 dependency2;
    //@Autowired
    public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2){
        //super();
        System.out.println("Constructor Injection - YourBusinessClass");
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }
    public String toString() {
        return new StringBuffer("Using " ).append(dependency1).append(" and ").append(dependency2).toString();
    }
}





@Component
class Dependency1{

}
@Component
class Dependency2{

}





@Configuration
@ComponentScan
public class DepInjectionLauncherApplication {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(DepInjectionLauncherApplication.class))
        {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(YourBusinessClass.class));
        }
    }
}
