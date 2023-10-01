public class PokemonWater extends PokemonFire {
    public PokemonWater(String name, int level, int hp, int xp, int weight, String food, String sound, String attack) {
        super(name, level, hp, xp, weight, food, sound, attack);
    }

    public String hydroCanon() {
        return attack;
    }

    public String rainDance() {
        return attack;
    }

}
