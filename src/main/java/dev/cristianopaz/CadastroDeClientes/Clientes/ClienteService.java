package dev.cristianopaz.CadastroDeClientes.Clientes;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    private ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }
    // Listar todos os meus clientes
    public List<ClienteModel> listarClientes() {
        return clienteRepository.findAll();
    }

    // Listar todos os meus clientes por ID
    public ClienteModel listarClientesPorId(Long id) {
        Optional<ClienteModel> clientePorId = clienteRepository.findById(id);
        return clientePorId.orElse(null);
    }

    // Criar um novo cliente
    public ClienteModel criarCliente(ClienteModel cliente) {
        return clienteRepository.save(cliente);
    }

    // Deletar o cliente - Tem que ser um metodo Void
    public void deletarClientePorId(Long id) {
        clienteRepository.deleteById(id);
    }

    // Atualizar cliente
    public ClienteModel atualizarCliente(Long id, ClienteModel clienteAtualizado) {
        if (clienteRepository.existsById(id)) {
            clienteAtualizado.setId(id);
            return  clienteRepository.save(clienteAtualizado);
        }
        return  null;
    }

}
