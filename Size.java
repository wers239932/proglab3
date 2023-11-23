public enum Size {
    SMALL("smol"),
    MEDIUM("medium"),
    HUUUGE("big");

    private String type;

    Size(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}
