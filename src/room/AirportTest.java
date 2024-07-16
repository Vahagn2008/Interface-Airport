package room;

import room.model.Plane;
import room.service.PlaneService;

import java.util.Scanner;

public class AirportTest {

    public static void main(String[] args) {

        PlaneService planeService = new PlaneService();


        boolean isActive = true;

        while (isActive) {

            System.out.println("1: print all information of the plane");
            System.out.println("2: print cost and topSpeed if the plane is military otherwise print model and country");
            System.out.println("3: plane which one is newer");
            System.out.println("4: model of the plane which has  bigger wingspan");
            System.out.println("5: print country of the plane with smallest seats count");
            System.out.println("6: print all not military planes");
            System.out.println("7: print all military planes which were in air more then 100 hours");
            System.out.println("8: plane whit minimal weigth");
            System.out.println("9: plane whit minimal cost from all military planes");
            System.out.println("10: print planes in ascending  form order by year");
            System.out.println("11: EXIT");

            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();


            Plane plane1 = new Plane("Airbus", "England", 2020, 1000, true, 100000, (byte) 30, (short) 900, (short) 400, 10000);
            Plane plane2 = new Plane("Boeing", "America", 2021, 2000, false, 150000, (byte) 40, (short) 1000, (short) 500, 200000);
            Plane plane3 = new Plane("Dubay", "OAE", 2022, 1500, false, 150000, (byte) 20, (short) 950, (short) 300, 30000);


            switch (number) {
                case 1:
                    plane1.Task1();
                    break;
                case 2:
                    PlaneService planeService1 = new PlaneService();
                    planeService1.Task2(plane1);
                    break;
                case 3:
                    Plane p1 = planeService.Task3(plane1, plane2);
                    p1.Task1();
                    break;
                case 4:
                    Plane p2 = planeService.Task4(plane1, plane2);
                    System.out.println(p2.getModel());
                    break;
                case 5:
                    Plane p3 = planeService.Task5(plane1, plane2, plane3);
                    System.out.println(p3.getCountry());
                    break;
                case 6:
                    Plane[] planes = {plane1, plane2, plane3};
                    planeService.Task6(planes);
                    break;
                case 7:
                    Plane[] planes1 = {plane1, plane2, plane3};
                    planeService.Task7(planes1);
                    break;
                case 8:
                    Plane[] planes2 = {plane1, plane2, plane3};
                    planeService.Task8(planes2);
                    break;
                case 9:
                    Plane[] planes3 = {plane1, plane2, plane3};
                    planeService.Task9(planes3);
                    break;
                case 10:
                    Plane[] planes4 = {plane1, plane2, plane3};
                    planeService.Task10(planes4);
                    break;
                case 11:
                    isActive = false;
            }

        }


    }
}
