public class Arreglos {
    public static void main(String[] args) {
        String androidVersions [] = new String[17];//Declaramos nuestro
        //arreglo con 17 espacios en memoria
        String days [] = new String[7];

        String cities [][] = new String[4][2];//Arreglo de 2 dimensiones
        //Primer [] indica espacios hacia abajo y el segundo hacia la
        // deracha

        int numbers [][][] =  new int[2][2][2];//arreglo de 3 dimensiones
        //se recomienda en estos casos usar mejor bases de datos

        androidVersions[0]="Apple Pie";
        androidVersions[1]="Banana Bread";
        androidVersions[2]="Cupcake";
        androidVersions[3]="Donut";

        for (int i = 0; i <= androidVersions.length; i++) {//Ciclo for que evita que mandemos tantas lineas de codigo
            //automatizandolas de acuerdo a que i sea menor o igual que el tamaño del arreglo
            System.out.println(androidVersions[i]);//imprime el dato de acuerdo a la posicion que ocupe i en ese momento

        }
        /*
        System.out.println(androidVersions[0]);
        System.out.println(androidVersions[1]);
        System.out.println(androidVersions[2]);
        System.out.println(androidVersions[3]);
        */

        System.out.println();
        System.out.println();

        cities[0][0]= "Colombia";
        cities[0][1]= "Medellin";
        cities[1][0]= "Colombia";
        cities[1][1]= "Bogota";
        cities[2][0]= "Mexico";
        cities[2][1]= "Guadalajara";
        cities[3][0]= "Mexico";
        cities[3][1]= "CDMX";

        for (int i = 0; i <= cities.length; i++) {//ciclo for para nuestro primer arreglo
            for (int j = 0; j < cities[i].length; j++) {//ciclo for para nuestro segundo arreglo siendo asi un for anidado
                System.out.println(cities[i][j]);
            }
        }
        /*
        System.out.println(cities[0][0]);//INSErtamos datos en el arreglo de acuerdo a la posiciones
        System.out.println(cities[0][1]);
        System.out.println(cities[1][0]);
        System.out.println(cities[1][1]);
        System.out.println(cities[2][0]);
        System.out.println(cities[2][1]);
        System.out.println(cities[3][0]);
        System.out.println(cities[3][1]);
        */

    }
}
