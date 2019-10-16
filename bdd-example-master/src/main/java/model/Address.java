package model;

public class Address {


    private String country;
    private String location ;
    private Active active;
    
    public Address(String country, String location, Active active) {
        this.country = country;
        this.location = location;
        this.active = active;
    }


    public Address() {
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }



    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Active getActive() {
        return active;
    }

    public void setActive(Active active) {
        this.active = active;
    }
}
