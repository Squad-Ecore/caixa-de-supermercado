package com.caixa.supermercado.caixasupermercadospring.repository;

import com.caixa.supermercado.caixasupermercadospring.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
