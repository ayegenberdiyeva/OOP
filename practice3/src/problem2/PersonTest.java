package problem2;

import java.util.Scanner;
import java.util.Vector;

public class PersonTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vector<Person> personVector = new Vector<>();
		Vector<Student> studentVector = new Vector<>();
		Vector<Staff> staffVector = new Vector<>();

		System.out.println("\n1. Add person");
		System.out.println("2. Add student");
		System.out.println("3. Add staff");
		System.out.println("4. Show all persons");
		System.out.println("5. Show all students");
		System.out.println("6. Show all staff");
		System.out.println("7. Quit");
		System.out.print("Enter your choice: ");
		
		while (true) {
			int input = scanner.nextInt();
			scanner.nextLine();

			if (input == 1) {
				System.out.println("Enter name: ");
				String name = scanner.nextLine();
				System.out.println("Enter address (or - if no need): ");
				String address = scanner.nextLine();
				
				if (!address.equals("-")) {
					personVector.add(new Person(name, address));
				} else {
					personVector.add(new Person(name));
				}
				
				System.out.println("Do you want to classify an added person?(Y/N) ");
				String choice = scanner.nextLine();
				if (choice.equalsIgnoreCase("Y")) {
					System.out.println("Student or staff?(stu/sta) ");
					String role = scanner.nextLine();
					if (role.equalsIgnoreCase("stu")) {
						System.out.println("Enter program: ");
						String program = scanner.nextLine();	
						System.out.println("Enter year: ");
						int year = scanner.nextInt();
						System.out.println("Enter fee: ");
						double fee = scanner.nextDouble();
						scanner.nextLine();
						
						studentVector.add(new Student(name, program, year, fee));
					} else if (role.equalsIgnoreCase("sta")){
						System.out.println("Enter school: ");
						String school = scanner.nextLine();
						System.out.println("Enter pay: ");
						double pay = scanner.nextDouble();
						scanner.nextLine();
						
						staffVector.add(new Staff(name, school, pay));
					}
				}
			}
			else if (input == 2) {
				System.out.println("Enter name: ");
				String name = scanner.nextLine();
				System.out.println("Enter program: ");
				String program = scanner.nextLine();	
				System.out.println("Enter year: ");
				int year = scanner.nextInt();
				System.out.println("Enter fee: ");
				double fee = scanner.nextDouble();
				scanner.nextLine();

				studentVector.add(new Student(name, program, year, fee));
				personVector.add(studentVector.lastElement());
			}
			else if (input == 3) {
				System.out.println("Enter name: ");
				String name = scanner.nextLine();
				System.out.println("Enter school: ");
				String school = scanner.nextLine();
				System.out.println("Enter pay: ");
				double pay = scanner.nextDouble();
				scanner.nextLine();

				staffVector.add(new Staff(name, school, pay));
				personVector.add(studentVector.lastElement());
			}
			else if (input == 4) {
				if (personVector.isEmpty()) {
					System.out.println("You have not added any persons!");
				} else {
					for (Person person : personVector) {
						System.out.print(person);
					}
				}
			}
			else if (input == 5) {
				if (studentVector.isEmpty()) {
					System.out.println("You have not added any students!");
				} else{
					for (Student student : studentVector) {
						System.out.print(student);
					}
				}
			}
			else if (input == 6) {
				if (staffVector.isEmpty()) {
					System.out.println("You have not added any staffs!");
				} else {
					for (Staff staff : staffVector) {
						System.out.print(staff);
					}
				}
			}
			else if (input == 7) {
				System.out.println("Exiting program.");
				break;
			}
			else if (input == 8){
				System.out.println("1. Get names of all persons");
				System.out.println("2. Get address");
				System.out.println("3. Set new address");
				int editor = scanner.nextInt();
				scanner.nextLine();

				if (editor == 1) {
					int i = 1;
					for (Person person : personVector) {
						System.out.println(i + ". " + person.getName());
						i++;
					}
				}
				else if (editor == 2) {
					System.out.println("Enter name: ");
					String name = scanner.nextLine();
//					scanner.nextLine();

					for (Person person : personVector) {
						if (person.getName().equalsIgnoreCase(name)) {
							if (person.getAddress() == null) {
								System.out.println("No address for this student");
							} else {
								System.out.println("Address of " + person.getName() + ": " + person.getAddress());
							}
						} else {
							System.out.println("Person not found!");
						}
					}
				}
				else if (editor == 3) {
					System.out.println("Enter name: ");
					String name = scanner.nextLine();
					System.out.println("Enter new address: ");
					String newAddress = scanner.nextLine();
					scanner.nextLine();

					for (Person person : personVector) {
						if (person.getName().equalsIgnoreCase(name)) {
							person.setAddress(newAddress);
							System.out.println("New address of " + person.getName() + ": " + person.getAddress());
						} else {
							System.out.println("Person not found!");
						}
					}
				}
			}
			else if (input == 9){
				System.out.println("1. Get names of all students");
				System.out.println("2. Get program");
				System.out.println("3. Set new program");
				System.out.println("4. Get year");
				System.out.println("5. Set new year");
				System.out.println("6. Get fee");
				System.out.println("7. Set new fee");
				int editor = scanner.nextInt();
				scanner.nextLine();

				if (editor == 1) {
					int i = 1;
					for (Student student : studentVector) {
						System.out.println(i + ". " + student.getName());
						i++;
					}
				}
				else if (editor == 2) {
					System.out.println("Enter name: ");
					String name = scanner.nextLine();
					scanner.nextLine();

					for (Student student : studentVector) {
						if (student.getName().equalsIgnoreCase(name)) {
							System.out.println("Program of " + student.getName() + ": " + student.getProgram());
						} else {
							System.out.println("Student not found!");
						}
					}
				}
				else if (editor == 3) {
					System.out.println("Enter name: ");
					String name = scanner.nextLine();
					System.out.println("Enter new program: ");
					String newProgram = scanner.nextLine();
					scanner.nextLine();

					for (Student student : studentVector) {
						if (student.getName().equalsIgnoreCase(name)) {
							student.setProgram(newProgram);
							System.out.println("New program of " + student.getName() + ": " + student.getProgram());
						} else {
							System.out.println("Student not found!");
						}
					}
				}
				else if (editor == 4) {
					System.out.println("Enter name: ");
					String name = scanner.nextLine();
					scanner.nextLine();

					for (Student student : studentVector) {
						if (student.getName().equalsIgnoreCase(name)) {
							System.out.println("Year of " + student.getName() + ": " + student.getYear());
						} else {
							System.out.println("Student not found!");
						}
					}
				}
				else if (editor == 5) {
					System.out.println("Enter name: ");
					String name = scanner.nextLine();
					System.out.println("Enter new year: ");
					int year = scanner.nextInt();
					scanner.nextLine();

					for (Student student : studentVector) {
						if (student.getName().equalsIgnoreCase(name)) {
							student.setYear(year);
							System.out.println("New year of " + student.getName() + ": " + student.getYear());
						} else {
							System.out.println("Student not found!");
						}
					}
				}
				else if (editor == 6) {
					System.out.println("Enter name: ");
					String name = scanner.nextLine();
					scanner.nextLine();

					for (Student student : studentVector) {
						if (student.getName().equalsIgnoreCase(name)) {
							System.out.println("Fee of " + student.getName() + ": " + student.getFee());
						} else {
							System.out.println("Student not found!");
						}
					}
				}
				else if (editor == 7) {
					System.out.println("Enter name: ");
					String name = scanner.nextLine();
					System.out.println("Enter new fee: ");
					double fee = scanner.nextDouble();
					scanner.nextLine();

					for (Student student : studentVector) {
						if (student.getName().equalsIgnoreCase(name)) {
							student.setFee(fee);
							System.out.println("New fee of " + student.getName() + ": " + student.getFee());
						} else {
							System.out.println("Student not found!");
						}
					}
				}
			}
			else if (input == 10) {
				System.out.println("1. Get names of all staff");
				System.out.println("2. Get school");
				System.out.println("3. Set new school");
				System.out.println("4. Get pay");
				System.out.println("5. Set new pay");
				int editor = scanner.nextInt();
				scanner.nextLine();

				if (editor == 1) {
					int i = 1;
					for (Staff staff : staffVector) {
						System.out.println(i + ". " + staff.getName());
						i++;
					}
				}
				else if (editor == 2) {
					System.out.println("Enter name: ");
					String name = scanner.nextLine();
					scanner.nextLine();

					for (Staff staff : staffVector) {
						if (staff.getName().equalsIgnoreCase(name)) {
							System.out.println("School of " + staff.getName() + ": " + staff.getSchool());
						} else {
							System.out.println("Staff not found!");
						}
					}
				}
				else if (editor == 3) {
					System.out.println("Enter name: ");
					String name = scanner.nextLine();
					System.out.println("Enter new school: ");
					String newSchool = scanner.nextLine();
					scanner.nextLine();

					for (Staff staff : staffVector) {
						if (staff.getName().equalsIgnoreCase(name)) {
							staff.setSchool(newSchool);
							System.out.println("New school of " + staff.getName() + ": " + staff.getSchool());
						} else {
							System.out.println("Staff not found!");
						}
					}
				}
				else if (editor == 4) {
					System.out.println("Enter name: ");
					String name = scanner.nextLine();
					scanner.nextLine();

					for (Staff staff : staffVector) {
						if (staff.getName().equalsIgnoreCase(name)) {
							System.out.println("Pay of " + staff.getName() + ": " + staff.getPay());
						} else {
							System.out.println("Staff not found!");
						}
					}
				}
				else if (editor == 5) {
					System.out.println("Enter name: ");
					String name = scanner.nextLine();
					System.out.println("Enter new pay: ");
					double pay = scanner.nextDouble();
					scanner.nextLine();

					for (Staff staff : staffVector) {
						if (staff.getName().equalsIgnoreCase(name)) {
							staff.setPay(pay);
							System.out.println("New pay of " + staff.getName() + ": " + staff.getPay());
						} else {
							System.out.println("Staff not found!");
						}
					}
				}
			}
			else {
				System.out.println("Invalid choice");
			}

			System.out.println("\n1. Add person");
			System.out.println("2. Add student");
			System.out.println("3. Add staff");
			System.out.println("4. Show all persons");
			System.out.println("5. Show all students");
			System.out.println("6. Show all staff");
			System.out.println("7. Quit");
			System.out.println("8. Edit Person");
			System.out.println("9. Edit student");
			System.out.println("10. Edit staff");
			System.out.print("Enter your choice: ");

		}
		
		scanner.close();
	}
}
