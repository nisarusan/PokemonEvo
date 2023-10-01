import java.util.*;
public class Main {
    public static void main(String[] args) {
        PokemonFire Charizard = new PokemonFire("Charizard", 5, 100, 85, 100, "Grass", "Charisard", "fireLash") {
        };
        System.out.println(Charizard.getFireLash());
        PokemonWater Blastoise = new PokemonWater("Blastoise", 5, 150, 65, 150, "Grass", "Blastois", "rainDance");
        System.out.println(Blastoise.rainDance());
        System.out.println(Charizard.getName() + "  voert een aanval uit op " +  Blastoise.getName() + " en doet een " + Charizard.attack);
    }



//    Weet je niet wat voor variabelen je jouw klassen kunt meegeven? Denk eens aan:
//
//    name
//            level
//    hp (health points)
//    xp (experience points)
//    height
//            weight
//    food
//            sound
//    defence
//            attack
//    special
//            accuracy
//    Pokèmon kunnen ook ontzettend veel verschillende acties uitvoeren. Zo kun je denken aan de volgende methodes:
//
//    eats()
//    speaks()
//    thunderPunch()
//    cometPunch()
//    surf()
//    leafStorm()
//    inferno()
//    electroBall()
//    pyroBall*()
//    solarBeam()
//    hydroPump()
//    thunder()
//    hydroCanon()
//    fireLash()
//    leechSeed()
//    voltTackle()
//    rainDance()
//    leaveBlade()
//    flameThrower()
//    pound()
//    scratch()
//    gust()
//    hornAttack()
//    psyBeam()

}
