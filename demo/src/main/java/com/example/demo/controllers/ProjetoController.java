package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ProjetoDTO;
import com.example.demo.services.DadosProjetoDTO;
import com.example.demo.services.ProjetoService;

@RestController
@RequestMapping("/projetos")
public class ProjetoController {
    @Autowired
    private ProjetoService projetoService;

    @PostMapping
    public void adicionar(@RequestBody ProjetoDTO projeto) {
        projetoService.adicionar(projeto.toEntity());
    }

    @GetMapping("/{id}")
    public ProjetoDTO buscarPorId(@PathVariable Long id) {
        DadosProjetoDTO projeto = projetoService.buscarProjetoPorId(id);
        return ProjetoDTO.fromEntity(projeto);
    }

    @PostMapping("/{idProjeto}/vincular-funcionario/{idFuncionario}")
    public void vincularFuncionario(@PathVariable Long idProjeto, @PathVariable Long idFuncionario) {
        projetoService.vincularFuncionario(idProjeto, idFuncionario);
    }
}


