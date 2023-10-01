public class PokemonGrass extends PokemonFire {
    public PokemonGrass(String name, int level, int hp, int xp, int weight, String food, String sound, String attack) {
        super(name, level, hp, xp, weight, food, sound, attack);
    }

    public String leafStorm() {
        return attack;
    }

    public String leaveBlade() {
        return attack;
    }
}
