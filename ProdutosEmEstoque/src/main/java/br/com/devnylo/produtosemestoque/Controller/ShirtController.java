package br.com.devnylo.produtosemestoque.Controller;

import br.com.devnylo.produtosemestoque.Repository.ShirtRepository;
import br.com.devnylo.produtosemestoque.model.Shirt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/stock/shirt")
public class ShirtController {

    @Autowired
    private ShirtRepository action;

    @ResponseBody
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Shirt> list(){
        return action.findAll();
    }

    @ResponseBody
    @RequestMapping(value = "/item", method = RequestMethod.POST)
    public Shirt addShirt(@RequestBody Shirt add){
        return action.save(add);
    }


}
