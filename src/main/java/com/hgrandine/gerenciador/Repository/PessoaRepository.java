package com.hgrandine.gerenciador.Repository;

import com.hgrandine.gerenciador.Domain.Pessoa;
import com.hgrandine.gerenciador.Dto.PessoasIdentificadorDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {
}
