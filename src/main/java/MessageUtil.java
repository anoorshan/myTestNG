public class MessageUtil {
    private String message;
    // Constructor
    public MessageUtil() {
    }

    // Constructor
    // @param message to be printed
    public MessageUtil(String message) {
        this.message = message;
    }

    // prints the message
    public String printMessage() {
        System.out.println(message);
        return message;
    }

    // add "tutorialspoint" to the message
    public String salutationMessage() {
        message = "tutorialspoint" + message;
        System.out.println(message);
        return message;
    }
    // add "www." to the message
    public String exitMessage() {
        message = "www." + message;
        System.out.println(message);
        return message;
    }
    public void failMessage(){
        System.out.println("执行failMessage");
        int a =0;
        int b = 1/a;
    }
}