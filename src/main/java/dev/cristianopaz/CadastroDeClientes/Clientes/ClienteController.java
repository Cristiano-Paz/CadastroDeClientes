package dev.cristianopaz.CadastroDeClientes.Clientes;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Essa é minha primeira mensagem nessa rota";
    }

    // Adicionar Cliente (Create)
    @PostMapping("/criar")
    public ClienteDTO criarCliente(@RequestBody ClienteDTO cliente) {
        return clienteService.criarCliente(cliente);
    }

    // Mostrar todos os Clientes (Read)
    @GetMapping("/listar")
    public List<ClienteModel> listarClientes() {
        return clienteService.listarClientes();
    }

    // Mostrar clientes por id (Read)
    @GetMapping("/listar/{id}")
    public ClienteModel listarClientesPorId(@PathVariable Long id) {
        return clienteService.listarClientesPorId(id);
    }

    // Alterar dados dos Clientes (Update)
    @PutMapping("/alterar/{id}")
    public ClienteModel alterarClientePorId(@PathVariable Long id, @RequestBody ClienteModel clienteAtualizado) {
        return clienteService.atualizarCliente(id, clienteAtualizado);
    }

    // Deletar Cliente (Delete)
    @DeleteMapping("/deletar/{id}")
    public void deletarClientePorId(@PathVariable Long id) {
        clienteService.deletarClientePorId(id);
    }
}