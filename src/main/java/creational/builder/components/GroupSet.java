package creational.builder.components;

public class GroupSet {
    private final String level_name;
    private final int countOfFrontGears;
    private final int countOfRearGears;

    public GroupSet(String level_name, int countOfFrontGears, int countOfRearGears) {
        this.level_name = level_name;
        this.countOfFrontGears = countOfFrontGears;
        this.countOfRearGears = countOfRearGears;
    }

    public String getLevelName() {
        return level_name;
    }

    public int getCountOfFrontGears() {
        return countOfFrontGears;
    }

    public int getCountOfRearGears() {
        return countOfRearGears;
    }
}
