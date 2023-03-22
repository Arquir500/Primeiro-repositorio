import java.util.Scanner;

public class WhileRepeticao {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        String nome = "";

        do{
            System.out.print("Qual o seu nome? ");
            nome = scanner.nextLine();
        } while(nome.isBlank());
        System.out.println("Olá "+ nome);

    }    
}