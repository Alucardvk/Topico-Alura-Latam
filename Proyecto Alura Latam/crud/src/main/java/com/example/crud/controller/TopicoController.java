package com.example.crud.controller;

import com.example.crud.model.Topico;
import com.example.crud.service.TopicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/topico")
public class TopicoController {

    @Autowired
    private TopicoService topicoService;

    @GetMapping
    public ArrayList<Topico> obtenerTopicos() {
        return this.topicoService.obtenerTopicos();
    }

    @PostMapping
    public Topico guardarTopico(@RequestBody Topico topico) {
        return this.topicoService.guardarTopico(topico);
    }

    @GetMapping(path = "/{id}")
    public Optional<Topico> obtenerTopicoPorId(@PathVariable("id") Long id) {
        return this.topicoService.getById(id);
    }

    @PutMapping(path = "/{id}")
    public Topico actualizarTopico(@RequestBody Topico request,@PathVariable("id") Long id){
        return this.topicoService.actualizarTopico(request,id);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarTopicoPorId(@PathVariable("id") Long id){
        boolean eliminarTopico = this.topicoService.borrarTopico(id);

        if ( eliminarTopico){
            return "Topico con el id "+id+"fue elminado";
        }else{
            return "Error";
        }
    }
}
