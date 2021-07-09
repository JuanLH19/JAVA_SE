public class OperacionesMatematicas {
    public static void main(String[] args) {
        double j = 2.1;
        double u = 3;

        /*Java cuenta ya con una clase llamada Math con varias
        funciones matemáticas. */
        System.out.println(Math.PI);//Imprime el valor de PI
        System.out.println(Math.E);//Imprime exponencial de Eulor

        System.out.println(Math.ceil(j));//devuelve un entero hacia arriba
        System.out.println(Math.floor(j));//devuelve un entero hacia abajo

        System.out.println(Math.pow(u,j));//Eleva el primer numero a la potencia del segundo
        System.out.println(Math.max(j,u));//Devuelve el numero mayor

        System.out.println(Math.sqrt(u));//devuelve la raiz cuadrada

        /*Formula para calcular el area de un circulo*/
        System.out.println(Math.PI + Math.pow(u,2));//pi * r2




    }
}
