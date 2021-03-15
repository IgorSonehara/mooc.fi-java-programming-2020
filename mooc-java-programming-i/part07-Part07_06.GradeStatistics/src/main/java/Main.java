 
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Grade grade = new Grade();
 
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            double num = Double.valueOf(scanner.nextLine());
            if (num == -1) {
                break;
            }
            if (num >= 0 && num <= 100) {
                grade.add(num);
            }
        }
        System.out.println("Point average (all): " + grade.getAverageAll());
        double averagePassing = grade.getAveragePassing();
        if (averagePassing != 0) {
            System.out.println("Point average (passing): " + averagePassing);
        } else {
            System.out.println("Point average (passing): -");
        }
        System.out.println("Pass percentage: " + grade.getPercentage());
        System.out.println("Grade distribution: ");
        grade.printGrade();
        
    }
}
