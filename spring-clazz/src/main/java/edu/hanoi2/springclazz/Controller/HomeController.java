  package edu.hanoi2.springclazz.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping("/")
    ModelAndView home(){
       ModelAndView mv = new ModelAndView();
       mv.addObject("message","hello java");
       mv.setViewName("index");
       return mv;
    }
}
