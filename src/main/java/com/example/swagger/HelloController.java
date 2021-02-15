/*
 *   Copyright © 2021 Pearson VUE. All rights reserved.
 */

package com.example.swagger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *   //todo: Finish Description!!!
 *
 */
@RestController
public class HelloController {

	@RequestMapping(value = "/hello",method = RequestMethod.GET)
	public String hello(){
		return "hello";
	}
}
