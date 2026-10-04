package dev.cristianopaz.CadastroDeClientes.Servicos;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("servicos")
public class ServicosController {

    // GET -- Mandar uma requisao para mostrar os servico
    @GetMapping("listar")
    public String listarServico() {
        return "Servico listados com sucesso";
    }

    // Post -- Mandar uma requisao para criar os servicos
    @PostMapping("/criar")
    public String criarServico(){
        return "Servico criado com sucesso";
    }

    // Put -- Mandar uma requisao para alterar os servicos
    @PutMapping("/alterar")
    public String alterarServico() {
        return "Servico alterado com sucesso";
    }

    // Delete -- Mandar uma requisao para deletar os servicos
    @DeleteMapping("/deletar")
    public String deletarServico() {
        return "Servico deletado com sucesso";
    }
}
