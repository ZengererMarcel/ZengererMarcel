import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        RegisteredUser registeredUser = new RegisteredUser("Ranesic", 86400, setDate("08/04/2018 16:25:33", dateFormat), "marcel@gmail.com", "Marcel Zengerer", "256503");
        System.out.println(registeredUser.toString());

        newLine();

        AnonymousUser anonymousUser = new AnonymousUser("Baku", 302400, setDate("25/09/2015 23:04:48", dateFormat));
        System.out.println(anonymousUser.toString());

        newLine();

        System.out.println(registeredUser.outputWithPassword());

        newLine();

        System.out.println(registeredUser.outputWithoutPassword());
    }

    public static void newLine(){
        System.out.println("-".repeat(10));
    }

    public static Date setDate(String date, SimpleDateFormat dateFormat) {
        try {
            return dateFormat.parse(date);
        }
        catch (ParseException e){
            return null;
        }
    }
}
