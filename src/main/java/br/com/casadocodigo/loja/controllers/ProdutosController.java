package br.com.casadocodigo.loja.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by pedro.inacio on 13/03/2017.
 */

@Controller
public class ProdutosController {

    @RequestMapping("produtos/form")
    public String form(){
        return "produtos/form";
    }

}
