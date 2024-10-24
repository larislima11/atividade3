package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.FuncionarioDTO;
import com.example.demo.models.Projeto;
import com.example.demo.services.FuncionarioService;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {
    @Autowired
    private FuncionarioService funcionarioService;

    @PostMapping
    public void adicionar(@RequestBody FuncionarioDTO funcionario) {
        funcionarioService.adicionar(funcionario.toEntity());
    }

    @GetMapping("/{id}/projetos")
    public List<Projeto> buscarProjetos(@PathVariable Long id) {
        return funcionarioService.buscarProjetos(id);
    }
}
