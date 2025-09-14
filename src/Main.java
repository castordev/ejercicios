//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // ejercicio 1

        int saldo = 2000;

        boolean habilitada = true;
        boolean nohabilitada = false;

        if (saldo > 1000){
            System.out.println( habilitada );
        }else{
            System.out.println( nohabilitada );
        }

        if ( true ){
            System.out.println(" Puede Hacerlo ");

        }else{
            System.out.println(" No puede Hacerlo ");
        }

        // ejercicio 2

        int nota = 40;

        boolean asistencia = true;
        boolean noasistencia = false;

        if (nota >= 60 & true){
            System.out.println( " Aprobado ");
        }else{
            System.out.println( " No Aprobado ");
        }


        // ejercicio 3

        int number = 40;

        if(number >= 50 & number <=100){
            System.out.println(" Esta dentro ");
        }else{
            System.out.println(" No esta dentro ");
        }

        // ejercicio 4

        String user = "admin";
        String pasword = "1224";

        if (user == "admin" && pasword == "1234"){
            System.out.println(" Acceso permitido ");
        }else{
            System.out.println(" Acceso denegado");

        }

        // ejercicio 5

        int precio = 240;



        boolean tarjeta = true;

        if (  precio >= 200 && tarjeta  ){
            System.out.println( (precio * 80)/100);
        } else if( precio >= 200 ){
            System.out.println((precio * 85)/100);
        }else if (precio < 200){
            System.out.println( " No rebaja ");
        }


        // ejercicio 6

        int edad = 1;

        if (edad < 12){
            System.out.println("Niño");
        }else if( edad >= 12 && edad <= 17) {
            System.out.println("Adolescente");
        }else if (edad >= 18 && edad <= 64){
            System.out.println("Adulto");
        }else{
            System.out.println("Adulto mayor");
        }


        // ejercicio 7

        int nm = 12;

        if (nm %5 == 0 && nm %2 == 0){
            System.out.println( "el numero es par y multiplo de 5");
        }else if(nm %5 == 0){
            System.out.println( "el numero es multiplo de 5");
        }else if(nm %2 == 0){
            System.out.println("el numero es par" );
        }else{
            System.out.println("el numero no es par");
        }


        // ejercicio 8

        String pass = "contr@";

        pass.length();

        int longitud = pass.length();
        System.out.println(longitud);

        if ( pass.length() >= 8 && pass.contains("@")){
            System.out.println(" Contraseña es segura ");
        }else{
            System.out.println(" No segura");
        }


        // ejercio 9

        int a = 0;
        int b = 0;

        if( a > 0 && b > 0){
            System.out.println(" ambos son positivos");
        }else if (a < 0 && b < 0){
            System.out.println(" ambos son negativos");
        }else{
            System.out.println(" son diferentes ");
        }


        // ejercicio 10

        int age = 10;

        String ax = age >= 18 ? "es mayor de edad": "no es mayor de edad";
        System.out.println(ax);





    }
}