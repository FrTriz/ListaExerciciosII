package q1c;
public class ProgramaAnimal {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 =new Animal();

        animal1.cadastrarAnimal("Tarântula-golias","11/03/2023","Anha",345,"Floresta Amazônica");
        animal2.cadastrarAnimal("Girafa","18/09/2015","Hanna",678,"Zoológico de Salvador");

        System.out.println("Dados do animal 1:");
        animal1.status();
        System.out.println("\n\nDados do animal 2:");
        animal2.status();

        animal1.editarAnimal("Tarântula-golias","23/09/2023","Florzinha",345,"Floresta Amazônica");
        animal2.editarAnimal("Macaco Prego","18/09/2020","Hanna",678,"Zoológico de Salvador");

        System.out.println("\n\nDados do animal 1 depois da edição:");
        animal1.status();
        System.out.println("\n\nDados do animal 2 depois da edição:");
        animal2.status();
    }
}
