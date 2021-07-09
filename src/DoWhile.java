import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        int response;

        do {//se estara ejecutando lo conteniedo en el bloque
            System.out.println("Selecciona el numero de la opción deseada: ");
            System.out.println("1.- Movies");
            System.out.println("2.- Series");
            System.out.println("3.- Salir");

            Scanner sc = new Scanner(System.in);//clase para leer del teclado
            response = Integer.valueOf(sc.nextLine());//se captura la respuesta del usuario

            switch (response){
                case 0:
                    System.out.println("Gracias por visitarnos");
                    break;
                case 1:
                    System.out.println("Movies");
                    break;
                case 2:
                    System.out.println("series");
                    break;
                default:
                    System.out.println("Seleccione una opcion valida");
            }
        }while (response != 0);//se ejecutara hasta que se cumpla esta condicion
    }
}
