import classe.cachorro;
import classe.peixe;

public class App {
    public static void main(String[] args) {
        peixe peixe1 = new peixe("Baiacu", 47.0);
        peixe1.setTipoHabitat("água doce");

        cachorro cachorro1 = new cachorro("vira-lata", 7.0);
        cachorro1.setRaca("pit-bull");

        System.out.println("Dados Peixe:");
        System.out.println("Nome: " +peixe1.getNome() + "\npeso: " +peixe1.getPeso()+ "\nTipo Habitat " +peixe1.getTipoHabitat());

        System.out.println("\n");
        System.out.println("Dados cachorro:");
        System.out.println("Nome: "+cachorro1.getNome() + "\npeso: "+cachorro1.getPeso() + "\n Raca: "+cachorro1.getRaca());
    }

}
