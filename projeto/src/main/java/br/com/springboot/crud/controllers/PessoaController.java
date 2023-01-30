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

import br.com.springboot.crud.model.Pessoa;
import br.com.springboot.crud.repository.PessoaRepository;

/**
 *
 * A sample greetings controller to return greeting text
 */
@RestController
@RequestMapping("/api")
public class PessoaController {
	
	@Autowired /*IC/CD ou CDI - Injeção de dependência*/
	private PessoaRepository pessoaRepository;
    
    /*Nosso 1º Método de API - Buscar todos*/
    @GetMapping(value = "listatodos")
    @ResponseBody /*Retorna os dados para o corpo da resposta*/
    public ResponseEntity<List<Pessoa>> listaUsuario() {
    	
    	List<Pessoa> pessoas = pessoaRepository.findAll(); /*Executa consulta no banco de dados*/
    	
    	/*Retorna a lista em JSON (Ps.: Tota API retorna um JSON)*/
    	return new ResponseEntity<List<Pessoa>>(pessoas, HttpStatus.OK);
    }
    
    /*Nosso 2º Método de API - Salvar Registro*/
    @PostMapping(value = "salvar") /*Mapeia a URL*/ 
    @ResponseBody /*Descrição da resposta*/
    public ResponseEntity<Pessoa> salvar(@RequestBody Pessoa pessoa){ /*Recebe os dados para salvar*/
    	
    	Pessoa registro = pessoaRepository.save(pessoa);
		  return new ResponseEntity<Pessoa>(registro, HttpStatus.CREATED);
    }
    
    /*Nosso 3º Método de API - Deletar Registro*/
    @DeleteMapping(value = "deletar") /*Mapeia a URL*/ 
    @ResponseBody /*Descrição da resposta*/
    public ResponseEntity<String> deletar(@RequestParam Long idPessoa){ /*Recebe os dados para deletar*/
    	
    	pessoaRepository.deleteById(idPessoa);
		  return new ResponseEntity<String>("Pessoa deletada com sucesso", HttpStatus.OK);
    }
    
    /*Nosso 4º Método de API - Buscar Registro*/
    @GetMapping(value = "buscarporid") /*Mapeia a URL*/ 
    @ResponseBody /*Descrição da resposta*/
    public ResponseEntity<Pessoa> buscar(@RequestParam(name = "idPessoa") Long idPessoa){ /*Recebe os dados para buscar*/
    	
    	Pessoa pessoa = pessoaRepository.findById(idPessoa).get();
    	return new ResponseEntity<Pessoa>(pessoa, HttpStatus.OK);
    }
    
    /*Nosso 5º Método de API - Atualizar Registro*/
    @PutMapping(value = "atualizar") /*Mapeia a URL*/ 
    @ResponseBody /*Descrição da resposta*/
    public ResponseEntity<?> atualizar(@RequestBody Pessoa pessoa){ /*Recebe os dados para salvar*/
    	
    	if(pessoa.getId() == null) {
    		return new ResponseEntity<String>("Id não foi informado para atualização", HttpStatus.OK);
    	}
    	
    	Pessoa registro = pessoaRepository.saveAndFlush(pessoa);
		  return new ResponseEntity<Pessoa>(registro, HttpStatus.OK);
    }    
    
    /*Nosso 6º Método de API - Buscar registros por parte do nome*/
    @GetMapping(value = "buscarPorNome") /*Mapeia a URL*/ 
    @ResponseBody /*Descrição da resposta*/
    public ResponseEntity<List<Pessoa>> buscarPorNome(@RequestParam(name = "name") String name){ /*Recebe os dados para buscar*/
    	
    	List<Pessoa> pessoa = pessoaRepository.buscarPorNome(name.trim().toUpperCase());
		  return new ResponseEntity<List<Pessoa>>(pessoa, HttpStatus.OK);
    }
}
