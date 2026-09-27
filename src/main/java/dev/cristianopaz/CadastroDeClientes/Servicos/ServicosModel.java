package dev.cristianopaz.CadastroDeClientes.Servicos;

import dev.cristianopaz.CadastroDeClientes.Clientes.ClienteModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_servicos")
public class ServicosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeDoServico;

    private String valorDoServico;

    //@OneToMany - Um serviço pode ter varios clientes
    @OneToMany(mappedBy = "servicos")
    private List<ClienteModel> clientes;



}
