package com.example.demo.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Setor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
  

    @OneToMany(mappedBy = "setor")
    private List<Funcionario> funcionarios;


    public void setNome(String string) {
        
        throw new UnsupportedOperationException("Unimplemented method 'setNome'");
    }


    public Object getNome() {
     
        throw new UnsupportedOperationException("Unimplemented method 'getNome'");
    }

}

