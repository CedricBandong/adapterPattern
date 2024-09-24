import java.util.Scanner;

public class SmartHomeApp {

    public static void main(String[] args){

        Laptop laptop = new Laptop();
        Refrigerator refrigerator  = new Refrigerator();
        SmartphoneCharger smartphoneCharger = new SmartphoneCharger();
        Outlet laptopAdapter = new LaptopAdapter(laptop);
        Outlet refrigeratorAdapter = new RefrigeratorAdapter(refrigerator);
        Outlet smartphoneAdapter = new SmartphoneAdapter(smartphoneCharger);
        
        Scanner s = new Scanner(System.in);

        System.out.println("SMART HOME APP\n");

        while (true) {
            System.out.println("Select device to manage and control.");
            System.out.println("1. Laptop");
            System.out.println("2. Refrigerator");
            System.out.println("3. Smartphone Charger");
            System.out.println("4. Exit");
              System.out.println("");
            System.out.print("Select a Device to Manage or Control: ");
              System.out.print("");

            int device = s.nextInt();

            Outlet selectedAdapter = null;

            switch (device) {
                case 1:
                    selectedAdapter = laptopAdapter;
                    break;

                case 2:
                    selectedAdapter = refrigeratorAdapter;
                    break;

                case 3:
                    selectedAdapter = smartphoneAdapter;
                    break;

                case 4:
                    System.out.println("");
                    System.out.println("Smart Home App Closing...");
                    System.out.println("");
                    s.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("");
                    System.out.println("Number invalid. Please try again.\n");
                    continue; 
            }

            if (selectedAdapter != null) {
                System.out.println("");
                System.out.println("Controlled Device: " + selectedAdapter.plugIn() + "\n");
            }
        }
    }
}
