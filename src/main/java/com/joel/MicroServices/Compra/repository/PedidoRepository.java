package com.joel.MicroServices.Compra.repository;

import com.joel.MicroServices.Compra.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository  extends JpaRepository<Pedido , Long> {
}
