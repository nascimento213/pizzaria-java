package com.itb.inf2dm.pizzariad.controller;


import com.itb.inf2dm.pizzariad.model.entity.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/produto")
public class ProdutoController {

    List<Produto> produtos = new ArrayList<Produto>();


    @GetMapping
    public List<Produto> findAll() {

        Produto p1 = new Produto();
        p1.setNome("Pizza de Calabresa");
        p1.setDescricao("Pizza de Calabresa com muita cebola");
        p1.setValorVenda(49.90);

        Produto p2 = new Produto();
        p2.setNome("Pizza de Muçarela");
        p2.setDescricao("Pizza de Muçarela com muito queijo");
        p2.setValorVenda(79.99);

        produtos.add(p1);
        produtos.add(p2);
        return produtos;
    }

}
