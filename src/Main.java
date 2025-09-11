
public class Main {
    public static void main(String[] args) {

        // problema 1

        String nombre = "Fabricio";

        int edad = 30;

        System.out.println("Mi nombre es " + nombre + " y tengo " + edad + " años");

        // problema 2

        final double pi = 3.14;

        int radio = 5;

        System.out.println(pi * (radio * radio));

        // problema 3,4

        int numero = 5;

        if (numero < 0) {
            System.out.println(" El numero es negativo ");

        } else if (numero > 0) {
            System.out.println(" El numero es positivo");
        }

        // problema 5

        int nota = 80;

        if (nota >= 90) {
            System.out.println(" La nota es sobresaliente ");
        } else if (nota < 90 && nota >= 70) {
            System.out.println(" La nota es aprobado ");
        } else if (nota < 70) {
            System.out.println(" La no es reprobado");
        }

        // problema 6

        int numeroA = 5;
        int numeroB = 10;

        if (numeroA < numeroB) {
            System.out.println(" a es menor que b");
        } else {
            System.out.println(" el numero es mayor");
        }

        // problema 7

        int n = 5;

        int par = n % 2;

        if (par == 0) {
            System.out.println(" el numero es par");
        } else {
            System.out.println(" el numero es impar");
        }

        // problema 8

        int años = 20;

        if (años < 18) {
            System.out.println(" Es menor de edad");
        } else {
            System.out.println(" Es mayor de edad ");
        }

        // problema 9

        int dia = 4;

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
        }

        // problema 10

        int precio = 40;

        boolean rebaja = true;
        boolean norebaja = false;

        if (precio >= 40) {
            System.out.println(rebaja);
        }  else {
            System.out.println(norebaja);
        }

        if ( rebaja ){
            System.out.println((precio * 90)/100 );
        } else{

        }


    }
}

