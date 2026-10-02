package dev.cristianopaz.CadastroDeClientes.Clientes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class ClienteController {

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Essa é minha primeira mensagem nessa rota";
    }

    // Adicionar Cliente (Create)
    @PostMapping("/criar")
    public String criarCliente() {
        return "Cliente criado";
    }

    // Mostrar todos os Clientes (Read)
    @GetMapping("/todos")
    public String mostrarTodosOsClientes() {
        return "Mostrar Cliente";
    }

    // Mostrar clientes por id (Read)
    @GetMapping("/todosID")
    public String mostrarTodosOsClientesPorId() {
        return "Mostrar Cliente por id";
    }

    // Alterar dados dos Clientes (Update)
    @PutMapping("/alterarID")
    public String alterarClientePorId() {
        return "Alterar Cliente por id";
    }

    // Deletar Cliente (Delete)
    @DeleteMapping("/deletarID")
    public String deletarClientePorId() {
        return "Cliente deletado por id";
    }
}