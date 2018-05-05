package main.Project.SpringBoot;



import main.Project.Employees.Player;
import main.Project.Rides.Swing;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllor
{
    @RequestMapping("/player")
    public Player player()
    {
        return new Player(10, 100);
    }

}
