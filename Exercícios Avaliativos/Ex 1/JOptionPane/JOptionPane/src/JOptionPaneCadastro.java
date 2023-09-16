import javax.swing.JOptionPane;


public class JOptionPaneCadastro {
    public static void main(String[] args) {
        // Cadastro de Pessoa
        String nomePessoa = JOptionPane.showInputDialog("Cadastro de Pessoa\nInforme o nome:");
        String idadePessoaStr = JOptionPane.showInputDialog("Informe a idade:");
        int idadePessoa = Integer.parseInt(idadePessoaStr);

        // Cadastro de Veículo
        String marcaVeiculo = JOptionPane.showInputDialog("Cadastro de Veículo\nInforme a marca do veículo:");
        String modeloVeiculo = JOptionPane.showInputDialog("Informe o modelo do veículo:");

        // Cadastro de Pet
        String nomePet = JOptionPane.showInputDialog("Cadastro de Pet\nInforme o nome do pet:");
        String especiePet = JOptionPane.showInputDialog("Informe a espécie do pet:");

        // Exibindo os dados cadastrados
        String mensagemPessoa = "Dados da Pessoa:\nNome: " + nomePessoa + "\nIdade: " + idadePessoa;
        String mensagemVeiculo = "Dados do Veículo:\nMarca: " + marcaVeiculo + "\nModelo: " + modeloVeiculo;
        String mensagemPet = "Dados do Pet:\nNome: " + nomePet + "\nEspécie: " + especiePet;

        JOptionPane.showMessageDialog(null, mensagemPessoa, "Cadastro de Pessoa", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, mensagemVeiculo, "Cadastro de Veículo", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, mensagemPet, "Cadastro de Pet", JOptionPane.INFORMATION_MESSAGE);
    }
}
