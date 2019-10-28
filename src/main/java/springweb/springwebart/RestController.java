package springweb.springwebart;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.web.bind.annotation.RestController
public class RestController {


    @GetMapping("/home")
    @ResponseBody
    public String home(){

        return "Hi";
    }
}
