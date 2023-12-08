public class Fornecedor extends Pessoa {
    private double valorCredito;
    private double valorDivida;

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public double obterSaldo() {
        double saldo = getValorCredito() - getValorDivida();
        return saldo;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCrédito: " + getValorCredito() + "\nValor dívida: " + getValorDivida() + "\nSaldo: " + obterSaldo();
    }
}
