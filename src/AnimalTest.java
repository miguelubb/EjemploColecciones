import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class AnimalTest {
    public static void main(String[] args) {
        Animal[] animales=new Animal[100];
        String[] razas={"Hamster", "Perro", "Gato", "Pato", "Conejo","Tortuga"};
        String[] nombres={"Odie ", "Snoopy", "Slinky", "Toto", "Balto", "Marley ",
                "Bolt ", "Golfo ", "Pongo ", "Beethoven ", "Hachiko ", "Benji ",
                "Scooby ", "Clifford ", "Astro ", "Goofy ", "Chip ", "Einstein ",
                "Fang", "Frank ", "Rin Tin Tin ", "Milo ", "Truman ", "Uggie ",
                "Bingo ", "Blue ", "Cometa ", "Krypto", "Max", "Huesos"};
        for (int i = 0; i < 100; i++) {
            animales[i]=new Animal(i,
                    nombres[random(nombres.length)],
                    razas[random(razas.length)],
                    LocalDateTime.now());
        }

        for (Animal animal : animales) {
            System.out.println(animal);
        }

        ArrayList<Animal> patos=new ArrayList<>();
        for (Animal animal : animales) {
            if(animal.getRaza().trim().equalsIgnoreCase("Pato")){
                patos.add(animal);
            }
        }

        System.out.println("Lista de patos ("+patos.size()+")");
        for (Animal pato : patos) {
            System.out.println(pato);
        }

        if(patos.contains(animales[1])){
            System.out.println(animales[1].getId()+ " es un pato");
        }else{
            System.out.println(animales[1].getId()+ " NO es un pato");
        }

    }
    private static int random(int max){
        return (int)(Math.random()*max);
    }
}
