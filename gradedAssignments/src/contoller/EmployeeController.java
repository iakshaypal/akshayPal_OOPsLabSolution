package contoller;

import java.util.Scanner;

import model.Employee;
import service.EmployeeCredentialService;

public class EmployeeController {

	public static void main(String[] args) {
		Employee employee = new Employee("firstName", "lastName");
		EmployeeCredentialService service = new EmployeeCredentialService();

		Scanner sc = new Scanner(System.in);
		String generatedEmail;
		char[] generatedPassword;
		System.out.println("\n Enter your option :");
		System.out.println("\n 1.Technical \n 2.Admin \n 3.Human Resource \n 4.Legal");
		int option = sc.nextInt();

		switch (option) {
		case 1:
			generatedEmail = service.generatedEmail(employee.getFirstName(), employee.getLastName(), "tech");
			generatedPassword = service.generatedPassword();
			service.showCredentials(employee, generatedEmail, generatedPassword);
			break;

		case 2:
			generatedEmail = service.generatedEmail(employee.getFirstName(), employee.getLastName(), "Admin");
			generatedPassword = service.generatedPassword();
			service.showCredentials(employee, generatedEmail, generatedPassword);
			break;

		case 3:
			generatedEmail = service.generatedEmail(employee.getFirstName(), employee.getLastName(), "HR");
			generatedPassword = service.generatedPassword();
			service.showCredentials(employee, generatedEmail, generatedPassword);
			break;

		case 4:
			generatedEmail = service.generatedEmail(employee.getFirstName(), employee.getLastName(), "Legal");
			generatedPassword = service.generatedPassword();
			service.showCredentials(employee, generatedEmail, generatedPassword);
			break;

		default:
			System.out.println("Invalid Choice");
			break;

		}
	}
}
