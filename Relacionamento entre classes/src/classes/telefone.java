package classes;

public class telefone {
    private String tipo;
    private String ddd;
    private String numero;

    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo() {
        return tipo;
    }
    public void setDdd(String ddd) {
        this.ddd = ddd;
    }
    public String getDdd() {
        return ddd;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getNumero() {
        return numero;
    }

    public void imprimirTelefone() {
        System.out.printf("Telefone (%s): (%s)(%s)\n", tipo, ddd, numero);
    }
}