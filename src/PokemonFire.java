public abstract class PokemonFire extends PokeMonGeneric {
    public PokemonFire(String name, int level, int hp, int xp, int weight, String food, String sound, String attack) {
        super(name, level, hp, xp, weight, food, sound, attack);
    }

    public String getFireLash() {
        return attack;
    }

    public String flameThrower() {
        return attack;
    }

    public String pyroBall() {
        return attack;
    }

}
