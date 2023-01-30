package br.com.springboot.crud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.springboot.crud.model.Endereco;
import br.com.springboot.crud.repository.EnderecoRepository;

@RestController
@RequestMapping("endereco")
public class EnderecoController {
  
  @Autowired
  private EnderecoRepository enderecoRepository;

  @GetMapping(value = "listar")
  @ResponseBody
  public ResponseEntity<List<Endereco>> listaUsuario() {

    List<Endereco> enderecos = enderecoRepository.findAll();
    return new ResponseEntity<List<Endereco>>(enderecos, HttpStatus.OK);
  }

  @PostMapping(value = "salvar")
  @ResponseBody
  public ResponseEntity<Endereco> salvar(@RequestBody Endereco endereco) {

    Endereco registro = enderecoRepository.save(endereco);
    return new ResponseEntity<Endereco>(registro, HttpStatus.CREATED);
  }

  @DeleteMapping(value = "deletar")
  @ResponseBody
  public ResponseEntity<String> deletar(@RequestParam Long idEndereco) {

    enderecoRepository.deleteById(idEndereco);
    return new ResponseEntity<String>("Endereço deletado com sucesso", HttpStatus.OK);
  }

    @GetMapping(value = "buscarporid")
    @ResponseBody
    public ResponseEntity<Endereco> buscar(@RequestParam(name = "idEndereco") Long idEndereco){ 
    	
    	Endereco registro = enderecoRepository.findById(idEndereco).get();
    	return new ResponseEntity<Endereco>(registro, HttpStatus.OK);
    }  

    @PutMapping(value = "atualizar")
    @ResponseBody
    public ResponseEntity<?> atualizar(@RequestBody Endereco endereco) {

      if (endereco.getId() == null) {
        return new ResponseEntity<String>("Id não foi informado para atualização", HttpStatus.OK);
      }

      Endereco registro = enderecoRepository.saveAndFlush(endereco);
      return new ResponseEntity<Endereco>(registro, HttpStatus.OK);
    }    
}
