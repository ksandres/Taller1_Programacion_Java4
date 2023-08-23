import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        double a = x.nextDouble();
        double b = x.nextDouble();
        double c = x.nextDouble();
        
        if (a==b && b==c && a==c){System.out.println("el triangulo es equilatero");
        } else if (a == b && b != c || a != b && b == c || a == c && b != c) {System.out.println("el triangulo es isosceles");
        } else if (a!=b && b!= c && a!= c) {System.out.println("el triangulo es escaleno");
        }else {System.out.println("No es un triangulo valido");}
    }
}