import java.util.Scanner;

public class W3_Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double bonus = 0; 
        double newSalary = 0; 

        System.out.print("Salarys: ");
        double salary = input.nextDouble();

        if (salary * 10 / 100 <= 5000) {
            bonus = salary * 12.5 / 100; 
            newSalary = salary + bonus;

            System.out.println("Salary: " + salary);
            System.out.println("10%: " + salary * 10 / 100);
            System.out.println("Bonus: " + bonus);
            System.out.println("New Salary: " + newSalary);
        } else {
            bonus = salary * 2.5 / 100;  
            newSalary = salary + bonus;
            
            System.out.println("Salary: " + salary);
            System.out.println("10%: " + salary * 10 / 100);
            System.out.println("Bonus: " + bonus);
            System.out.println("New Salary: " + newSalary);
        }
    }
}
