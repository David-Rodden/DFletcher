package items;

public enum FletchingResources {
    LOGS("Logs"), OAK_LOGS("Oak logs"), WILLOW_LOGS("Willow logs"), MAPLE_LOGS("Maple logs"), YEW_LOGS("Yew logs"), MAGIC_LOGS("Magic logs");
    private final String name;

    FletchingResources(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
