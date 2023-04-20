package br.com.devnylo.produtosemestoque.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/stock")
public class GeneralController {
    @ResponseBody
    @RequestMapping(value = "")
    public String hello(){
        return "Mall Stock";
    }
}
