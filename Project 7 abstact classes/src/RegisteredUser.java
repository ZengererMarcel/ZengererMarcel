import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RegisteredUser extends User implements FormattedOutput{
    String mailAddress;
    String username;
    String password;

    /**
     * Constuctor for Registered User
     *
     * @param nickName The nickname
     * @param lastLogin When was the last login
     * @param entryDate When did the Person registered
     * @param mailAddress The E-Mail
     * @param username The username of the Person
     * @param password The password of the Person
     */
    public RegisteredUser(String nickName, long lastLogin, Date entryDate, String mailAddress, String username, String password) {
        super(nickName, lastLogin, entryDate);
        this.mailAddress = mailAddress;
        this.username = username;
        this.password = password;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SSS");
        long ll = System.currentTimeMillis() - lastLogin*1000;
        return  "Hello " + username + ",\nYou have been registered since " + entryDate + " and have provided the following information:\n" +
                "-Mail address: " + mailAddress +"\n-Password: " + password + "\n-Nickname: " + nickName +
                "\n\nThis is the last time you have logged into the system:\n" +
                "-Last login: " + dateFormat.format(new Date(ll))+ "" +
                "\n\nBest regards,\n" +
                "Systemadministrator";
    }

    @Override
    public String outputWithPassword() {
        return "Hello " + username + ",\n\n" +
                "Your password " + password + " was automatically sent to the NSA for further investigation :-)\n\n" +
                "Have a nice day!\n\n" +
                "Best,\n" +
                "Mr. X";
    }

    @Override
    public String outputWithoutPassword() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("HH:mm");
        long ll = System.currentTimeMillis() - lastLogin*1000;
        Date date = new Date(ll);
        return "Hello " + username + ",\n\n" +
                "Some time has passed since the last login - your last login was on the " + dateFormat.format(date) + " at " + dateFormat2.format(date) + ".\n\n" +
                "Best,\n" +
                "Systemadministrator\n";
    }
}
