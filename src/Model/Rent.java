package Model;

import java.util.Date;

public class Rent {

    protected static Integer counter3 = 0;
    private Integer id_rent;
    private String clientName;
    private String clientSurname;
    private String dni;
    private Boolean registry;
    private Date startDay;
    private Date finishDay;
    private Double distance;
    private Double pricePerDistance;
    private Double finalPrice;
    private Integer id_vehicle;
    private String subsidaryStart;
    private String subsidaryFinish;

    public Rent(String clientName, String clientSurname,String dni, Boolean registry,Date startDay, Date finishDay, Double distance, Double pricePerDistance, Double finalPrice,Integer id_vehicle,String subsidaryStart,String subsidaryFinish) {
        this.id_rent = counter3++;
        this.clientName = clientName;
        this.clientSurname = clientSurname;
        this.dni = dni;
        this.registry = registry;
        this.startDay = startDay;
        this.finishDay = finishDay;
        this.distance = distance;
        this.pricePerDistance = pricePerDistance;
        this.finalPrice = finalPrice;
        this.id_vehicle = id_vehicle;
        this.subsidaryStart = subsidaryStart;
        this.subsidaryFinish = subsidaryFinish;

    }

    public Rent() {
        this.id_rent = counter3++;
    }


    public Integer getId_vehicle() {
        return id_vehicle;
    }

    public void setId_vehicle(Integer id_vehicle) {
        this.id_vehicle = id_vehicle;
    }

    public Integer getId_rent() {
        return id_rent;
    }

    public void setId_rent(Integer id_rent) {
        this.id_rent = id_rent;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientSurname() {
        return clientSurname;
    }

    public void setClientSurname(String clientSurname) {
        this.clientSurname = clientSurname;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Boolean getRegistry() {
        return registry;
    }


    public void setRegistry(Boolean registry) {
        this.registry = registry;
    }

    public Date getStartDay() {
        return startDay;
    }

    public void setStartDay(Date startDay) {
        this.startDay = startDay;
    }

    public Date getFinishDay() {
        return finishDay;
    }

    public void setFinishDay(Date finishDay) {
        this.finishDay = finishDay;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Double getPricePerDistance() {
        return pricePerDistance;
    }

    public void setPricePerDistance(Double pricePerDistance) {
        this.pricePerDistance = pricePerDistance;
    }

    public Double getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(Double finalPrice) {
        this.finalPrice = finalPrice;
    }

    public String getSubsidaryStart() {
        return subsidaryStart;
    }

    public void setSubsidaryStart(String subsidaryStart) {
        this.subsidaryStart = subsidaryStart;
    }

    public String getSubsidaryFinish() {
        return subsidaryFinish;
    }

    public void setSubsidaryFinish(String subsidaryFinish) {
        this.subsidaryFinish = subsidaryFinish;
    }

    @Override
    public String toString() {
        return "Rent{" +
                "id_rent=" + id_rent +
                ", clientName='" + clientName + '\'' +
                ", clientSurname='" + clientSurname + '\'' +
                ", dni='" + dni + '\'' +
                ", registry=" + registry +
                ", startDay=" + startDay +
                ", finishDay=" + finishDay +
                ", distance=" + distance +
                ", pricePerDistance=" + pricePerDistance +
                ", finalPrice=" + finalPrice +
                ", id_vehicle=" + id_vehicle +
                ", subsidaryStart='" + subsidaryStart + '\'' +
                ", subsidaryFinish='" + subsidaryFinish + '\'' +
                '}';
    }


}
