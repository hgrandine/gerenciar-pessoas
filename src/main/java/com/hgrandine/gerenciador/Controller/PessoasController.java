package com.hgrandine.gerenciador.Controller;

import com.hgrandine.gerenciador.Dto.PessoasIdentificadorDto;
import com.hgrandine.gerenciador.Dto.PessoasSenhaDto;
import com.hgrandine.gerenciador.Service.PessoaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoasController {
    PessoaService service = new PessoaService();
    
    @PostMapping("/cadastrar")
    public void postPessoas(@RequestBody PessoasIdentificadorDto pessoa){
        PessoaService.save(pessoa);
    }

    @GetMapping("/pessoas")
    @ResponseBody
    public List<PessoasSenhaDto> getPessoas(@RequestParam(name = "id", required = false) Integer id){
        List<PessoasSenhaDto> pessoas = null;
        if (id != null){
            pessoas.add(service.listarPessoasNotaID(id));
        }else{
            pessoas = service.listarPessoasNota();
        }
        return pessoas;
    }

}
