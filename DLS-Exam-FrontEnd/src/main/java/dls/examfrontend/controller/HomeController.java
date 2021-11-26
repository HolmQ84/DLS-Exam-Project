package dls.examfrontend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {

    @GetMapping("/error")
    public ModelAndView errorPage() {
        return new ModelAndView("error");
    }
}