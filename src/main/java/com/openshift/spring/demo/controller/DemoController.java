/**
 * <pre>
 * Copyright 2021
 * Teranet Inc.,
 * 123 Front Street West, Suite 700,
 * Toronto, Ontario,
 * CANADA M5J 2M2
 *
 * All rights reserved. This software is the confidential and proprietary information
 * of Teranet,Inc. ('Confidential Information'). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the license agreement you
 * entered into with Teranet.
 * </pre>
 */ 
package com.openshift.spring.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Pavel Simonovsky
 *
 */
@RestController
public class DemoController {

  @Value("${demo.message}")
  private String message;
  
  @GetMapping("hello")
  public String sayHello(@RequestParam String name) {
    return "Hello " + name;
  }
  
  @GetMapping("message")
  public String showMessage() {
    return message;
  }
  
}
