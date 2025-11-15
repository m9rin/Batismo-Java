package NivelBasico.Desafio2;

public class Ninja {
    private String name;
    private int age;
    private String village;
    private char rank;

    public Ninja(String name, int age) {
        this.name = name;
        this.age = age;
        this.village = "Lief Village";
        this.rank = 'D';
    }

    public Ninja() {
        this.village = "Lief Village";
        this.rank = 'D';
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return
                "\nName: " + this.name +
                "\nAge: " + this.age +
                "\nVillage: " + this.village +
                "\nRank: " + this.rank;
    }
}
