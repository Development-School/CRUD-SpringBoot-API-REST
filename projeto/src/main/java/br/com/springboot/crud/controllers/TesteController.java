package br.com.springboot.crud.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste")
public class TesteController {

    /**
    *
    * @param name the name to greet
    * @return greeting text
    */
   @RequestMapping(value = "t1/{name}", method = RequestMethod.GET)
   @ResponseStatus(HttpStatus.OK)
   public String greetingText(@PathVariable String name) {
   	
   	/*É a linha principal que roda o projeto Java Spring Boot*/
       return "Teste Spring Boot API REST: Boas vindas " + name + "!";
   }
   
   @RequestMapping(value = "t2/{nome}", method = RequestMethod.GET)
   @ResponseStatus(HttpStatus.OK)
   public String retornaOlaMundo(@PathVariable String nome) {
   	
   	return "Olá Mundo! " + nome;
   }
}
