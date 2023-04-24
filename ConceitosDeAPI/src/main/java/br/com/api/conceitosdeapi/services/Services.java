package br.com.api.conceitosdeapi.services;

import br.com.api.conceitosdeapi.model.Mensage;
import br.com.api.conceitosdeapi.model.Pessoa;
import br.com.api.conceitosdeapi.repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class Services {

    @Autowired
    private Repo action;

    @Autowired
    private Mensage mensagem;

    // FAZ A VALIDAÇÃO ANTES DE ENVIAR OS DADOS PARA O BANCO
    public ResponseEntity<?> cadastro(Pessoa obj){
        if (obj.getNome().equals("")){
            mensagem.setMensagem("O nome precisa ser preenchido!");
            return new ResponseEntity<>(mensagem, HttpStatus.BAD_REQUEST);
        }else if(obj.getIdade() < 0){
            mensagem.setMensagem("Informe uma idade válida");
            return new ResponseEntity<>(mensagem, HttpStatus.BAD_REQUEST);
        }else{
            return new ResponseEntity<>(action.save(obj), HttpStatus.CREATED);
        }
    }

    // MÉTODO PARA SELECIONAR PESSOAS
    public ResponseEntity<?> listarPessoas(){
        return new ResponseEntity<>(action.findAll(), HttpStatus.OK);
    }

    // MÉTODO PARA SELECIONAR PELO CÓDIGO
    public ResponseEntity<?> verPessoaCodigo(int codigo){
        if(action.countByCodigo(codigo) == 0){
            mensagem.setMensagem("Não foi encontrada nenhuma pessoa");
            return new ResponseEntity<>(mensagem, HttpStatus.BAD_REQUEST);
        }else {
            return new ResponseEntity<>(action.findByCodigo(codigo),HttpStatus.OK);
        }
    }

    // MÉTODO PARA EDITAR PESSOAS
    public ResponseEntity<?> editar(Pessoa obj){
        if(action.countByCodigo(obj.getCodigo())==0){
            mensagem.setMensagem("Por favor informe o código");
            return new ResponseEntity<>(mensagem, HttpStatus.NOT_FOUND);
        }
        else if(obj.getNome().equals("")){
            mensagem.setMensagem("É necessário informar um nome");
            return new ResponseEntity<>(mensagem,HttpStatus.BAD_REQUEST);
        }else if(obj.getIdade() < 0) {
            mensagem.setMensagem("Informe uma idade válida");
            return new ResponseEntity<>(mensagem, HttpStatus.BAD_REQUEST);
        }else{
            return new ResponseEntity<>(action.save(obj), HttpStatus.OK);
        }
    }

    // MÉTODO PARA REMOVER PESSOAS
    public ResponseEntity<?> remover(int codigo){
        if(action.countByCodigo(codigo) == 0){
            mensagem.setMensagem("Esse registro não existe ");
            return new ResponseEntity<>(mensagem, HttpStatus.NOT_FOUND);
        }else {
            Pessoa obj = action.findByCodigo(codigo);
            action.delete(obj);
            mensagem.setMensagem("Pessoa removida com sucesso.");
            return new ResponseEntity<>(mensagem, HttpStatus.OK);
        }
    }
}
