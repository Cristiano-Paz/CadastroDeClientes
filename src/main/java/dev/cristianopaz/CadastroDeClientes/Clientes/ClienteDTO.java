package dev.cristianopaz.CadastroDeClientes.Clientes;

import dev.cristianopaz.CadastroDeClientes.Servicos.ServicosModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDTO {

    private Long id;
    private String nome;
    private String email;
    private String imgUrl;
    private String telefone;
    private ServicosModel servicos;

}
