public class andOrNot {

    public static void main(String[] args){
    int temp = 10;

    if (temp>30){
        System.out.println("está quente lá fora");
    }
    else if(temp>20 && temp<=30){
        System.out.println("está calor lá fora");
    }
    else if (temp>14 || temp==20){
        System.out.println("O clíma está gostoso");
    }
    else{
        System.out.println("Está gelado");
    }
    }
    
}
