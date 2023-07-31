package com.mvcflow.mvcspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mvcflow.mvcspring.bean.PrimaryData;
import com.mvcflow.mvcspring.service.PrimaryService;

@RestController
@RequestMapping("/api")
public class PrimaryController {

	@Autowired
	PrimaryService primaryService;

	@GetMapping("/primarydata")
	public List<PrimaryData> getPrimaryData() {

		return primaryService.getPrimaryDBResponse();
	}

	@GetMapping("/hello")
	public String getHelloWorld() {
		return "HelloWorld";
	}

	@GetMapping("/add")
	public int add() {
		return primaryService.addService();
	}

}
