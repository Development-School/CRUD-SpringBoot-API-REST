package br.com.springboot.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.springboot.crud.model.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long>{
  
}
