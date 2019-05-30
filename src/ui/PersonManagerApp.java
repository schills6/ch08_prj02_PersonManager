package ui;

import java.util.ArrayList;

import business.Customer;
import business.Employee;
import business.Person;
import util.Console;

public class PersonManagerApp {
	
	
	public static void main(String[] args) {

		System.out.println("Welcome to the Person Manager\n");
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			ArrayList<Person> people = new ArrayList<>();
			String personChoice = Console.getRequiredString("Create customer or employee? (c/e): ");
			
			switch (personChoice) {
				case "c":
				case "C":
					Customer c = displayCustomerMenu();
					people.add(c);
					int lastIndex = people.size() -1;
					c=(Customer) people.get(lastIndex);
					System.out.println("\nYou entered a new Customer: \n" + "Name: " +c.getFirstName()+" "+ c.getLastName() +
							"\nCustomer Number: " + c.getCustomerNumber()+"\n");
					break;
				case "e":
				case "E":
					Employee e = displayEmployeeMenu();
					people.add(e);
					lastIndex = people.size() -1;
					e=(Employee) people.get(lastIndex);
					System.out.println("\nYou entered a new Employee: \n" + "Name: " + e.getFirstName() + " " + e.getLastName() +
							"\nSSN: " +e.getSsn()+"\n");
					break;
				default:
					System.out.println("Error! Entry must be 'c' or 'e'. Try Again.");
					continue;
			}
			
			choice = Console.getChoiceString("Continue? (y/n): ", "y", "n");
			System.out.println();

		}
		System.out.println("Goodbye.");

	}
	
	public static Customer displayCustomerMenu() {
		System.out.println();
		String customerFirst = Console.getRequiredString("First name: ");
		String customerLast = Console.getRequiredString("Last name: ");
		String customerNumber = Console.getRequiredString("Customer number: ");
		Customer c = new Customer(customerFirst, customerLast, customerNumber);
		return c;
	}
	
	public static Employee displayEmployeeMenu() {
		System.out.println();
		String employeeFirst = Console.getRequiredString("First name: ");
		String employeeLast = Console.getRequiredString("Last name: ");
		String employeeSSN = Console.getRequiredString("SSN: ");
		Employee e = new Employee(employeeFirst, employeeLast, employeeSSN);
		return e;
	}
	
	/*public static Person findPerson() {
		Person p = new Person();
		String searchNumber = Console.getString("Enter customer number or employee SSN: ")
		if (people.contains(searchNumber)) {
			
		}
	}*/
}