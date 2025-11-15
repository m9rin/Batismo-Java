package NivelBasico.Desafio1;

public class Main {
    public static void main(String[] args) {

        Ninja naruto = new Ninja();
        naruto.setName("Naruto Uzumaki");
        naruto.setAge(15);
        naruto.setVillage("Konoha");

        Mission missionTest = new Mission();
        missionTest.setMissionName("Kill Akatsuki");
        missionTest.setRank(RankEnum.S);

        MissionServices missionServices = new MissionServices();
        missionServices.missionValidation(missionTest, naruto);
    }
}
