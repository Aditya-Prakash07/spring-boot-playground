package helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address){}
record Address(String firstLine, String city){}
@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name(){
        return "Aditya";
    }
    @Bean
    public int age(){
        return 15;
    }
    @Bean
    public Person person(){
        return new Person("Pasa Bhai",16, new Address("Shahi Colony","Hajipur"));
    }
    @Bean
    public Person Person2MethodCall(){
        return new Person(name(),age(),address());
    }
    @Bean
    @Primary
    public Person Person3Parameters(String name, int age, Address address2){
        return new Person(name,age,address2);
    }
    @Bean
    public Person Person5Qualifier(String name, int age, @Qualifier("address3qualifier") Address address){
        return new Person(name,age,address);
    }

    @Bean(name = "address2")
    @Primary
    public Address address(){
        return new Address("Adalwari","Hajipur");
    }
    @Bean
    @Qualifier("address3qualifier")
    public Address address3(){
        return new Address("pune","India");
    }

}
