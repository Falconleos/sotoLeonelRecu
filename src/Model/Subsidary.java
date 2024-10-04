package Model;

public class Subsidary {

    protected static Integer counter2 = 0;
    private Integer id_city;
    private String adress;
    private String city;
    private String telephone;

    public Subsidary(String adress, String city, String telephone) {
        this.id_city = counter2++;
        this.adress = adress;
        this.city = city;
        this.telephone = telephone;
    }

    public Subsidary() {
        this.id_city = counter2++;
    }

    public Integer getId_city() {
        return id_city;
    }


    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Subsidary{" +
                "id_city=" + id_city +
                ", adress='" + adress + '\'' +
                ", city='" + city + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }



}

