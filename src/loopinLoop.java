import java.util.Scanner;

public class loopinLoop {
    public static void main(String[]args){
        Scanner scaner = new Scanner(System.in);
        int linhas;
        int colunas;
        String simbolo = "";
    System.out.println("Me fale o numero de linhas: ");
    linhas = scaner.nextInt();
    System.out.println("Me fale o numero de colunas: ");
    colunas = scaner.nextInt();
    System.out.println("Me fale o simbolo que deseja para usar: ");
    simbolo = scaner.next();

    for(int i=1; i<=linhas; i++){
        System.out.println();
        for (int j=1; j<=colunas; j++){
            System.out.print(simbolo);

        }
    }
    }
}
