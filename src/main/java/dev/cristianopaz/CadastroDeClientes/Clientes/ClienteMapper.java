package dev.cristianopaz.CadastroDeClientes.Clientes;

import org.springframework.stereotype.Component;

@Component
public class ClienteMapper {

    public ClienteModel map(ClienteDTO clienteDTO) {
        ClienteModel clienteModel = new ClienteModel();
        clienteModel.setId(clienteDTO.getId());
        clienteModel.setNome(clienteDTO.getNome());
        clienteModel.setEmail(clienteDTO.getEmail());
        clienteModel.setTelefone(clienteDTO.getTelefone());
        clienteModel.setServicos(clienteDTO.getServicos());
        clienteModel.setImgUrl(clienteDTO.getImgUrl());

        return clienteModel;
    }

    public ClienteDTO map (ClienteModel clienteModel) {

        ClienteDTO clienteDTO = new ClienteDTO();
        clienteDTO.setId(clienteModel.getId());
        clienteDTO.setNome(clienteModel.getNome());
        clienteDTO.setEmail(clienteModel.getEmail());
        clienteDTO.setTelefone(clienteModel.getTelefone());
        clienteDTO.setServicos(clienteModel.getServicos());
        clienteDTO.setImgUrl(clienteModel.getImgUrl());

        return clienteDTO;
    }

}
