package com.seb.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.seb.app.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    
}
