package com.MarcoProyecto.demo.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class EjemploController {

    @GetMapping("/detalles_info")
    public String info(Map<String, Object> model) {
        model.put("Titulo", "Servidor en línea!");
        model.put("Servidor", "MarcoAlon");
        model.put("IP", "192.168.2.100");

        return "detalles_info";
    }

}
