import java.text.SimpleDateFormat;
import java.util.Date;

public class AnonymousUser extends User {
    public AnonymousUser(String nickName, long lastLogin, Date entryDate) {
        super(nickName, lastLogin, entryDate);
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SSS");
        long ll = System.currentTimeMillis() - lastLogin*1000;

        return "Hello " + nickName + ",\n\nYou have been registered since " + entryDate + " and this is the last time you have logged into the system:\n" +
                "-Last login: " + dateFormat.format(new Date(ll)) + "\n\n" +
                "Best regards,\n" +
                "Systemadministrator\n";
    }
}
