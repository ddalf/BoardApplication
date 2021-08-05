package com.project.board.web.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	  @GetMapping("/")
	  public String index() {
	    return "board demo project!!";
	  }
}
