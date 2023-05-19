package com.caixa.supermercado.caixasupermercadospring.repository;

import com.caixa.supermercado.caixasupermercadospring.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    Categoria findByNome(String nome);
}
