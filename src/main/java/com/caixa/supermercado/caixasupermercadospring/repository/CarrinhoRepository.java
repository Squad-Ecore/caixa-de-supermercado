package com.caixa.supermercado.caixasupermercadospring.repository;

import com.caixa.supermercado.caixasupermercadospring.model.Carrinho;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarrinhoRepository extends JpaRepository<Carrinho, Long> {
}
