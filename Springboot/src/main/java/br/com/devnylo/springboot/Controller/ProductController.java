package br.com.devnylo.springboot.Controller;

import br.com.devnylo.springboot.model.ProductModel;
import br.com.devnylo.springboot.model.RespostaDelete;
import br.com.devnylo.springboot.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    // AÇÕES
    @Autowired
    private ProductRepository actions;

    @ResponseBody
    @RequestMapping(value = "/produtos", method = RequestMethod.GET)
    public List<ProductModel> lista(){
        return actions.findAll();
    }

    // FILTRAR PRODUTO
    @ResponseBody
    @RequestMapping(value = "/produtos/{codigo}", method = RequestMethod.GET)
    public ProductModel filtrar(@PathVariable Integer codigo){
        return actions.findByCodigo(codigo);
    }

    // CADASTRAR PRODUTOS

    @ResponseBody
    @RequestMapping(value = "/produtos", method = RequestMethod.POST)
    public ProductModel cadastrar(@RequestBody ProductModel produto){
        return actions.save(produto);
    }

    // ALTERAR PRODUTO

    @ResponseBody
    @RequestMapping(value = "/produtos", method = RequestMethod.PUT)
    public ProductModel alterar(@RequestBody ProductModel produto){
        return actions.save(produto);
    }
    // REMOVER PRODUTO

    @ResponseBody
    @RequestMapping(value = "/produtos/{codigo}", method = RequestMethod.DELETE)
    public RespostaDelete remover(@PathVariable Integer codigo){
        RespostaDelete resposta = new RespostaDelete();

        try {
            ProductModel produto = filtrar(codigo);
            this.actions.delete(produto);
            resposta.setMensagem("<200> Removido com sucesso!");
        }catch (Exception e){
            resposta.setMensagem("Erro ao remover: "+e.getMessage());
        }

        return resposta;
    }

    /*
    // INÍCIO
    @RequestMapping(value = "", method = RequestMethod.GET)
    public @ResponseBody String inicio(){
        return "Bem-vindo(a) a API de Produtos";
    }

    // SOBRE
    @RequestMapping(value = "/sobre", method = RequestMethod.GET)
    public @ResponseBody String sobre(){
        return "Sobre a API";
    }

    // CONTATO
    @RequestMapping(value="/contato", method=RequestMethod.GET)
    public @ResponseBody String contato(){
        return "Fale conosco!";
    }
    */

}
