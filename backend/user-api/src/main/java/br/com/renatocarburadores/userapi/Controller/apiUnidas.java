package br.com.renatocarburadores.userapi.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class apiUnidas {

  @PostMapping(value="/")
  public String postMethod(){
    return "CHAMAAAA";
  }
  
}
