import java.util.Scanner; 
public class assignment3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
       double radius= s.nextDouble();
       double perimeter;
       double area;

        perimeter=2*Math.PI*radius;
        area=Math.PI*(radius*radius);
        System.out.print(perimeter+"\n");
        System.out.print(area);

    }
}
