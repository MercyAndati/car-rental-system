# car-rental-system
In this ystem the customer is requiered to enter tehir name , email , phone number and choose a car from the available ones, (enter the numbwr plte as diplayed in the table).
If the numberpalte entered is correct, the user is requered to enter the number of day they will borrow the car for. The car details together with the cutomer name and price are displayed to indicate the car has been lended successfully.
Here are the classes and methods used.
DOCUMENTATION

CLASSES AND METHODS
CAR CLASS
  ATTRIBUTES:
  	Make – The make of the car.
  	Model – model of the car.
  	Year – year the car was made.
  	Daily rate – payment rate of the car.
  	Numberplate – number plate of the car.
  Constructors:
    Public ‘car(String make, string model, int year, double dailyRate, string numberplate)’  – initializes a new ‘car’ object with the given attributes
  Getters:
  	Getmake() – returns the make of the car.
  	GetModel() – returns the model of the car.
  	GetYear() –  returns the year the car was made.
  	getdailyrate() –  returns the payment rate of the car.
  	GetNumberPlate() –  returns the number plate of the car.

Customer class
  ATTRIBUTES:
  	Name -  the name of customer.
  	Email -  the email of the customer.
  	Phonenumber -  the phonenumber of the customer.
  Constructor:
    Public ‘customer(string name, string email, int phonenumber)’ – initializes new ‘customer‘object with the attributes.
  Getters:
  	Getname() -  returns the name of customer.
  	Getemail() -  returns the email of the customer.
  	Getphonenumber() -  returns the phonenumber of the customer.
  Methods:
    Public void  ‘rentcar(RentalAgency agency)’ – allows customer to rent car from the given rental agency.
    ‘GetCusstomerDetails(Scanner scanner)’ – prompts the customer to enter the details and updates the customer’s attributes.


RentalAgency class
  Attributes:
  	Car – the list of cars available for renting.
  Constructors:
  	RentalAgency() – initializes new rental agency object with an empty list of  cars.
  Methods:
  	‘Addcar(Car car)’ – adds car to the list of available cars.
    ‘rentCar(Customer customer, Car car, int days)’ – Rents car to the customer for a specific number of days.
    ‘Dipsplaycars()’ – displays the list of all available cars.

CarRentalSystem class
    Main method:
    Creates a new RentalAgency object and adds several cars to it.
    Displays the list of the available cars.
    Creates new customer object and prompts the user to enter customer details.
    Allows the customer to rent a car from the rental agency.

