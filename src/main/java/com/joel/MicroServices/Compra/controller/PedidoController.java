package com.joel.MicroServices.Compra.controller;

import com.joel.MicroServices.Compra.model.Pedido;
import com.joel.MicroServices.Compra.services.PedidoServices;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping(value = "pedido")
public class PedidoController {


    private  final PedidoServices pedidoServices;

    public PedidoController(PedidoServices pedidoServices) {
        this.pedidoServices = pedidoServices;
    }


    @GetMapping
    public ResponseEntity<List<Pedido>> findAll() {
        return  ResponseEntity.ok().body(pedidoServices.findAll());
    }

    @PostMapping()
    public ResponseEntity<Pedido> create(@RequestBody Pedido pedido) {
        final var cre = pedidoServices.create(pedido);
        return  ResponseEntity.ok().body(cre);
    }
}
