package NivelIntermediario.Desafio3_1;

public class Ninja {
    private String name;
    private int age;
    private String mission;
    private String rank;
    private String status;

    public Ninja() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMission() {
        return mission;
    }

    public void setMissao(String mission) {
        this.mission = mission;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String showInfo() {
        return "\n------ Ninja Information ------" +
                "\nName: " + this.name +
                "\nAge: " + this.age +
                "\nMission: " + this.mission +
                "\nRank: " + this.rank +
                "\nStatus: " + this.status +
                "\n";
    }
}
