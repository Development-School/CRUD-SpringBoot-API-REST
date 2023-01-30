package br.com.springboot.crud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.springboot.crud.model.Pessoa;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

//	Funcionou após colcoar a entidade com o "P" maiusculo Ex.:: pessoa > Pessoa
	@Query(value = "select p from Pessoa p where upper(trim(p.nome)) like %?1%")
	List<Pessoa> buscarPorNome(String name);
}