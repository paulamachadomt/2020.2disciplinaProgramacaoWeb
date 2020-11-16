package edu.usj.ads.helloworldhtml;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldHtml {

    @GetMapping(value = "/hello")
    public ModelAndView getHelloHtml() {
        return new ModelAndView("hello-world"); 
    }
    
}
