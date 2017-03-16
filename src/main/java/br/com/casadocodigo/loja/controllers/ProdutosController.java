package br.com.casadocodigo.loja.controllers;

import br.com.casadocodigo.loja.br.com.casadocodigo.loja.daos.ProdutoDAO;
import br.com.casadocodigo.loja.models.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by pedro.inacio on 13/03/2017.
 */

@Controller
public class ProdutosController {

    @Autowired
    private ProdutoDAO produtoDAO;

    @RequestMapping("produtos/form")
    public String form(){
        return "produtos/form";
    }

    @RequestMapping("/produtos")
    public String gravar(Produto produto){
        System.out.println(produto);
        produtoDAO.gravar(produto);
        return "/produtos/ok";
    }

}
