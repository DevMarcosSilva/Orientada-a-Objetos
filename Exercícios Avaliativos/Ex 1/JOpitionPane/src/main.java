import javax.swing.JOptionPane;
import classes.cadastro;

public class main {
    public static void main(String[] args) throws Exception {
        String mensagem ="      Olá seja bem vindo ";
        String mensagem2 = "Ok ainda preciso de mais alguns dados, vamos lá!";
        String mensagemfinal=" Cadastro realizado com sucesso para visualizar clique em ok";
        
        cadastro pessoa1 = new cadastro();

        JOptionPane.showMessageDialog(null, mensagem,"Cadastro",JOptionPane.INFORMATION_MESSAGE);
        pessoa1.nome = JOptionPane.showInputDialog("Informe seu nome Primeiro Nome : " );
        pessoa1.sobrenome = JOptionPane.showInputDialog(""+pessoa1.nome+" Agora Informe seu Sobrenome ");
        JOptionPane.showMessageDialog(null, mensagem2, "Continuar",JOptionPane.INFORMATION_MESSAGE);
        pessoa1.veiculo = JOptionPane.showInputDialog(""+pessoa1.nome+" você possui algum automóvel se sim informe o modelo caso contário digite Não ");
        pessoa1.idade = Integer.parseInt(JOptionPane.showInputDialog(""+pessoa1.nome+" informe sua idade"));
        JOptionPane.showMessageDialog(null, mensagemfinal, "Cadastro realizado!!",JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showMessageDialog(null,"Nome: "+pessoa1.nome+"\nSobrenome: "+pessoa1.sobrenome+"\nAutomóvel: "+pessoa1.veiculo+"\nIdade: "+pessoa1.idade);
        
    }
}
