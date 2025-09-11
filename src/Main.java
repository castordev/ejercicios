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
        String pasword = "1234";




    }
}