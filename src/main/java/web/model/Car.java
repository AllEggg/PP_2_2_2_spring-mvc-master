package web.model;

public class Car {
    private Long model;
    private String name;
    private double cost;

    public Car(Long id, String name, double cost) {
        this.model = id;
        this.name = name;
        this.cost = cost;
    }

    public Long getModel() {
        return model;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }
}
