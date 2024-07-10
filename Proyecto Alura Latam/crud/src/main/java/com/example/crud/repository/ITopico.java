package com.example.crud.repository;

import com.example.crud.model.Topico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITopico extends JpaRepository<Topico, Long> {

}
