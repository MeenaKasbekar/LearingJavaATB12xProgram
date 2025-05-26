//Triangle Classification
//equilateral (all sides are equal)
//isosceles (exactly two sides are equal)
//scalene (no sides are equal)
//Take user input three sides i.e n1,n2,n3

package Tasks;
import java.util.Scanner;
public class Task_Triangle_Classification {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter side1: ");
        int n1= scanner.nextInt();

        System.out.println("Enter side2: ");
        int n2= scanner.nextInt();

        System.out.println("Enter side3: ");
        int n3= scanner.nextInt();

        if(n1==n2 && n2==n3){
            System.out.println("Triangle is equilateral");
        }
        else if (n1==n2 || n1==n3 ||n2==n3) {
            System.out.println("Triangle is isosceles");
        }
        else {
            System.out.println("Triangle is scalene");
        }
    }
}
