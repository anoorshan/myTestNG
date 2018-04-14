public class User {
    private String userName;
    private int userId;
    private String email;
    private String telNum;

    public User(String userName, int userId, String email, String telNum) {
        this.userName = userName;
        this.userId = userId;
        this.email = email;
        this.telNum = telNum;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelNum() {
        return telNum;
    }

    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }
}
