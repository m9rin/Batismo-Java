package NivelBasico.Desafio1;

public class MissionServices {
    public void missionValidation(Mission mission, Ninja ninja) {
        if (ninja.getAge() < 15 && (RankEnum.S.equals(mission.getRank()) || RankEnum.A.equals(mission.getRank()) || RankEnum.B.equals(mission.getRank()))) {
            System.out.println("Name: " + ninja.getName());
            System.out.println("Age: " + ninja.getAge());
            System.out.println("Mission: " + mission.getMissionName());
            System.out.println("Rank: " + mission.getRank());
            System.out.println("Status: " + StatusEnum.UNAUTHORIZED);
        } else {
            System.out.println("Name: " + ninja.getName());
            System.out.println("Age: " + ninja.getAge());
            System.out.println("Mission: " + mission.getMissionName());
            System.out.println("Rank: " + mission.getRank());
            System.out.println("Status: " + StatusEnum.IN_PROGRESS);
        }
        System.out.println();
    }
}
