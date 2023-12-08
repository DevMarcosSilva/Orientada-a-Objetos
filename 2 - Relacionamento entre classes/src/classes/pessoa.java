package classes;
import java.util.ArrayList;

public class pessoa {
    private String nome;
    private String cpf;
    private String email;
    private endereco endereco;
    private ArrayList<telefone> telefones;

    public pessoa() {
        telefones = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(ArrayList<telefone> telefones) {
        this.telefones = telefones;
    }

    public endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(endereco endereco) {
        this.endereco = endereco;
    }

    public void imprimir() {
        System.out.printf("Nome: %s\nCPF: %s\nEmail: %s\n", nome, cpf, email);
        endereco.imprimirEndereco();
        System.out.println("Telefones:");
        for (telefone telefone : telefones) {
            telefone.imprimirTelefone();
        }
    }
}
