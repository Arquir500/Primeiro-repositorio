import java.util.Locale;
public class idioma {
    public static void main(String[]args){
        Locale loc = Locale.getDefault();
        String Idioma = loc.getDisplayLanguage();
        System.out.println("O seu sistema está em " + Idioma );
    }
    
}
