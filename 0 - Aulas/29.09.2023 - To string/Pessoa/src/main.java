import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception {
       
        
        Fornecedor f = new Fornecedor(); // Deve começar com letra maiúscula
        Empregado e = new Empregado();
        Administrador a = new Administrador();
        /*System.out.println("Digite o nome : ");
        String nomeF = sc.nextLine();
        f.setNome(nomeF);
        System.out.println("Digite o endereço: ");
        String end = sc.nextLine();
        f.setEndereco(end);
        System.out.println("Digite o telefone: ");
        String tel = sc.nextLine();
        f.setTelefone(tel);
        System.out.println("Informe o crédito: ");
        double credito = sc.nextDouble();
        f.setValorCredito(credito);
        System.out.println("Informe a dívida: ");
        double divida = sc.nextDouble();
        f.setValorDivida(divida);

        System.out.println("Informações do Fornecedor: " + f.toString());
    }*/
    e.setNome("Maria");
    e.setSalarioBase(1000);
    e.setImposto(10);
   
    System.out.println("empregado"+e.toString());
    a.setSalarioBase(2000);
    a.setImposto(5);
    a.setAjudaDeCusto(500);
    System.out.println("adm"+a.toString());
}
}