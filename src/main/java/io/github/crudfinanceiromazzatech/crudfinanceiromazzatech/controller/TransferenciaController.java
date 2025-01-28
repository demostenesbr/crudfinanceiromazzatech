package io.github.crudfinanceiromazzatech.CrudFinanceiroMazzatech.controller;

import io.github.crudfinanceiromazzatech.CrudFinanceiroMazzatech.model.Transferencia;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("transferencias")
public class TransferenciaController {

    public void salvar(Transferencia transferencia){
        System.out.println("Transferencia recebida: " + transferencia);
    }
}
