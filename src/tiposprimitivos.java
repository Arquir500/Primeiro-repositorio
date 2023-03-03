import java.util.Scanner;
public class tiposprimitivos {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        Scanner teclado1 = new Scanner(System.in);
        System.out.print("Qual o nome do Aluno?");
        String nome = teclado.nextLine();
        System.out.print("Qual a nota do aluno?");
        float nota = teclado1.nextFloat();
        System.out.format("A sua nota é "+ nota +" "+ nome);
    }
}
