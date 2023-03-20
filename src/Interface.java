import javax.swing.JOptionPane;

public class Interface {
    public static void main(String[] args) {
       String nome = JOptionPane.showInputDialog("Qual o seu nome?");
       int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua Idade? "));
       double peso = Double.parseDouble(JOptionPane.showInputDialog("Qual o seu peso? "));
       double altura = Double.parseDouble(JOptionPane.showInputDialog("Qual sua altura?"));
       String sexo = JOptionPane.showInputDialog("Qual seu Gênero?");
       JOptionPane.showMessageDialog(null,"Olá " +nome+" Você têm "+idade+" anos! você é "+ sexo+" têm "+altura+" de altura é pesa"+peso+" kilos");
       
    }   
}
