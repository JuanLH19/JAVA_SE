public class IncrementoDecremento {
    public static void main(String[] args) {

        int lives = 5;
        lives = lives - 1;
        System.out.println(lives); //4
        /*Incremento postfijo accede al valor anterior de la variable
        * y le aplica posteriormente el incremento*/
        lives--;//Decremento
        System.out.println(lives);//3

        lives++;//Incremento
        System.out.println(lives);//4

        /* Incremento Prefijo Obtiene el dato ya incrementado*/
        int gift = 100 + ++lives;
        System.out.println(gift);
    }
}
