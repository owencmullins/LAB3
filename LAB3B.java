import java.util.*;

class LAB3B {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    float hoursc1, hoursc2, hoursc3, hoursc4, gradec1, gradec2, gradec3, gradec4;
    float total = 0, GPA, total_hours = 0;
    System.out.print("Course 1 hours: ");
    hoursc1 = scan.nextFloat();
    System.out.print("Grade for course 1: ");
    gradec1 = scan.nextFloat();
    System.out.print("Course 2 hours: ");
    hoursc2 = scan.nextFloat();
    System.out.print("Grade for course 2: ");
    gradec2 = scan.nextFloat();
    System.out.print("Course 3 hours: ");
    hoursc3 = scan.nextFloat();
    System.out.print("Grade for course 3: ");
    gradec3 = scan.nextFloat();
    System.out.print("Course 4 hours: ");
    hoursc4 = scan.nextFloat();
    System.out.print("Grade four course 4: ");
    gradec4 = scan.nextFloat();
    total_hours = hoursc1 + hoursc2 + hoursc3 + hoursc4;
    total = ((hoursc1 * gradec1) + (hoursc2 * gradec2) + (hoursc3 * gradec3) + (hoursc4 * gradec4));
    GPA = total / total_hours;
    System.out.print("Total hours is: " + total_hours);
    System.out.print("Total quality points is: " + total);
    System.out.print("Your GPA this semester is " + GPA);

  }
}