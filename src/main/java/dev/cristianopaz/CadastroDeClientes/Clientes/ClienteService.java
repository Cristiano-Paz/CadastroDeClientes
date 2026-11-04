package dev.cristianopaz.CadastroDeClientes.Clientes;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    private ClienteRepository clienteRepository;
    private ClienteMapper clienteMapper;

    public ClienteService(ClienteRepository clienteRepository, ClienteMapper clienteMapper) {
        this.clienteRepository = clienteRepository;
        this.clienteMapper = clienteMapper;
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
    public ClienteDTO criarCliente(ClienteDTO clienteDTO) {
       ClienteModel cliente = clienteMapper.map(clienteDTO);
       cliente = clienteRepository.save(cliente);
       return clienteMapper.map(cliente);
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
