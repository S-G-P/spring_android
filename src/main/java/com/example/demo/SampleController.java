package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import hello.entity.SampleEntity;

@Controller
@EnableAutoConfiguration
public class SampleController {

	@RequestMapping("/")
    String home(Model model) {
		
		// 1つの変数をつめる場合
		model.addAttribute("value", "Hello World!");
		
		// List<String>だと。。。
		List<String> stList = new ArrayList<>(); 
		stList.add("happy");
		stList.add("sad");
		stList.add("soso...");		
		model.addAttribute("stList", stList);
		
		// List<Object>だと
		List<SampleEntity> sampleEntityList = new ArrayList<>();
		SampleEntity awaji = new SampleEntity();
		awaji.id = 1;
		awaji.lastName = "awaji";
		awaji.firstName = "daisuke";
		sampleEntityList.add(awaji);		
		SampleEntity sakai = new SampleEntity();
		sakai.id = 2;
		sakai.lastName = "sakai";
		sakai.firstName = "hiroto";
		sampleEntityList.add(sakai);
		model.addAttribute("sampleEntityList", sampleEntityList);		
		
        return "hello";
    }
}
