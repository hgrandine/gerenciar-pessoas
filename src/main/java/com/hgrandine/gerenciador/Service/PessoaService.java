package com.hgrandine.gerenciador.Service;

import com.hgrandine.gerenciador.Domain.Pessoa;
import com.hgrandine.gerenciador.Dto.PessoasIdentificadorDto;
import com.hgrandine.gerenciador.Dto.PessoasSenhaDto;
import com.hgrandine.gerenciador.Repository.PessoaRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PessoaService {
    
    private static PessoaRepository repository;
    
    public void save(PessoasIdentificadorDto pessoa) {
        verificarIdentificador(pessoa);
        //adicionar senha e calculo da segurança
        save(pessoa);
    }

    public List<PessoasSenhaDto> listarPessoasNota(){
        PessoasSenhaDto pessoa;
        ArrayList<PessoasSenhaDto> retornoPessoas = new ArrayList<>();
        List<Pessoa> listaPessoas = repository.findAll();

        for (Pessoa p: listaPessoas) {
            pessoa = new PessoasSenhaDto();
            pessoa.setNome(p.getNome());
            pessoa.setNotaSenha(p.getNotaSenha());
            pessoa.setNotaNumericaSenha(p.getNotaNumericaSenha());

            retornoPessoas.add(pessoa);
        }

        return retornoPessoas;
    }

    public PessoasSenhaDto listarPessoasNotaID(int id){
        Pessoa p = repository.findById(id).get();
        PessoasSenhaDto pessoa = new PessoasSenhaDto();
        pessoa.setNome(p.getNome());
        pessoa.setNotaSenha(p.getNotaSenha());
        pessoa.setNotaNumericaSenha(p.getNotaNumericaSenha());

        return pessoa;
    }

    private static void verificarIdentificador(PessoasIdentificadorDto pessoa) {
        if(pessoa.getTipoIdentificador().isEmpty()){
            throw new IllegalArgumentException("Campo deve ser preenchido!");
        }
        if(pessoa.getIdentificador().length() == 11){
            System.out.print("cpf");
        } else if(pessoa.getIdentificador().length() == 14){
            System.out.print("cnpj");
        }else{
            throw new IllegalArgumentException("Campo deve ser preenchido corretamente!");
        }
    }
}
