import java.io.IOException;
import java.util.Scanner;

public class App {
    BusStation station1 = new BusStation("Oberglatt", '1', false, false);
    BusStation station2 = new BusStation("Ruemlang", '2', false, false);
    BusStation station3 = new BusStation("Ruemlang", '2', false, false);
    BusStation station4 = new BusStation("Ruemlang", '2', false, false);
    BusStation station5 = new BusStation("Ruemlang", '2', false, false);
    BusStation station6 = new BusStation("Ruemlang", '2', false, false);
    BusStation station7 = new BusStation("Ruemlang", '2', false, false);
    BusStation station8 = new BusStation("Ruemlang", '2', false, false);
    BusStation station9 = new BusStation("Ruemlang", '2', false, false);
    BusStation station10 = new BusStation("Ruemlang", '2', false, false);

    Bus bus1 = new Bus(1, 200);
    Bus bus2 = new Bus(2, 200);

    Ride ride1 = new Ride(bus1, "16:00", "20:00", 1);
    Ride ride2 = new Ride(bus2, "12:00", "18:00", 2000);

    Parking parking1 = new Parking(ride1, station1);
    Parking parking2 = new Parking(ride2, station2);



    Scanner scanner = new Scanner(System.in);
    String selection;

    public void run() throws IOException {
        do {
            System.out.println("1) Open Trips \n2) Open Busstations\n3) Exit \n\nAuswahl: ");
            selection = scanner.next();

            switch (selection) {
                case "1":
                    break;
                case "2":
                    System.out.println(
                            "Wich Busstation do you want to see? " +
                            "\n1) " + station1.getName() +
                            "\n2) " + station2.getName() +
                            "\n3) " + station3.getName() +
                            "\n4) " + station4.getName() +
                            "\n5) " + station5.getName() +
                            "\n6) " + station6.getName() +
                            "\n7) " + station7.getName() +
                            "\n8) " + station8.getName() +
                            "\n9) " + station9.getName() +
                            "\n10) " + station10.getName() +
                            "\nPlease choose a busstation: "
                    );
                    selection = scanner.next();
                    switch (selection){
                        case "1":
                            break;
                        case "2":
                            break;
                        case "3":
                            break;
                        case "4":
                            break;
                        case "5":
                            break;
                        case "6":
                            break;
                        case "7":
                            break;
                        case "8":
                            break;
                        case "9":
                            break;
                        case "10":
                            break;
                    }
                    break;
            }
        } while (!selection.equals("3"));
    }
}