package com.example.crud.service;

import com.example.crud.model.Topico;
import com.example.crud.repository.ITopico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class TopicoService {
    @Autowired
    ITopico iTopico;

    public ArrayList<Topico> obtenerTopicos(){
        return (ArrayList<Topico>) iTopico.findAll();
    }

    public Topico guardarTopico(Topico topico){
        return iTopico.save(topico);
    }

    public Optional<Topico> getById(Long id){
        return iTopico.findById(id);
    }

    public Topico actualizarTopico(Topico request, Long id){
        Topico topico = iTopico.findById(id).get();

        topico.setTitulo(request.getTitulo());
        topico.setMensaje(request.getMensaje());
        topico.setStatus(request.getStatus());
        topico.setAutor(request.getAutor());
        topico.setCurso(request.getCurso());
        topico = iTopico.save(topico);
        return topico;
    }

    public Boolean borrarTopico(Long id){
        try {
            iTopico.deleteById(id);
            return true;
        }catch(Exception e){
            return false;
        }
    }

}
