package Week2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Area {
    private int length;
    private int breadth;
    public Area(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public int returnArea(){
        return length * breadth;
    }

    public static void main(String[] args){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter length: ");
            int lengthInt = scanner.nextInt();
            System.out.println();
            System.out.print("Enter breadth: ");
            int breathInt = scanner.nextInt();
            Area area = new Area(lengthInt,breathInt);
            System.out.println("The area is: " + area.returnArea());
        } catch (InputMismatchException err){
            System.out.println(err + "Input should be integer. ");
        }
    }

}
