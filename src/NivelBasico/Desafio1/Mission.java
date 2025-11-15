package NivelBasico.Desafio1;

public class Mission {
    private String missionName;
    private RankEnum rank;

    public Mission(String missionName, RankEnum rank) {
        this.missionName = missionName;
        this.rank = rank;
    }

    public String getMissionName() {
        return this.missionName;
    }

    public void setMissionName(String missionName) {
        this.missionName = missionName;
    }

    public RankEnum getRank() {
        return this.rank;
    }

    public void setRank(RankEnum rank) {
        this.rank = rank;
    }

    public Mission() {}
}
