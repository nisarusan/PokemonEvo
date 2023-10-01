import java.util.*;
public class Main {
    public static void main(String[] args) {
        PokemonFire Charizard = new PokemonFire("Charizard", 5, 100, 85, 100, "Grass", "Charisard", "fireLash") {
        };
        System.out.println(Charizard.getFireLash());
        PokemonWater Blastoise = new PokemonWater("Blastoise", 5, 150, 65, 150, "Grass", "Blastois", "rainDance");
        System.out.println(Blastoise.rainDance());
        System.out.println(Charizard.getName() + "  voert een aanval uit op " +  Blastoise.getName() + " en doet een " + Charizard.attack);
        System.out.println("Welke Pokemon wil je gebruiken");
        Scanner input = new Scanner(System.in);
        String Pokemon = input.nextLine();
        System.out.println("Welke level heeft pokemon");
        int PokemonLevel = input.nextInt();
        if(PokemonLevel > 5) {
           String attack = "rainDance";
            PokemonWater Bubblesaur = new PokemonWater(Pokemon, PokemonLevel, 150, 65, 150, "Grass", "Blastois", attack);
        }
        System.out.println(Pokemon + " " +  PokemonLevel);

    }

}
