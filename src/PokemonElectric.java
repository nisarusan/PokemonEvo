public class PokemonElectric extends PokemonGrass {
    public PokemonElectric(String name, int level, int hp, int xp, int weight, String food, String sound, String attack) {
        super(name, level, hp, xp, weight, food, sound, attack);
    }

    public String electroBall() {
        return attack;
    }

    public String thunder() {
        return attack;
    }
}
