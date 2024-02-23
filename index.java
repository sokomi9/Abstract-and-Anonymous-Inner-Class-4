abstract class Laptop
{
    public abstract void laptopModel();
    public abstract void software();
}
public class index {

    public static void main(String[] args) {
        Laptop obj = new Laptop() {
            public void laptopModel(){
                System.out.println("HP");
            }
            public void software(){
                System.out.println("Windows 10");
            }
        };
        obj.laptopModel();
        obj.software();
    }
}
