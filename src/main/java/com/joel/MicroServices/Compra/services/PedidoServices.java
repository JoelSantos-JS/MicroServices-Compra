package com.joel.MicroServices.Compra.services;

import com.joel.MicroServices.Compra.model.Pedido;
import com.joel.MicroServices.Compra.repository.PedidoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
@AllArgsConstructor
public class PedidoServices {


    private  final PedidoRepository pedidoRepository;





    public List<Pedido > findAll() {

        return  pedidoRepository.findAll();
    }
     public Pedido create(Pedido pedido) {
        pedido.setDataCompra(Instant.now());

        return  pedidoRepository.save(pedido);
    }
}
