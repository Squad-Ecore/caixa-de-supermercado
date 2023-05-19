package com.caixa.supermercado.caixasupermercadospring.repository;

import com.caixa.supermercado.caixasupermercadospring.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    List<Produto> findByCategoriaNome(String nomeCategoria);
}
