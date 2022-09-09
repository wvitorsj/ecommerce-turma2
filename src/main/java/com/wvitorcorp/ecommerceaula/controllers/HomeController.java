package com.wvitorcorp.ecommerceaula.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

  @GetMapping("/")
  public String index() {
    return "Bem Vindo a API feita com TDD";
  }

}
