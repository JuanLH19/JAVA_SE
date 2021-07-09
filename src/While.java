public class While {

    static boolean isTurnOnLight = false;

    public static void main(String[] args) {

        turnOnOffLight();
        int i = 1;
        while (isTurnOnLight && i<=10){//while que repetira el encendido
            //y apagado de lampara mientras i sea menor o igual a 10
            printSos();
            i++;
        }
    }

    public static void printSos(){
        System.out.println("...___...");
    }

    public static boolean turnOnOffLight(){
        isTurnOnLight = (isTurnOnLight)?false:true;//Operador
        // ternario entre parentesis la operacion a ejecutar,
        // el primer dato es el primer valor de regreso
        // seguido del segundo
        /* forma de resumir lo contenido en este if
        if (isTurnOnLight){
            isTurnOnLight = false;
        }else{
            isTurnOnLight = true;
        }
        */
        return isTurnOnLight;
    }
}
