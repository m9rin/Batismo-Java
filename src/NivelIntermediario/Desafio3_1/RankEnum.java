package NivelIntermediario.Desafio3_1;

public enum RankEnum {
    S("S"),
    A("A"),
    B("B"),
    C("C"),
    D("D"),
    EMPTY("-");

    private String description;

    RankEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static String fromString(String rank) {
        for (RankEnum rankEnum : RankEnum.values()) {
            if (rankEnum.description.equalsIgnoreCase(rank)) {
                return rankEnum.description;
            }
        }
        return EMPTY.description;
    }
}