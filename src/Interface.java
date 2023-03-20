import javax.swing.JOptionPane;

public class Interface {
    public static void main(String[] args) {
       String nome = JOptionPane.showInputDialog("Qual o seu nome?");
       int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua Idade? "));
       JOptionPane.showMessageDialog(null,"Olá " +nome+" Você têm "+idade+" anos");
       
    }   
}
