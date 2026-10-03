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
    @Column (name = "id")
    private Long id;

    @Column (name = "nome")
    private String nome;

    @Column (unique = true)
    private String email;

    @Column (name = "img_url")
    private String imgUrl;

    @Column (name = "telefone")
    private String telefone;

    //@ManyToOne um cliente tem um serviço por vez
    @ManyToOne
    @JoinColumn(name = "servicos_id") // Foreing Key ou chave estrangeira
    private ServicosModel servicos;

}
