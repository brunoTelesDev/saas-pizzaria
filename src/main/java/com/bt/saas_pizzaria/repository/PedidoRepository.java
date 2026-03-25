package com.bt.saas_pizzaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bt.saas_pizzaria.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}