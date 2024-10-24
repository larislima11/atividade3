package com.example.demo.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    private Setor setor;

    @ManyToMany(mappedBy = "funcionarios")
    private List<Projeto> projetos;

    public void setNome(String string) {
     
        throw new UnsupportedOperationException("Unimplemented method 'setNome'");
    }

    public void setSetor(Setor setor1) {
      
        throw new UnsupportedOperationException("Unimplemented method 'setSetor'");
    }

    public Object getNome() {
  
        throw new UnsupportedOperationException("Unimplemented method 'getNome'");
    }

    public Object getSetor() {
       
        throw new UnsupportedOperationException("Unimplemented method 'getSetor'");
    }

}
