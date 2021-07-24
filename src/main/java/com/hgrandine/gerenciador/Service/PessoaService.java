package com.hgrandine.gerenciador.Service;

import com.hgrandine.gerenciador.Dto.PessoasDto;
import com.hgrandine.gerenciador.Repository.PessoaRepository;

public class PessoaService {
    
    private static PessoaService repository;
    
    public static void save(PessoasDto pessoa) {
        if(pessoa.getTipoIdentificador().isEmpty()){
            throw new IllegalArgumentException("Capo deve ser preenchido!");
        }
        if(pessoa.getIdentificador().length() == 11){
            System.out.print("cpf");
        } else if(pessoa.getIdentificador().length() == 14){
            System.out.print("cnpj");
        }else{
            throw new IllegalArgumentException("Capo deve ser preenchido corretamente!");
        }
        repository.save(pessoa);
    }
}
