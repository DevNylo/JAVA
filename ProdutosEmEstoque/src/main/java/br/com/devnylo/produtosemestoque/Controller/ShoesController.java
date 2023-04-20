package br.com.devnylo.produtosemestoque.Controller;

import br.com.devnylo.produtosemestoque.Repository.ShoesRepository;
import br.com.devnylo.produtosemestoque.model.Shoes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/stock/shoes")
public class ShoesController {

    @Autowired
    private ShoesRepository action;

    @ResponseBody
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Shoes> list(){
        return action.findAll();
    }
    @ResponseBody
    @RequestMapping(value = "/item", method = RequestMethod.POST)
    public Shoes addShoes(@RequestBody Shoes add){
        return action.save(add);
    }
}
