package trello.enums;

public enum TrelloBoardConstant {
    ID("id"),
    NAME("name"),
    DESCRIPTION("desc"),
    CLOSED("closed");

    String constantName;

    TrelloBoardConstant(String constantName) {
        this.constantName = constantName;
    }

    public String getConstantName() {
        return constantName;
    }
}
