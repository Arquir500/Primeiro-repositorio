public class switchTest {
    public static void main(String[]args){
        String dia = "Sexta";
        switch(dia){
            case "Sábado": System.out.println("Sabadou! com S de Saudade do que não vivemos ainda");
            break;
            case "Domingo": System.out.println("Domingou! com D de doi demais amanhã e segunda");
            break;
            case "Segunda": System.out.println("Segundou! com S de solitudo, foco na semana");
            break;
            case "Terça": System.out.println("Terçou! com T de Tente novamente mais tarde");
            break;
            case "Quarta": System.out.println("Quartou! com Q de Querida, ainda e quarta volta a trabalhar");
            break;
            case "Quinta": System.out.println("Quintou! com Q de quero que chegue na Sexta logo");
            break;
            case "Sexta": System.out.println("SEXTOUU! com S de Só quero aproveitar e curtir");
            break;
            default: System.out.println("Esse não é um dia da semana!");
        }
    }
    
}
