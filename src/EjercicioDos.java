public class EjercicioDos {
    public static void main(String[] args) {
        /* Usando los dos tipos de casting que aprendiste (implícito y explícito), resuelve los siguientes casteos
        indicando qué tipo es y si se está calculando estimación o exactitud.
        */

char c = 'z'; //conviertelo a int
int i = 250; //conviertelo a long y luego de long a short
double d = 301.067; //conviertelo a long
int i2 = 100; //súmale 5000.66 y conviertelo a float
int i3 = 737; //multiplícalo por 100 y conviertelo a byte
double d2 = 298.638; //divídelo entre 25 y conviertelo a long

        int conversion1 = c; //Implicito Y Exactitud
        System.out.println(conversion1);

        long conversion2 = i;//Implicito Y Exactitud
        short conversion2_2 = (short) conversion2;//Explicito y Exactitud
        System.out.println(conversion2);
        System.out.println(conversion2_2);

        long conversion3 = (long)d;//Explicito y Estimado
        System.out.println(conversion3);

        double conversion4 = i2+5000.66;//realizamos primero una conversion a double y sumamos
        float conversion4_1 = (float)conversion4;// Explicito y Exacto
        System.out.println(conversion4_1);

        int bite = 13+737;
        byte conversion5 = (byte)bite;//Explicito y Exacto
        System.out.println(conversion5);

        long conversion6 = (long)d2/25;
        System.out.println(conversion6);//Explicito y Estimado


    }
}
