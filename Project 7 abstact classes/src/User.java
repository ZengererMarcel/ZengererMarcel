import java.util.Date;

public abstract class User {
    String nickName;
    long lastLogin;
    Date entryDate;

    public User(String nickName, long lastLogin, Date entryDate) {
        this.nickName = nickName;
        this.lastLogin = lastLogin;
        this.entryDate = entryDate;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public long getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(long lastLogin) {
        this.lastLogin = lastLogin;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }
}
