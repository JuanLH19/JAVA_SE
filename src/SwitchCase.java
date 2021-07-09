public class SwitchCase {
    public static void main(String[] args) {
        String colorMode ="Dark";

        switch (colorMode){//Inicializamos nuestro switch con
            case "Light"://case que se cumplira si es Light
                System.out.println("Seleccionaste Light " +
                        "mode");
                break;
            case "Night"://Case que se cumplira si se es Night
                System.out.println("Seleccionaste " +
                        "Night Mode");
                break;
            case "Dark"://Case que se cumplira si se es Dark
                System.out.println("Seleccionaste " +
                        "Dark Mode");
                break;
            default://Accion que hace el sistema por default si no se
                //elige una opcion correcta
                System.out.println("Seleccione una opcion valida");

        }
    }
}
