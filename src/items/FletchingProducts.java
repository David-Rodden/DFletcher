package items;

public enum FletchingProducts {
    SHAFT("Arrow shaft", 1, 14), JAVELIN("Javelin shafts", 3, 15), SHORTBOW_U("Shortbow (u)", 5, 16), SHORTBOW("Shortbow", 14, 29), LONGBOW_U("Longbow (u)", 10, 17), LONGBOW("Longbow", 14, 29), STOCK("Crossbow stock", 9, 18),
    OAK_SHAFT("Arrow shaft", 15, 14), OAK_SHORTBOW_U("Oak shortbow (u)", 20, 15), OAK_SHORTBOW("Oak shortbow", 14, 29), OAK_LONGBOW_U("Oak longbow (u)", 25, 16), OAK_LONGBOW("Oak longbow", 14, 29), OAK_STOCK("Crossbow stock", 24, 17), OAK_SHIELD("Oak shield", 27, 18),
    WILLOW_SHAFT("Arrow shaft", 30, 14), WILLOW_SHORTBOW_U("Willow shortbow (u)", 35, 15), WILLOW_LONGBOW_U("Willow longbow (u)", 40, 16), WILLOW_STOCK("Crossbow stock", 39, 17), WILLOW_SHIELD("Willow shield", 42, 18),
    MAPLE_SHAFT("Arrow shaft", 45, 14), MAPLE_SHORTBOW_U("Maple shortbow (u)", 50, 15), MAPLE_LONGBOW_U("Maple longbow (u)", 55, 16), MAPLE_STOCK("Crossbow stock", 54, 17), MAPLE_SHIELD("Maple shield", 57, 18),
    YEW_SHAFT("Arrow shaft", 60, 14), YEW_SHORTBOW_U("Yew shortbow (u)", 65, 15), YEW_LONGBOW_U("Yew longbow (u)", 70, 16), YEW_STOCK("Crossbow stock", 69, 17), YEW_SHIELD("Yew shield", 72, 18),
    MAGIC_SHAFT("Arrow shaft", 60, 14), MAGIC_SHORTBOW_U("Magic shortbow (u)", 65, 15), MAGIC_LONGBOW_U("Magic longbow (u)", 70, 16), MAGIC_STOCK("Crossbow stock", 69, 17), MAGIC_SHIELD("Magic shield", 72, 18);

    private final String name;
    private final int level;

    FletchingProducts(final String name, final int level, final int widgetSelection) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return name;
    }
}
