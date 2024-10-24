package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.SetorDTO;
import com.example.demo.services.SetorService;

@RestController
@RequestMapping("/setores")
public class SetorController {
    @Autowired
    private SetorService setorService;

    @PostMapping
    public void adicionar(@RequestBody SetorDTO setor) {
        setorService.adicionar(setor.toEntity());
    }

    @GetMapping("/{id}")
    public SetorDTO buscarPorId(@PathVariable Long id) {
        return SetorDTO.fromEntity(setorService.buscarSetorPorId(id));
    }
}

