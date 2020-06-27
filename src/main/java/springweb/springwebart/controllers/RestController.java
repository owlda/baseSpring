package springweb.springwebart.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import springweb.springwebart.functions.ReadFile;
import springweb.springwebart.repo.PostsImplementation;


@Controller
public class RestController {

    @GetMapping("/")
    public String root(){
        return "index";
    }

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/about")
    public String about(){
        return "about";
    }

    @GetMapping("/contact")
    public String contact(){
        return "contact";
    }

    @GetMapping("/films")
    public String films() { return "films"; }

    @GetMapping("/test")
    public String test(Model model) {

        PostsImplementation postsImplementation = new PostsImplementation();
        // list of the posts
        model.addAttribute("posts", postsImplementation.getAllPosts());
        return "test";
    }



}

