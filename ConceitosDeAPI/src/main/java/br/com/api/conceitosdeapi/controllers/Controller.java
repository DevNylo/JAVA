package br.com.api.conceitosdeapi.controllers;

import br.com.api.conceitosdeapi.model.Client;
import br.com.api.conceitosdeapi.model.Pessoa;
import br.com.api.conceitosdeapi.repository.Repo;
import br.com.api.conceitosdeapi.services.Services;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/")
public class Controller {

    @Autowired
    private Repo action;

    @Autowired
    private Services services;

    // POST, PARA ADIÇÃO DE CONTEÚDO COM A VALIDAÇÃO
    @PostMapping("/api")
    public ResponseEntity<?> cadastrar(@RequestBody Pessoa obj){
        return services.cadastro(obj);
    }

    // MOSTRA TODAS AS INFORMAÇÕES CONTIDAS NO BANCO
    @GetMapping("/api")
    public ResponseEntity<?> listaPessoas(){
        return services.listarPessoas();
    }

    // ENCONTRAR UMA INFORMAÇÃO NA TABELA A PARTIR DA PRIMARY KEY
    @GetMapping("/api/{codigo}")
    public ResponseEntity<?> encontrar(@PathVariable Integer codigo){
        return services.verPessoaCodigo(codigo);
    }

    // ________________________________________________________ //
    @GetMapping("")
    public String menssagem(){
        return "Hello World";
    }

    @GetMapping("/boasVindas")
    public String boasVindas(){
        return "Bem-vindo(a)";
    }

    @GetMapping("/boasVindas/{nome}")
    public String boasVindas(@PathVariable String nome){
        return "Bem-vindo(a) " + nome;
    }
    // ________________________________________________________ //

    // PUT, FAZ A ALTERAÇÃO DE UM ATRIBUTO NO BANCO
    @PutMapping("/api")
    public ResponseEntity<?> alterar(@RequestBody Pessoa p){
        return services.editar(p);
    }

    // DELETE, DELETA UM ATRIBUTO A PARTIR DO SEU CÓDIGO.
    @DeleteMapping("/api/{codigo}")
    public ResponseEntity<?> remover(@PathVariable Integer codigo){
        Pessoa obj = action.findByCodigo(codigo);
        return services.remover(codigo);
    }

    // COUNT, MOSTRA A SOMA E A QUANTIDADE DE CONTEÚDO CONTIDO NA TABELA.
    @GetMapping("/api/contador")
    public Long contar(){
        return action.count();
    }

    // ORDENAR, MOSTRA TODOS OS VALORES DA TABELA ORDENADOS DE A a Z CASO SEJA DE Z a A, UTILIZAR "findByOrderByNomeDesc()"
    @GetMapping("/api/ordenarPorNomes")
    public List<Pessoa> ordenarNomes(){
        return action.findByOrderByNome();
    }

    // ENCONTRA QUALQUER TERMO QUE CONTENHA OS CARACTERES INFORMADOS.
    @GetMapping("/api/encontrarTermo")
    public List<Pessoa> encontrarTermo(){
        return action.findByNomeContaining("dan");
    }

    // ENCONTRA QUALQUER TERMO QUE CONTENHA O CARACTER INFORMADO NA PRIMEIRA POSIÇÃO
    @GetMapping("/api/startWith")
    public List<Pessoa> startWith(){
        return action.findByNomeStartingWith("l");
    }

    // ENCONTRAR QUALQUER INFORMAÇÃO QUE TERMINA COM A STRING INFORMADA.
    @GetMapping("/api/endingWith")
    public List<Pessoa> endingWith(){
        return action.findByNomeEndingWith("o");
    }

    // O @QUERY ELE SERVE PARA CRIAR O PROPRIO SQL COM COMANDOS SQL
    @GetMapping("/api/somarIdades")
    public int somarIdade(){
        return action.somaIdades();
    }

    // FILTRO DE @QUERY MAIOR OU IGUAL AO TERMO
    @GetMapping("/api/idadeMaiorIgual")
    public List<Pessoa> idadeMaiorIgual(){
        return action.idadeMaiorOuIgual(18);
    }

    // @ResponseEntity RESPOSÁVEL POR CUSTOMIZAR OS STATUS DAS REQUISIÇÕES
    @GetMapping("/status")
    public ResponseEntity<?> status(){
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PostMapping("/client")
    public void cliente(@Valid @RequestBody Client obj){

    }
}