public class For {
    static boolean isTurnOnLight = false;

    public static void main(String[] args) {
        turnOnOffLight();
        for (int i = 1; i <= 10; i++) {
            printSos();
        }
    }

    public static void printSos(){
        System.out.println("...___...");
    }

    public static boolean turnOnOffLight(){
        isTurnOnLight = (isTurnOnLight)?false:true;
        return isTurnOnLight;
    }
}
