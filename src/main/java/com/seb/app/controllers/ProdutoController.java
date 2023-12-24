package com.seb.app.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.seb.app.models.Produto;
import com.seb.app.repository.ProdutoRepository;

import lombok.AllArgsConstructor;

@Component
@RestController
@AllArgsConstructor
@RequestMapping("/api/produtos")
public class ProdutoController {
    
    private final ProdutoRepository produtoRepository;

    @GetMapping
    public List<Produto> list(){
        return produtoRepository.findAll();
    }


    @ResponseStatus(code = HttpStatus.CREATED)

    @PostMapping
    public Produto create(@RequestBody Produto produto){
        return produtoRepository.save(produto);
    }
}
