package com.example.demo.repositories;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.models.Projeto;

public interface ProjetoRepository extends JpaRepository<Projeto, Integer> {
    @Query("SELECT p FROM Projeto p JOIN FETCH p.funcionarios WHERE p.id = :id")
    Projeto findProjetoWithFuncionariosById(@Param("id") Integer id);

    @Query("SELECT p FROM Projeto p WHERE p.dataInicio BETWEEN :startDate AND :endDate")
    List<Projeto> findProjetosByDataInicioBetween(@Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate);
}

