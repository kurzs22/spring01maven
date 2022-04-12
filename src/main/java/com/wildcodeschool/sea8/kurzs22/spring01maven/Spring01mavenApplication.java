package com.wildcodeschool.sea8.kurzs22.spring01maven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class Spring01mavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring01mavenApplication.class, args);
	}

	@RequestMapping("/")
	@ResponseBody
	public String index() {
		String indexString = "Here you find some incarnations of the Doctor:" +
					"<ul>" +
					"<li><a href='/doctor/1'>First doctor</a></li>" +
					"<li><a href='/doctor/2'>Second doctor</a></li>" +
					"<li><a href='/doctor/3'>Third doctor</a></li>" +
					"<li><a href='/doctor/4'>Fourth doctor</a></li>" +
					"</ul>";

		return indexString;
	}

	@RequestMapping("/doctor/1")
	@ResponseBody
	public String doctor1() {
		return "William Hartnell";
	}

	@RequestMapping("/doctor/2")
	@ResponseBody
	public String doctor2() {
		return "Patrick Troughton";
	}

	@RequestMapping("/doctor/3")
	@ResponseBody
	public String doctor3() {
		return "Jon Pertwee";
	}

	@RequestMapping("/doctor/4")
	@ResponseBody
	public String doctor4() {
		return "Tom Baker";
	}
	
}
