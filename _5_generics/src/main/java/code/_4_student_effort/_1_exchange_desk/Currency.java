package code._4_student_effort._1_exchange_desk;

public class Currency {
    private String name;
    private float value;

    public Currency() {
    }

    public Currency(float value, String name) {
        this.value = value;
        this.name = name;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected float getValue() {
        return value;
    }

    protected void setValue(float value) {
        this.value = value;
    }
}
