public class Funciones {

    public static void main(String[] args) {
        double y=3;
        System.out.println(areaCirculo(y));//mandamos a llamar nuestra
        // funcion y le asignamos el valor de y

        System.out.println("Pesos a dolares: "+converDolar( 1000,  "MXN"));

    }

    /**
     * Descripción: Funcion que especificando el radio calcula el area de un circulo
     *
     * @param r Radio del circulo
     * */
    public static double areaCirculo(double r){//creamos nuestra
        // funcion area circulo
        return Math.PI * Math.pow(r,2);
    }
    /**
     * Descripcion: Funcion que especificando su moneda convierte una cantidad de pesos a dolares
     *
     * @param quantity Cantidad de dinero
     * @param currency Tipo de moneda
     * @return quantity devuelve la cantidad actualizada en dolares
     * */
    public static double converDolar(double quantity, String currency){
        /* MXN = PESOS MEXICANOS    COP = PESOS COLOMBIANOS   */
        switch (currency){
            case "MXN":
                quantity = quantity * 0.052;
                break;
            case "COP":
                quantity = quantity * 0.00031;
                break;
        }
        return quantity;
    }
}
