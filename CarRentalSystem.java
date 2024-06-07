import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

class Car {
    private String make;
    private String model;
    private int year;
    private double dailyRate;
    private String numberPlate;

    public Car(String make, String model, int year, double dailyRate, String numberPlate) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.dailyRate = dailyRate;
        this.numberPlate = numberPlate;
    }
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public double getDailyRate() {
        return dailyRate;
    }
    public String getNumberPlate() {
        return numberPlate;
    }
}

class Customer {
    private String name;
    private String email;
    private String phoneNumber;

    public Customer(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void rentCar(RentalAgency agency) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number plate of the car you would like to rent:");
        String numberPlate = scanner.nextLine();
        Car chosenCar = null;
        for (int i = 0; i < agency.cars.size(); i++) {
            Car car = agency.cars.get(i);
            if (car.getNumberPlate().equals(numberPlate)) {
                chosenCar = car;
                break;
            }
        }
        if (chosenCar == null) {
            System.out.println("Car not found.");
        } else {
            System.out.println("Enter the number of days you would like to rent the car:");
            int days = Integer.parseInt(scanner.nextLine());
            agency.rentCar(this, chosenCar, days);
        }
        scanner.close();
    }

    public void getCustomerDetails(Scanner scanner) {
        System.out.println("Enter customer details:");
        System.out.print("Name: ");
        String customerName = scanner.nextLine();
        System.out.print("Email: ");
        String customerEmail = scanner.nextLine();
        System.out.print("Phone Number: ");
        String customerPhoneNumber = scanner.nextLine();
        this.name = customerName;
        this.email = customerEmail;
        this.phoneNumber = customerPhoneNumber;
    }
}

class RentalAgency {
    protected List<Car> cars;
    public RentalAgency() {
        this.cars = new ArrayList<>();
    }
    public void addCar(Car car) {
        cars.add(car);
    }
    public void rentCar(Customer customer, Car car, int days) {
        double totalCost = car.getDailyRate() * days;
        System.out.println("Car " + car.getMake() + " " + car.getModel() + " rented to " + customer.getName() + " for " + days + " days. Total cost: $" + totalCost);
    }
    public void displayCars() {
        System.out.println("Car List:");
        System.out.println("------------------------------------------------");
        System.out.println("|Number Plate| Make | Model | Year | Daily Rate|");
        System.out.println("------------------------------------------------");
        for (int i = 0; i < cars.size(); i++) {
            Car car = cars.get(i);
            System.out.println("| " + car.getNumberPlate() + " | " + car.getMake() + " | " + car.getModel() + " | " + car.getYear() + " | $" + car.getDailyRate() + " |");
        }
        System.out.println("------------------------------------------------");
    }
}

public class CarRentalSystem {
    public static void main(String[] args) {
        RentalAgency agency = new RentalAgency();
        Car car1 = new Car("Toyota ", "Corolla", 2015, 40.0, "ABC123");
        Car car2 = new Car("Honda  ", "Civic  ", 2018, 50.0, "DEF456");
        Car car3 = new Car("Ford   ", "Focus  ", 2017, 45.0, "GHI789");
        Car car4 = new Car("Nissan ", "Altima ", 2019, 55.0, "JKL012");
        Car car5 = new Car("Hyundai", "Elantra", 2016, 42.0, "MNO345");
        agency.addCar(car1);
        agency.addCar(car2);
        agency.addCar(car3);
        agency.addCar(car4);
        agency.addCar(car5);
        
        agency.displayCars();
        Scanner scanner = new Scanner(System.in);
        Customer customer = new Customer("", "", "");
        customer.getCustomerDetails(scanner);
        customer.rentCar(agency);
        scanner.close();
    }
}