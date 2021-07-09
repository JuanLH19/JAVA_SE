public class ActualizandoVariables {
    public static void main(String[] args) {
        int salary = 1000;
        //bono $200
        salary = salary + 200;//Actualizamos el valor de la variable concatenandolo con otro valor con '+'
        System.out.println(salary);

        //Comida $50
        salary = salary-50;
        System.out.println(salary);

        //2horas extra 30c/u y 45 de pasaje
        salary = salary+(30*2)-45;
        System.out.println(salary);

        //Actualizando cadenas de texto
        String employeeName = "Juan de Dios";
        employeeName = employeeName + "Leyva Hernández";//Actualizamos el valor de la variable tipo string
        System.out.println(employeeName);

    }
}
