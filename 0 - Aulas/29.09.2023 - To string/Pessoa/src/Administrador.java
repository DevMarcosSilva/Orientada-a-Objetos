public class Administrador extends Empregado  {
    private double ajudaDeCusto;

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }
    
    @Override
    public double calcularSalario() {
        double salarioFinal = super.calcularSalario() + getAjudaDeCusto();
        return salarioFinal;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAjuda de custo: " + getAjudaDeCusto() + "\nSalario final: " + calcularSalario();
    }
}
