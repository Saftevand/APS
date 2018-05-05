package main.Project;

import main.Project.Rides.Swing;
import main.Project.Utilities.Bank;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
}
