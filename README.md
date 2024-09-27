# CAR-RENTAL-SYSTEM-JAVA
CAR RENTAL SYSTEM

Features
Add Cars: The system starts with a few predefined cars that can be rented.
Register Customers: New customers can be registered into the system.
List Available Cars: Displays all cars that are currently available for rent.
Rent a Car: Customers can rent a car by providing their customer ID and the car's license plate number.
Return a Car: Rented cars can be returned, making them available for future rentals.
Simple Command-Line Interface: Users can interact with the system through the terminal by choosing options from a menu.
Classes
1. Car
Represents a car in the system.

Attributes:

licensePlate: Unique identifier for the car.
model: The make and model of the car.
isAvailable: Indicates if the car is available for rent.
Methods:

getLicensePlate(): Returns the license plate of the car.
getModel(): Returns the car model.
isAvailable(): Checks if the car is available for rent.
setAvailable(boolean available): Sets the availability status of the car.
2. Customer
Represents a customer registered in the system.

Attributes:

id: Unique identifier for the customer.
name: The name of the customer.
Methods:

getId(): Returns the customer ID.
getName(): Returns the customer name.
3. RentalAgency
Manages the operations of the car rental system, including cars, customers, and rentals.

Attributes:

cars: A list of cars in the system.
customers: A list of customers registered in the system.
Methods:

addCar(Car car): Adds a new car to the system.
registerCustomer(Customer customer): Registers a new customer.
rentCar(String customerId, String licensePlate): Rents a car to a customer.
returnCar(String licensePlate): Marks a car as returned and makes it available again.
listAvailableCars(): Lists all cars that are currently available for rent.
How to Use
1. Clone the Repository
bash
Copy code
git clone https://github.com/your-username/SimpleCarRentalSystem.git
2. Compile and Run
To compile the program, navigate to the folder and use the javac command:

bash
Copy code
javac SimpleCarRentalSystem.java
Run the compiled program:

bash
Copy code
java SimpleCarRentalSystem
3. Menu Options
Once you run the program, the following menu options are available:

List Available Cars: Displays all cars that are available for rent.
Rent a Car: Enter the customer ID and car license plate to rent a car.
Return a Car: Enter the license plate of the car to return it.
Exit: Exit the system.
Example Interaction
mathematica
Copy code
--- Car Rental System ---
1. List Available Cars
2. Rent a Car
3. Return a Car
4. Exit
Enter your choice: 1

Available Cars:
NISSAN (KAV390Y)
TOYOTA (KCA356Q)
CHEVROLET (KBA400W)

Enter your choice: 2
Enter Customer ID: C1
Enter Car License Plate: ABC123
Car rented successfully!

Enter your choice: 3
Enter Car License Plate to return: ABC123
Car returned successfully!

Enter your choice: 4
Exiting the system. Goodbye!
Future Enhancements
Add pricing and rental duration features.
Implement a user-friendly graphical interface.
Add data persistence to save and load customer and rental data from a file or database.
License
This project is licensed 
