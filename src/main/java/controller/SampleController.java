package controller;

import java.util.List;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import service.SampleService;

@Controller
@EnableAutoConfiguration
public class SampleController {

	@RequestMapping("/")
    String home(Model model) {		
		SampleService service = new SampleService();				
		// 1つの変数をつめる場合
		model.addAttribute("value", "Hello World!");				
		// List<String>だと。。。				
		model.addAttribute("stList", service.getStringData());		
		// List<Object>だと
		model.addAttribute("sampleEntityList", service.getSampleEntity());		
		
        return "hello";
    }
}
