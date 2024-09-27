import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Car {
    private String licensePlate;
    private String model;
    private boolean isAvailable;

    public Car(String licensePlate, String model) {
        this.licensePlate = licensePlate;
        this.model = model;
        this.isAvailable = true;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getModel() {
        return model;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}

class Customer {
    private String id;
    private String name;

    public Customer(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

class RentalAgency {
    private List<Car> cars;
    private List<Customer> customers;

    public RentalAgency() {
        this.cars = new ArrayList<>();
        this.customers = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void registerCustomer(Customer customer) {
        customers.add(customer);
    }

    public boolean rentCar(String customerId, String licensePlate) {
        for (Customer customer : customers) {
            if (customer.getId().equals(customerId)) {
                for (Car car : cars) {
                    if (car.getLicensePlate().equals(licensePlate) && car.isAvailable()) {
                        car.setAvailable(false);
                        System.out.println("Rented successfully!");
                        return true;
                    }
                }
                System.out.println("Car for hire not available.");
                return false;
            }
        }
        System.out.println("Customer not registered.");
        return false;
    }

    public void returnCar(String licensePlate) {
        for (Car car : cars) {
            if (car.getLicensePlate().equals(licensePlate)) {
                car.setAvailable(true);
                System.out.println("Car returned successfully!");
                return;
            }
        }
        System.out.println("Car not found.");
    }

    public void listAvailableCars() {
        System.out.println("Available Cars:");
        for (Car car : cars) {
            if (car.isAvailable()) {
                System.out.println(car.getModel() + " (" + car.getLicensePlate() + ")");
            }
        }
    }
}

public class SimpleCarRentalSystem {
    public static void main(String[] args) {
        RentalAgency agency = new RentalAgency();

        // cars
        agency.addCar(new Car("KAV390Y", "NISSAN"));
        agency.addCar(new Car("KCA356Q", "TOYOTA"));
        agency.addCar(new Car("KBA400W", "CHEVROLET"));

        // Registering customers
        agency.registerCustomer(new Customer("C1", "mark"));
        agency.registerCustomer(new Customer("C2", "jeniffer"));

        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.println("\n--- Car Rental System ---");
            System.out.println("1. List Available Cars");
            System.out.println("2. Rent a Car");
            System.out.println("3. Return a Car");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    agency.listAvailableCars();
                    break;
                case "2":
                    System.out.print("Enter ID number: ");
                    String customerId = scanner.nextLine();
                    System.out.print("Enter Chosen car number plate: ");
                    String licensePlate = scanner.nextLine();
                    agency.rentCar(customerId, licensePlate);
                    break;
                case "3":
                    System.out.print("Enter Car number Plate to return: ");
                    String returnPlate = scanner.nextLine();
                    agency.returnCar(returnPlate);
                    break;
                case "4":
                    System.out.println("Exiting the system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (!choice.equals("4"));

        scanner.close();
    }
}