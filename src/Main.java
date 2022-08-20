import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        String color;
        double lado;

        Scanner x=new Scanner(System.in);
        System.out.println("Ingrese el color del cuadrado");
        color= x.next();
        System.out.println("Ingrese el lado");
        lado= x.nextDouble();
        Cuadrado c1=new Cuadrado(color,lado);
        System.out.println("El area del cuadrado 1 es: " +c1.calcularArea());
        System.out.println("El color del cuadrado 1 es: "+c1.getColor());

        Cuadrado c2=new Cuadrado("Azul",2.3);
        System.out.println("El area del cuadrado 2 es: " +c2.calcularArea());
        System.out.println("El color del cuadrado 2 es: "+c2.getColor());

        Triangulo tr=new Triangulo("verde",3,4);
        System.out.println("El are del triangulo 1 es: "+tr.calcularArea());
        System.out.println("El color del triangulo es: "+tr.getColor());


    }
}
