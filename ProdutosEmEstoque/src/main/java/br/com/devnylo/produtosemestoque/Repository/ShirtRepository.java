package br.com.devnylo.produtosemestoque.Repository;

import br.com.devnylo.produtosemestoque.model.Shirt;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShirtRepository extends CrudRepository<Shirt,Long> {


    List<Shirt> findAll();

    <PostShirt extends Shirt> PostShirt save(PostShirt shirt);
}
