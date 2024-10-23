package lecture_pr;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<User> users = new ArrayList<>();

        while (true){
            System.out.println("Menu: ");
            System.out.println("1. Add User");
            System.out.println("2. List User");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1){
                System.out.println("1. To add student");
                System.out.println("2. To add staff");

                System.out.print("Enter your choice: ");

                int input = sc.nextInt();
                sc.nextLine();

                if (input == 1){
                    System.out.println("Enter id");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter login");
                    String login = sc.nextLine();

                    System.out.println("Enter password");
                    String password = sc.nextLine();

                    System.out.println("Enter name");
                    String name = sc.nextLine();

                    System.out.println("Enter surname");
                    String surname = sc.nextLine();

                    System.out.println("Enter gpa");
                    double gpa = sc.nextDouble();

                    System.out.println("Enter number of courses");
                    int numberOfCourses = sc.nextInt();
                    String[] courses = new String[numberOfCourses];
                    for (int i = 0; i < numberOfCourses; i++) {
                        System.out.println("Enter course number " + (i+1 + ": "));
                        courses[i] = sc.next();
                    }

                    users.add(new Student(id, login, password, name, surname, gpa, courses));
                }
                else if (input == 2){
                    System.out.println("Enter id");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter login");
                    String login = sc.next();

                    System.out.println("Enter password");
                    String password = sc.next();

                    System.out.println("Enter name");
                    String name = sc.next();

                    System.out.println("Enter surname");
                    String surname = sc.next();

                    System.out.println("Enter salary");
                    double salary = sc.nextDouble();

                    System.out.println("Enter number of subjects");
                    int numberOfSubjects = sc.nextInt(); // To determine the number of subjects to input
                    String[] subjects = new String[numberOfSubjects];
                    for (int i = 0; i < numberOfSubjects; i++) {
                        System.out.println("Enter subject " + (i+1 + ": "));
                        subjects[i] = sc.next();
                    }

                    users.add(new Staff(id, login, password, name, surname, salary, subjects));
                }
                else {System.out.println("Invalid choice");}
            }
            else if (choice == 2){
                System.out.println("1. To list student");
                System.out.println("2. To list staff");

                System.out.print("Enter your choice: ");

                int input = sc.nextInt();
                sc.nextLine();

                if (input == 1){
                    int i = 0;
                    for (User user : users){
                        if (user instanceof Student){
                            i++;
                            System.out.println(i + ". " + user.getName());
                        }
                    }

                    if (i == 0){ System.out.println("No students found"); }
                }
                else if (input == 2){
                    int i = 0;
                    for (User user : users){
                        if (user instanceof Staff){
                            i++;
                            System.out.println(i + ". " + user.getName());
                        }
                    }

                    if (i == 0){ System.out.println("No staffs found"); }
                }
                else {System.out.println("Invalid choice");}
            }
            else if (choice == 0){
                System.out.println("Exit");
                break;
            }
            else {System.out.println("Invalid choice");}
        }
    }
}
