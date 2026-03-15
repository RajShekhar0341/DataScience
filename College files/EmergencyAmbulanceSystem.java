import java.util.Scanner;

class Patient {
    String name;
    int age;
    String problem;
    int emergencyLevel;

    Patient(String name, int age, String problem, int emergencyLevel) {
        this.name = name;
        this.age = age;
        this.problem = problem;
        this.emergencyLevel = emergencyLevel;
    }

    void displayPatient() {
        System.out.println("\nPatient Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Problem: " + problem);
        System.out.println("Emergency Level: " + emergencyLevel);
    }
}

class Ambulance {
    String ambulanceNumber = "AMB-101";
    String driverName = "Ramesh";

    void dispatchAmbulance(Patient p) {
        System.out.println("\nChecking emergency level...");

        if (p.emergencyLevel >= 7) {
            System.out.println("High Emergency! Ambulance dispatched immediately.");
        } else {
            System.out.println("Moderate Emergency. Ambulance dispatched soon.");
        }

        System.out.println("\nAmbulance Details:");
        System.out.println("Ambulance Number: " + ambulanceNumber);
        System.out.println("Driver: " + driverName);
        System.out.println("Patient " + p.name + " is being transported to the hospital.");
    }
}

public class EmergencyAmbulanceSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Emergency Ambulance System =====");

        System.out.print("Enter Patient Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Medical Problem: ");
        String problem = sc.nextLine();

        System.out.print("Enter Emergency Level (1-10): ");
        int level = sc.nextInt();

        Patient p1 = new Patient(name, age, problem, level);

        p1.displayPatient();

        Ambulance amb = new Ambulance();
        amb.dispatchAmbulance(p1);

        sc.close();
    }
}