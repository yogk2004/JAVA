class cellphone{
    public void Ringing_method(){
        System.out.println("The phone is ringing.");
    }
    void vibrate_method(){
        System.out.println("The phone is vibrating.");
    }

    void message_method(){
        System.out.println("There is a unread message.");
    }
}
public class Practice_Set_08_Problem_02 {
    public static void main(String[] args) {
        cellphone obj = new cellphone();
        System.out.println("Printing all its functionalities: ");
        System.out.println("");
        obj.Ringing_method();
        obj.message_method();
        obj.vibrate_method();
    }
}