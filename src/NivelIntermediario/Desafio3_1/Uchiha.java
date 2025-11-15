package NivelIntermediario.Desafio3_1;

public class Uchiha extends Ninja {

    public static String specialAbility = "Sharingan";

    public Uchiha() {
    }

    public String getSpecialAbility() {
        return specialAbility;
    }


    @Override
    public String showInfo() {
        return super.showInfo() + "Special Skill: " + getSpecialAbility();
    }
}

