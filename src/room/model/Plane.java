package room.model;

public class Plane {

    private String model;
    private String country;
    private int year = 2000;  // 1903-2023
    private int hours = 1000; // 0-10000
    private boolean isMilitary;
    private int weight = 70000; // 10000-160000 kg
    private byte wingSpan = 35; // 10-45 m
    private short speed = 500; // max 1000km/h, not negative
    private short seats = 450; // not negative
    private double coast;

    public Plane(String model, String country, int year, int hours, boolean isMilitary, int weight, byte wingSpan, short speed, short seats, double coast) {
        this.model = model;
        this.country = country;
        this.year = year;
        this.hours = hours;
        this.isMilitary = isMilitary;
        this.weight = weight;
        this.wingSpan = wingSpan;
        this.speed = speed;
        this.seats = seats;
        this.coast = coast;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (getYear() > 1902 && getYear() < 2024) {
            this.year = year;
        }
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (getHours() > 0 && getHours() < 10001) {
            this.hours = hours;
        }
    }

    public boolean isMilitary() {
        return isMilitary;
    }

    public void setMilitary(boolean military) {
        isMilitary = military;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (getWeight() > 9999 && getWeight() < 160001) {
            this.weight = weight;
        }
    }

    public byte getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(byte wingSpan) {
        if (getWingSpan() > 9 && getWingSpan() < 45) {
            this.wingSpan = wingSpan;
        }
    }

    public short getSpeed() {
        return speed;
    }

    public void setSpeed(short speed) {
        if (getSpeed() > 0 && getSpeed() < 1001) {
            this.speed = speed;
        }
    }

    public short getSeats() {
        return seats;
    }

    public void setSeats(short seats) {
        if (getSeats() > 0) {
            this.seats = seats;
        }
    }

    public double getCoast() {
        return coast;
    }

    public void setCoast(double coast) {
        this.coast = coast;
    }

    public void Task1() {

        System.out.println("model: " + model);
        System.out.println("country: "+ country);
        System.out.println("year" + year);
        System.out.println("hours: " + hours + "h");
        System.out.println("weight: " + weight + "kg");
        System.out.println("isMilitary: " + isMilitary);
        System.out.println("wing span: " + wingSpan + "m");
        System.out.println("speed: " + speed + "km/h");
        System.out.println("seats: " + seats + "place");
        System.out.println("coast: " + coast + "$");

    }
}
