package dev.cristianopaz.CadastroDeClientes.Clientes;

import dev.cristianopaz.CadastroDeClientes.Servicos.ServicosModel;
import jakarta.persistence.*;

// Entity ele transforma uma classe em uma entidade do DB.ee
@Entity
@Table(name = "tb_cadastro")
public class ClienteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String sexo;
    private int telefone;

    //@ManyToOne um cliente tem um serviço por vez
    @ManyToOne
    @JoinColumn(name = "servicos_id") // Foreing Key ou chave estrangeira
    private ServicosModel servicos;

    public ClienteModel() {
    }

    public ClienteModel(String email, String nome, String sexo, int telefone) {
        this.email = email;
        this.nome = nome;
        this.sexo = sexo;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
}
