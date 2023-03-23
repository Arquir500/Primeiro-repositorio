public class arrays2d {
    public static void main(String[] args){

        String [][] carros = new String[3][3];

        carros[0][0]= "Camaro";
        carros[0][1]= "Mustangue";
        carros[0][2]= "Fusca";
        carros[1][0]= "Caminhonete";
        carros[1][1]= "Tesla";
        carros[1][2]= "Van";
        carros[2][0]= "Ferrari";
        carros[2][1]= "Lamborguini";
        carros[2][2]= "Corvette";
        for(int i=0; i<carros.length; i++){
            System.out.println();
            for(int j=0; j<carros[i].length; j++)
                System.out.print(carros[i][j]+" ");

        }
    }
}
