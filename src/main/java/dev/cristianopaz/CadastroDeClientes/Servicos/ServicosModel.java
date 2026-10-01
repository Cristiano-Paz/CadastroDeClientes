package dev.cristianopaz.CadastroDeClientes.Servicos;

import dev.cristianopaz.CadastroDeClientes.Clientes.ClienteModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_servicos")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ServicosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String valor;

    //@OneToMany - Um serviço pode ter varios clientes
    @OneToMany(mappedBy = "servicos")
    private List<ClienteModel> clientes;



}
