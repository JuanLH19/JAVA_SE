public class Casting {
    public static void main(String[] args) {
        int j = 30;
        int u = 12;

        double perro = 30.0/12.0;
        System.out.println(perro);

        //ESTIMACION
        int perroEstimado = (int) perro;//casting de double a int
        System.out.println(perroEstimado);

        //Exactitud
        System.out.println((double) j/u);//casting de int a double
    }
}
