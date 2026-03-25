package com.bt.saas_pizzaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bt.saas_pizzaria.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}