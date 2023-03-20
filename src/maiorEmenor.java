import java.util.Scanner;

public class maiorEmenor {
    public static void main(String[] args){
        double x; 
        double y;

        Scanner variavel = new Scanner(System.in);
        System.out.println("Informe o primeiro valor para comparação: ");
        x = variavel.nextDouble();
        System.out.println("Informe o segundo valor para comparação: ");
        y = variavel.nextDouble();

        if (x>y) {
        System.out.println("O maior número é "+x+" O menor número é "+y);
        } else if (y>x) {
            System.out.println("O maior número é "+y+" O menor número é "+x);
        } else{
            System.out.println("Os números possuem o mesmo valor!");
        }

        
        
    }
    
}
