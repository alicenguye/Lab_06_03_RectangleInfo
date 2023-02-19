import java.util.Scanner;

import static java.lang.Math.*;
import static jdk.nashorn.internal.objects.NativeMath.sqrt;

public class Main {
    public static void main(String[] args) {
        //declaration of variable
        int length= 0;
        int width= 0;
        double diagonal= 0;
        int perimeter=0;
        int area=0;
        String trash="";
        //create new scanner
        Scanner in = new Scanner(System.in);
        // asking user to enter and input
        System.out.println("enter the length: ");
        if(in.hasNextInt())
        {
            length = in.nextInt();
            in.nextLine(); // clear the buffer
        }
        else{
            trash = in.nextLine();
            System.out.println("Must enter a valid number for length: "+" "+ trash);
        }
        System.out.println("enter the width: ");
        if(in.hasNextInt())
        {
            width = in.nextInt();
            in.nextLine(); // clear the buffer
        }
        else{
            trash = in.nextLine();
            System.out.println("Must enter a valid number for width: "+" "+ trash);
        }
        //calculation the area, perimeter and diagonal
        area = length*width;
        perimeter = 2* (length + width);
        diagonal= Math.sqrt(Math.pow(length,2)+Math.pow(width,2));
        //display output for user
        System.out.println("the area of rectangle is: "+area);
        System.out.println("the perimeter of rectangle is: "+perimeter);
        System.out.println("the diagonal of rectangle is: "+diagonal);

    }

}
