package main.Project.SpringBoot;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllor
{
    @RequestMapping("/api")
    public String homeAPI()
    {
        return "TEst teST";
    }
}
