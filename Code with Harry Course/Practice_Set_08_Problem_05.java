class TommyVecetti{
    public void hit(){
        System.out.println("Hitting...");
    }
    public void run(){
        System.out.println("Running...");
    }
    public void fire(){
        System.out.println("Firing...");
    }
}
public class Practice_Set_08_Problem_05 {
    public static void main(String[] args) {
        TommyVecetti obj = new TommyVecetti();
        obj.fire();
        obj.hit();
        obj.run();
    }
}
