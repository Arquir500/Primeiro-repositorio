import java.util.Scanner;
    public class estruturaCondicional1{

        public static void main(String[] args){

            Scanner teclado = new Scanner(System.in);
            System.out.println("Primeira nota: ");
            float nota1 = teclado.nextFloat();
            System.out.println("Segunda nota: ");
            float nota2 = teclado.nextFloat();
            float media = (nota1+nota2)/2;
            System.out.println("Sua média foi "+ media);
            if (media>8){
                System.out.println("Parabéns, você foi incrível");
            }
        }
}
