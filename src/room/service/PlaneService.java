package room.service;

import room.model.Plane;

public class PlaneService implements PlaneServiceFunction{

    public void Task2(Plane plane) {

        if (plane.isMilitary()) {
            System.out.println(plane.getCoast());
            System.out.println(plane.getSpeed());
        } else {
            System.out.println(plane.getModel());
            System.out.println(plane.getCountry());
        }
    }

    public Plane Task3(Plane plane1, Plane plane2) {
        if (plane1.getYear() >= plane2.getYear()) {
            return plane1;
        }
        return plane2;
    }

    public Plane Task4(Plane plane1, Plane plane2) {
        if (plane1.getWingSpan() > plane2.getWingSpan()) {
            return plane1;
        }
        return plane2;
    }

    public Plane Task5(Plane plane1, Plane plane2, Plane plane3) {
        if (plane1.getSeats() < plane2.getSeats() && plane1.getSeats() < plane3.getSeats()) {
            return plane1;
        } else if (plane2.getSeats() < plane1.getSeats() && plane2.getSeats() < plane3.getSeats()) {
            return plane2;
        }
        return plane3;
    }

    public void Task6(Plane [] planes) {
        for (Plane plane : planes) {
            if (plane.isMilitary()) {
                plane.Task1();
                System.out.println("____________________");
            }
        }
    }

    public void Task7(Plane[] planes) {
        for (Plane plane : planes) {
            if (plane.getHours() > 100) {
                plane.Task1();
                System.out.println("____________________");
            }
        }
    }

    public void Task8(Plane[] planes) {
        Plane p = planes[0];
        for (int i = planes.length; i > 1; i--) {
            if (p.getWeight() > planes[i].getWeight()) {
                p.Task1();
            }
            planes[i].Task1();
        }
    }

    public void Task9(Plane[] planes) {
        Plane p = planes[0];
        for (int i = 1; i < planes.length; i++) {
            if (p.getCoast() > planes[i].getCoast()) {
                p = planes[i];
            }
        }
        p.Task1();
    }

    public void Task10(Plane[] planes) {
        Plane p;
        for (int i = 0; i < planes.length; i++) {
            for (int j = 1; j < planes.length-i; j++) {
                if (planes[j].getYear() < planes[j-1].getYear()) {
                    p = planes[j];
                    planes[j] = planes[j-1];
                    planes[j-1] = p;
                }
            }
        }
        for (Plane p1: planes) {
            System.out.println(p1.getModel());
        }
    }
}
