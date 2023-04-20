package br.com.devnylo.springboot.repository;

import br.com.devnylo.springboot.model.ProductModel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<ProductModel,Integer> {

    // LISTAR PRODUTOS
    List<ProductModel> findAll();

    // PESQUISAR POR CÓDIGOS
    ProductModel findByCodigo(int codigo);

    // CADASTRAR - ALTERAR
    <ProdMod extends ProductModel> ProdMod save(ProdMod produto);

    // REMOVER PRODUTO
    void delete(ProductModel produto);
}
