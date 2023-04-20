package br.com.devnylo.produtosemestoque.Repository;

import br.com.devnylo.produtosemestoque.model.Shoes;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShoesRepository extends CrudRepository<Shoes, Long> {

    List<Shoes> findAll();

    <ShoesMod extends Shoes> ShoesMod save(ShoesMod shoes);

}
