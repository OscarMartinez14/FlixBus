import java.io.IOException;
import java.util.Scanner;

public class App {
    /**
     * Here are all stations created
     */
    BusStation station1 = new BusStation("Oberglatt", '1', false, false);
    BusStation station2 = new BusStation("Ruemlang", '2', false, false);
    BusStation station3 = new BusStation("Zürich", '3', false, false);
    BusStation station4 = new BusStation("Museum für Gestaltung", '4', false, false);
    BusStation station5 = new BusStation("Bülach", '5', false, false);

    /**
     * Here are all the buses created
     */
    Bus bus1 = new Bus(1, 200);
    Bus bus2 = new Bus(2, 200);
    Bus bus3 = new Bus(3, 300);
    Bus bus4 = new Bus(4, 200);
    Bus bus5 = new Bus(5, 200);
    Bus bus6 = new Bus(6, 400);
    Bus bus7 = new Bus(7, 100);
    Bus bus8 = new Bus(8, 240);

    /**
     * Here are all rides created
     */
    Ride ride1 = new Ride(bus1, "16:00", "20:00", 1, "Genf");
    Ride ride2 = new Ride(bus2, "12:00", "08:00", 2000, "Zagreb");
    Ride ride3 = new Ride(bus3, "14:00", "07:00", 1999, "Berlin");
    Ride ride4 = new Ride(bus4, "08:00", "15:00", 22, "Aargau");
    Ride ride5 = new Ride(bus5, "21:00", "02:00", 45, "Zürich");
    Ride ride6 = new Ride(bus6, "18:00", "10:00", 1002, "Paris");
    Ride ride7 = new Ride(bus2, "06:00", "17:00", 112, "Graubünden");
    Ride ride8 = new Ride(bus1, "10:00", "22:00", 1123, "Zagreb");
    Ride ride9 = new Ride(bus2, "06:00", "17:00", 82, "Glarus");
    Ride ride10 = new Ride(bus3, "13:00", "23:00", 543, "Basel");
    Ride ride11 = new Ride(bus4, "18:00", "13:00", 1023, "Barcelona");
    Ride ride12 = new Ride(bus7, "10:00", "19:00", 102, "Jura");
    Ride ride13 = new Ride(bus8, "13:00", "20:00", 23, "Schwyz");


    /**
     * here are all parkings created
     */
    Parking parking1 = new Parking(ride1, station1);
    Parking parking2 = new Parking(ride2, station2);
    Parking parking3 = new Parking(ride3, station2);
    Parking parking4 = new Parking(ride4, station1);
    Parking parking5 = new Parking(ride5, station1);
    Parking parking6 = new Parking(ride6, station2);
    Parking parking7 = new Parking(ride7, station3);
    Parking parking8 = new Parking(ride8, station3);
    Parking parking9 = new Parking(ride9, station3);
    Parking parking10 = new Parking(ride10, station4);
    Parking parking11 = new Parking(ride11, station4);
    Parking parking12 = new Parking(ride12, station5);
    Parking parking13 = new Parking(ride13, station5);



    Scanner scanner = new Scanner(System.in);
    String selection;

    public void run() throws IOException {
        try {
            do {
                /**
                 * This is the main menu
                 */
                System.out.println("\n1) Open Trips \n2) Open Busstations\n3) Exit \n\nCurrent Time: " + java.time.LocalTime.now() + "\nAuswahl: ");
                selection = scanner.next();

                switch (selection) {
                    case "1":
                        /**
                         * Here are are all rides displayed
                         */
                        System.out.println("Start: " + parking1.getRide().getStart() + " Location: " + parking1.getRide().getLocation() + " Parking: " + parking1.getBusStation().getName());
                        System.out.println("Start: " + parking2.getRide().getStart() + " Location: " + parking2.getRide().getLocation() + " Parking: " + parking2.getBusStation().getName());
                        System.out.println("Start: " + parking3.getRide().getStart() + " Location: " + parking3.getRide().getLocation() + " Parking: " + parking3.getBusStation().getName());
                        System.out.println("Start: " + parking4.getRide().getStart() + " Location: " + parking4.getRide().getLocation() + " Parking: " + parking4.getBusStation().getName());
                        System.out.println("Start: " + parking5.getRide().getStart() + " Location: " + parking5.getRide().getLocation() + " Parking: " + parking5.getBusStation().getName());
                        System.out.println("Start: " + parking6.getRide().getStart() + " Location: " + parking6.getRide().getLocation() + " Parking: " + parking6.getBusStation().getName());
                        System.out.println("Start: " + parking7.getRide().getStart() + " Location: " + parking7.getRide().getLocation() + " Parking: " + parking7.getBusStation().getName());
                        System.out.println("Start: " + parking8.getRide().getStart() + " Location: " + parking8.getRide().getLocation() + " Parking: " + parking8.getBusStation().getName());
                        System.out.println("Start: " + parking9.getRide().getStart() + " Location: " + parking9.getRide().getLocation() + " Parking: " + parking9.getBusStation().getName());
                        System.out.println("Start: " + parking10.getRide().getStart() + " Location: " + parking10.getRide().getLocation() + " Parking: " + parking10.getBusStation().getName());
                        System.out.println("Start: " + parking11.getRide().getStart() + " Location: " + parking11.getRide().getLocation() + " Parking: " + parking11.getBusStation().getName());
                        System.out.println("Start: " + parking12.getRide().getStart() + " Location: " + parking12.getRide().getLocation() + " Parking: " + parking12.getBusStation().getName());
                        System.out.println("Start: " + parking13.getRide().getStart() + " Location: " + parking13.getRide().getLocation() + " Parking: " + parking13.getBusStation().getName());
                        break;
                    case "2":
                        System.out.println(
                                /**
                                 * Here is where the app asks you, wich busStation you would like to see
                                 */
                                "Wich Busstation do you want to see? " +
                                        "\n1) " + station1.getName() +
                                        "\n2) " + station2.getName() +
                                        "\n3) " + station3.getName() +
                                        "\n4) " + station4.getName() +
                                        "\n5) " + station5.getName() +
                                        "\nPlease choose a busstation: "
                        );
                        /**
                         * Here you can type, wich station you would like to see
                         */
                        selection = scanner.next();
                        /**
                         * Here is the swtich and there are different cases
                         */
                        switch (selection) {
                            case "1":
                                System.out.println(ride4.getInternational() + " Start: " + ride4.getStart() + " Back: " + ride4.getBack() + " Location: " + ride4.getLocation());
                                System.out.println(ride1.getInternational() + " Start: " + ride1.getStart() + " Back: " + ride1.getBack() + " Location: " + ride1.getLocation());
                                System.out.println(ride5.getInternational() + " Start: " + ride5.getStart() + " Back: " + ride5.getBack() + " Location: " + ride5.getLocation());
                                break;
                            case "2":
                                System.out.println(ride6.getInternational() + " Start: " + ride6.getStart() + " Back: " + ride6.getBack() + " Location: " + ride6.getLocation());
                                System.out.println(ride2.getInternational() + " Start: " + ride2.getStart() + " Back: " + ride2.getBack() + " Location: " + ride2.getLocation());
                                System.out.println(ride3.getInternational() + " Start: " + ride3.getStart() + " Back: " + ride3.getBack() + " Location: " + ride3.getLocation());
                                break;
                            case "3":
                                System.out.println(ride7.getInternational() + " Start: " + ride7.getStart() + " Back: " + ride7.getBack() + " Location: " + ride7.getLocation());
                                System.out.println(ride8.getInternational() + " Start: " + ride8.getStart() + " Back: " + ride8.getBack() + " Location: " + ride8.getLocation());
                                System.out.println(ride9.getInternational() + " Start: " + ride9.getStart() + " Back: " + ride9.getBack() + " Location: " + ride9.getLocation());
                                break;
                            case "4":
                                System.out.println(ride10.getInternational() + " Start: " + ride10.getStart() + " Back: " + ride10.getBack() + " Location: " + ride10.getLocation());
                                System.out.println(ride11.getInternational() + " Start: " + ride11.getStart() + " Back: " + ride11.getBack() + " Location: " + ride11.getLocation());
                                break;
                            case "5":
                                System.out.println(ride12.getInternational() + " Start: " + ride12.getStart() + " Back: " + ride12.getBack() + " Location: " + ride12.getLocation());
                                System.out.println(ride13.getInternational() + " Start: " + ride13.getStart() + " Back: " + ride13.getBack() + " Location: " + ride13.getLocation());
                                break;
                        }
                        break;
                }
            } while (!selection.equals("3"));
        } catch (Exception e) {
            /**
             * The exception is here printed
             */
            System.out.println(e);
        }
    }
}
