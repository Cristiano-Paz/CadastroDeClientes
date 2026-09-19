package dev.cristianopaz.CadastroDeClientes;

import jakarta.persistence.*;

// Entity ele transforma uma classe em uma entidade do DB.
@Entity
@Table(name = "tb_cadastro")
public class ClienteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String sexo;
    private int idade;
    private int telefone;

    public ClienteModel() {
    }

    public ClienteModel(String email, String nome, String sexo, int idade, int telefone) {
        this.email = email;
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
}
