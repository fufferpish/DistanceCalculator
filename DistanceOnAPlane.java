import java.util.*;
public class DistanceOnAPlane {
    public static void main(String [] args)
    {
        double x1,x2,y1,y2;
        System.out.println("Tool made by Kaden Frisk.");
        System.out.println("This will calculate distance on a coordinate plane!");

        //Input
        Scanner scan = new Scanner(System.in);

        System.out.print("What is x1? ");
        x1 = Double.parseDouble(scan.next());
        
        System.out.print("What is y1? ");
        y1 = Double.parseDouble(scan.next());
        
        System.out.print("What is x2? ");
        x2 = Double.parseDouble(scan.next());

        System.out.print("What is y2? ");
        y2 = Double.parseDouble(scan.next());
        
        scan.close();
        
        //Solving
        double answer = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));

        //Output
        System.out.printf("The distance from (%.0f,%.0f) to (%.0f,%.0f) is %.2f.\n", x1, y1, x2, y2, answer);
        
        
    }
}
