import java.util.Objects;

public class Insect {
    private String name;
    private int legs;

    public Insect(String name, int legs) {
        this.name = name;
        this.legs = legs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }
}
