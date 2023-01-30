package br.com.springboot.crud.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

/*
 * 	Desafio Java

	Usando Spring boot, crie uma API simples para gerenciar Pessoas. Esta API deve permitir:  
	•	Criar uma pessoa
	•	Editar uma pessoa
	•	Consultar uma pessoa
	•	Listar pessoas
	•	Criar endereço para pessoa
	•	Listar endereços da pessoa
	•	Poder informar qual endereço é o principal da pessoa  
	
	Uma Pessoa deve ter os seguintes campos: 
	•	Nome
	•	Data de nascimento
	•	Endereço:
		o	Logradouro
		o	CEP
		o	Número
		o	Cidade
*/

// @Data
 @Entity //ATENÇÃO, a tabela só será criada após definir a anotação @Id
/*  
 * ATENÇÃO: esta definição é a nível de bando de dados e não para a interface "PessoaRepository.java"
 * Ou seja, na interface deve-se declarar na query "Pessoa" com a primeira letra maiúscula.
*/
@Table(name = "tb_pessoa")
public class Pessoa implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "nome", nullable = false)
  private String nome;

   @DateTimeFormat(pattern = "dd/MM/yyyy")
   private LocalDate dataNascimento;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

   public LocalDate getDataNascimento() {
     return dataNascimento;
   }

   public void setDataNascimento(LocalDate dataNascimento) {
     this.dataNascimento = dataNascimento;
   }

   @Override
   public int hashCode() {
     return Objects.hash(id);
   }

   @Override
   public boolean equals(Object obj) {
     if (this == obj)
       return true;
     if (obj == null)
       return false;
     if (getClass() != obj.getClass())
       return false;
     Pessoa other = (Pessoa) obj;
     return Objects.equals(id, other.id);
   }
}
