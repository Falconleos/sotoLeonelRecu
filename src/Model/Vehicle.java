package Model;

public class Vehicle {

    protected static Integer counter = 0;

    private Integer id_vehicle;
    private Integer model;
    private long kilometers;
    private Integer year;
    private Integer code;
    private Double costPerDay;
    private Type type;

    public Vehicle() {
        this.id_vehicle = counter++;
    }

    public Vehicle(Integer model, long kilometers, Integer year, Integer code, Double costPerDay, Type type) {
        this.id_vehicle = counter++;
        this.model = model;
        this.kilometers = kilometers;
        this.year = year;
        this.code = code;
        this.costPerDay = costPerDay;
        this.type = type;
    }



    public Integer getId() {
        return id_vehicle;
    }


    public Integer getModel() {
        return model;
    }

    public void setModel(Integer model) {
        this.model = model;
    }

    public Long getKilometers() {
        return kilometers;
    }

    public void setKilometers(Integer kilometers) {
        this.kilometers = kilometers;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Double getCostPerDay() {
        return costPerDay;
    }

    public void setCostPerDay(Double costPerDay) {
        this.costPerDay = costPerDay;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id_vehicle=" + id_vehicle +
                ", model=" + model +
                ", kilometers=" + kilometers +
                ", year=" + year +
                ", code=" + code +
                ", costPerDay=" + costPerDay +
                ", type=" + type +
                '}';
    }


}
