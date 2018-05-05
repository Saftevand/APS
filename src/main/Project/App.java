package main.Project;

import main.Project.Rides.Swing;
import main.Project.Utilities.Bank;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class App
{
    public static void main(String []args)
    {
        SpringApplication.run(App.class, args);



        Bank bank = new Bank(10);

        Swing a = new Swing(5, 0);

        System.out.println(a.get_coinsPerDay() + " - " + a.get_maxEmployees() + " - " + a.get_currentAmountOfSwings() + " - " + bank.getCoins());

        a.AddSwing(bank);

        System.out.println(a.get_coinsPerDay() + " - " + a.get_maxEmployees() + " - " + a.get_currentAmountOfSwings() + " - " + bank.getCoins());
    }


    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx)
    {
        return args -> {

            System.out.println("Inspect the beans");
            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames)
            {
                System.out.println(beanName);
            }

        };
    }
}
