public class PokeMonGeneric {

    //instance fields generic that shares with all pokemon Dna
    private String name;
    int level;
    int hp;
    int xp;
    private int weight;
    String food;
    String sound;
    String attack;


    // generic Pokemon Constructor
    public PokeMonGeneric(String name, int level, int hp, int xp, int weight, String food, String sound, String attack) {

        this.name = name;
        this.level = level;
        this.hp = hp;
        this.xp = xp;
        this.weight = weight;
        this.food = food;
        this.sound = sound;
        this.attack = attack;
    }


    // Methods to retrieve instance fields
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getFood() {
        return food;
    }

    public void setFood() {
        this.food = food;
    }

    public String getSound() {
        return sound;
    }

    public void setSound() {
        this.sound = sound;
    }

}

