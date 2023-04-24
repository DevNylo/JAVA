package br.com.api.conceitosdeapi.repository;

import br.com.api.conceitosdeapi.model.Pessoa;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface Repo extends CrudRepository<Pessoa, Integer> {

    List<Pessoa> findAll();
    Pessoa findByCodigo(Integer codigo);
    List<Pessoa> findByOrderByNome();

    List<Pessoa> findByNomeContaining(String termo);

    List<Pessoa> findByNomeStartingWith(String termo);

    List<Pessoa> findByNomeEndingWith(String termo);

    @Query(value = "SELECT SUM(IDADE) FROM pessoa", nativeQuery = true)
    int somaIdades();

    @Query(value = "SELECT * FROM pessoa WHERE idade >= :idade", nativeQuery = true)
    List<Pessoa> idadeMaiorOuIgual(int idade);

    int countByCodigo(int codigo);
}
