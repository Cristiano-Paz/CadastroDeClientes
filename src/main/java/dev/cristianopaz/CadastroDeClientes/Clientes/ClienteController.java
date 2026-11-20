package dev.cristianopaz.CadastroDeClientes.Clientes;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<String> criarCliente(@RequestBody ClienteDTO cliente) {
        ClienteDTO novoCliente = clienteService.criarCliente(cliente);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Cliente criado com sucesso: " + novoCliente.getNome() + "(ID): " + novoCliente.getId());
    }

    // Mostrar todos os Clientes (Read)
    @GetMapping("/listar")
    public ResponseEntity <List<ClienteDTO>> listarClientes() {
        List<ClienteDTO> clientes = clienteService.listarClientes();
        return ResponseEntity.ok(clientes);
    }

    // Mostrar clientes por id (Read)
    @GetMapping("/listar/{id}")
    public ResponseEntity<?> listarCliente(@PathVariable Long id) {
        ClienteDTO cliente = clienteService.listarClientesPorId(id);
        if (cliente !=null) {
                return ResponseEntity.ok (cliente);
        } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND)
                        .body("Cliente com id: " + " não existe nos registros ");
            }
    }


    // Alterar dados dos Clientes (Update)
    @PutMapping("/alterar/{id}")
    public ResponseEntity<?> alterarClientePorId(@PathVariable Long id, @RequestBody ClienteDTO clienteAtualizado) {
        ClienteDTO cliente = clienteService.atualizarCliente(id, clienteAtualizado);
        if (cliente != null) {
            return ResponseEntity.ok(cliente);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Cliente com id " + id + "não encontardo ");
        }
    }

    // Deletar Cliente (Delete)
    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<String> deletarClientePorId(@PathVariable Long id) {
        if (clienteService.listarClientesPorId(id) != null) {
            clienteService.deletarClientePorId(id);
            return ResponseEntity.ok("Cliente com o ID " + id + "deletado com sucesso ");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("O cliente com id " + id + " não encontrado ");
        }
    }
}