package com.hgrandine.gerenciador.Repository;

import com.hgrandine.gerenciador.Dto.PessoasDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<PessoasDto, Integer> {
}
