package springweb.springwebart.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import springweb.springwebart.functions.ReadFile;



@Controller
public class RestController {


    @GetMapping("/")
    public String index(Model model) {
        // list of the films in s3
        model.addAttribute("films", ReadFile.Show());
        return "films";
    }

    @GetMapping("/index")
    public String home(){
        return "home";
    }


}
