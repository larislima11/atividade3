package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Funcionario;
import com.example.demo.models.Projeto;
import com.example.demo.models.Setor;
import com.example.demo.repositories.FuncionarioRepository;
import com.example.demo.repositories.SetorRepository;


@Service
public class FuncionarioService {
    @Autowired
    private FuncionarioRepository funcionarioRepository;
    
    @Autowired
    private SetorRepository setorRepository;

    
    public void adicionar(Funcionario funcionario) {
        funcionarioRepository.save(funcionario);
    }

   
    public List<Projeto> buscarProjetos(Long idFuncionario) {
        return funcionarioRepository.findProjetosByFuncionarioId(idFuncionario);
    }


    public void criarFuncionariosExemplo() {
        Setor setor1 = new Setor();
        setor1.setNome("Desenvolvimento");
        setorRepository.save(setor1);

        Setor setor2 = new Setor();
        setor2.setNome("Marketing");
        setorRepository.save(setor2);

        Funcionario funcionario1 = new Funcionario();
        funcionario1.setNome("João Silva");
        funcionario1.setSetor(setor1);  
        funcionarioRepository.save(funcionario1);

        Funcionario funcionario2 = new Funcionario();
        funcionario2.setNome("Maria Oliveira");
        funcionario2.setSetor(setor2);  
        funcionarioRepository.save(funcionario2);

        Funcionario funcionario3 = new Funcionario();
        funcionario3.setNome("Ana Pereira");
        funcionario3.setSetor(setor1);  
        funcionarioRepository.save(funcionario3);
    }
}
