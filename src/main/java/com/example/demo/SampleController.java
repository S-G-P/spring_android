package com.example.demo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class SampleController {

	@RequestMapping("/")
    String home(Model model) {
		model.addAttribute("value", "Hello World!");
        return "hello";
    }
}
