package NivelIntermediario.Desafio3_1;

public class Hyuga extends Ninja {
    public static String specialAbility = "Byakugan";

    public Hyuga() {
    }

    public String getSpecialAbility() {
        return specialAbility;
    }


    @Override
    public String showInfo() {
        return super.showInfo() + "Special Skill: " + getSpecialAbility();
    }
}

