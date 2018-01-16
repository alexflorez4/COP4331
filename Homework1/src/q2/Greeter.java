package q2;

public class Greeter{

    public Greeter(String s)
    {
    }

    public static void main(String[] args) {


        int x = 0;
        try {
            Greeter g1 = new Greeter("Alice");
            Greeter g2 = new Greeter("Alice");

            if (g1.sayHello() != g2.sayHello()) {
                g2 = null;
                System.out.println("q2 is null");
            }
            x = 1;
            System.out.println(g2.sayHello());
            x = 2;
        } catch (NullPointerException ex) {
            x++;
        } catch (RuntimeException ex) {
            x = 4;
        } finally {
            x++;
            System.out.println(x);
        }
    }

    private String sayHello() {
               return new String("Hey");
    }
}
