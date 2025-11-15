package NivelIntermediario.Desafio3_1;

public enum StatusEnum {
    TO_DO("TO DO"),
    IN_PROGRESS("IN PROGRESS"),
    COMPLETED("COMPLETED"),
    EMPTY("-");

    private String description;

    StatusEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static String fromString(String status) {
        for (StatusEnum statusEnum : StatusEnum.values()) {
            if (statusEnum.description.equalsIgnoreCase(status)) {
                return statusEnum.description;
            }
        }
        return EMPTY.description;
    }
}
