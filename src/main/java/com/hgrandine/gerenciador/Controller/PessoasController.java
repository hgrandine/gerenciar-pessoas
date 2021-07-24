package com.hgrandine.gerenciador.Controller;

import com.hgrandine.gerenciador.Dto.PessoasDto;
import com.hgrandine.gerenciador.Service.PessoaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pessoas")
public class PessoasController {
    
    @PostMapping("/cadastrar")
    public void postPessoas(@RequestBody PessoasDto pessoa){
        PessoaService.save(pessoa);
    }

}
