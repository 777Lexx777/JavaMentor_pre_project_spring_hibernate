package web.model;

public class Car {

    private long id;

    private String model;

    private String color;

    private int age;

    public Car() { }

    public Car(Long id, String model, String color, int age) {
        this.id = id;
        this.model = model;
        this.color = color;
        this.age = age;
    }

    public long getId() { return id; }

    public void setId(long id) { this.id = id; }

    public String getModel() { return model; }

    public void setModel(String model) { this.model = model; }

    public String getColor() { return color; }

    public void setColor(String color) { this.color = color; }

    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }

    @Override
    public String toString() {
        return "\n" +"Car{" + "id=" + id  +
                "| model='" + model + '\'' +
                "| series='" + color + '\'' +
                "| age=" + age +
                '}';
    }
}
