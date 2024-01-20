// Create an account with an initial balance
Account myAccount = new Account("John Doe", 1000.0);

// Deposit funds into the account
myAccount.deposit(500.0);

// Withdraw funds from the account
myAccount.withdraw(200.0);

// Check the current balance
double balance = myAccount.getBalance();
System.out.println("Current Balance: $" + balance);
Polygon Class
Description
The Polygon class is designed to model a generic polygon. It includes properties like the number of sides, the length of each side, and methods to calculate the area and perimeter.

Usage Example
java
Copy code
// Create a polygon with 5 sides of length 8 units each
Polygon pentagon = new Polygon(5, 8.0);

// Calculate and display the area of the pentagon
double area = pentagon.calculateArea();
System.out.println("Area of Pentagon: " + area);

// Calculate and display the perimeter of the pentagon
double perimeter = pentagon.calculatePerimeter();
System.out.println("Perimeter of Pentagon: " + perimeter);
How to Use
Clone the repository to your local machine:

bash
Copy code
git clone https://github.com/your-username/java-account-polygon.git
Open the project in your preferred Java development environment (e.g., Eclipse, IntelliJ).

Explore and run the example code in the Main class to see the functionalities of the Account and Polygon classes.

Contributing
If you have any suggestions for improvements or additional features, feel free to fork the repository and submit a pull request.
