package dev.cristianopaz.CadastroDeClientes.Clientes;

import dev.cristianopaz.CadastroDeClientes.Servicos.ServicosModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Entity ele transforma uma classe em uma entidade do DB.ee
@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ClienteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @Column(unique = true)
    private String email;
    private String sexo;
    private int telefone;

    //@ManyToOne um cliente tem um serviço por vez
    @ManyToOne
    @JoinColumn(name = "servicos_id") // Foreing Key ou chave estrangeira
    private ServicosModel servicos;

}
