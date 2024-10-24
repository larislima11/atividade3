package com.example.demo.dto;

import com.example.demo.models.Setor;

public class SetorDTO {
    private String nome;

    public Setor toEntity() {
        Setor setor = new Setor();
        setor.setNome(this.nome);
        return setor;
    }

    public static SetorDTO fromEntity(DadosSetorDTO dadosSetorDTO) {
        SetorDTO dto = new SetorDTO();
        dto.setNome(dadosSetorDTO.getNome());
        return dto;
    }

    private void setNome(Object nome2) {
      
        throw new UnsupportedOperationException("Unimplemented method 'setNome'");
    }

  
}
