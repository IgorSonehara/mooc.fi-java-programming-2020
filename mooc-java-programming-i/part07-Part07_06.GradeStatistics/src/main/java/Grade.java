
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author igor
 */
public class Grade {
    private ArrayList <Double> points;
    private double passing;
    
    public Grade() {
        this.points = new ArrayList<>();
        this.passing = 0;
    }
    
    public void add(double num) {
        this.points.add(num);
    }
    
    public double getAverageAll() {
        double sum = 0;
        for (Double i: points) {
            sum += i;
        }
        return sum / points.size();
    }
 
    public double getAveragePassing() {
        double sum = 0;
        for (Double i: points) {
            if (i >= 50) {
                sum += i;
                this.passing++;
            }
        }
        if (sum == 0) {
            return 0;
        }
        return sum / this.passing;
    }
    
    public double getPercentage() {
        return (100 * this.passing) / points.size();
    }
    
    public void printGrade() {
        int zero = 0, one = 0, two = 0, three = 0, four = 0, five = 0;
        for (Double i: points) {
            if (i < 50) {
                zero++;
            } else if (i < 60) {
                one++;
            } else if (i < 70) {
                two++;
            } else if (i < 80) {
                three++;
            } else if (i < 90) {
                four++;
            } else if (i >= 90) {
                five++;
            }
        }
        int i = 0;
        System.out.print("5: ");
        while (i < five) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
        i = 0;
        System.out.print("4: ");
        while (i < four) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
        i = 0;
        System.out.print("3: ");
        while (i < three) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
        i = 0;
        System.out.print("2: ");
        while (i < two) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
        i = 0;
        System.out.print("1: ");
        while (i < one) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
        i = 0;
        System.out.print("0: ");
        while (i < zero) {
            System.out.print("*");
            i++;
        }
    }
}
