import java.util.Random;
public class randomicos {
    public static void main(String[] args){
        Random random = new Random();
        int x = random.nextInt(6)+1;
        double y = random.nextDouble(6)+1;
        boolean z = random.nextBoolean();
        System.out.print(x+" ");
        System.out.print(" "+y+" ");
        System.out.print(" "+z);
    }
}
