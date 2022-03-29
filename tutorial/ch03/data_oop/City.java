package tutorial.ch03.data_oop;

public class City {
    private String name;
    private String nation;
    private int population;

    public City(String name, String nation, int population) {
        this.name = name;
        this.nation = nation;
        this.population = population;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public Object getPopulation() {
        return nation;
    }
}
