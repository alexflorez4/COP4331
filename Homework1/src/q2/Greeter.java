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


/*
 a. Write a new method for the Greeter class,

	 public void swapNames(Greeter other) {...}

that swaps the names of this greeter and another instance.


b. write a new method for the Greeter class:
   	public Greeter createQualifiedGreeter(String qualifier) { ..... }
that returns a new Greeter object with its name being the qualifier string followed by
" " and the executing greeter's name (i.e. this.name).
For example:
	Greeter g = new Greeter("world");
	Greeter g2 = g.createQualifiedGreeter("beautiful");

g2.name will be the string "beautiful world"

c. Write a GreeterTester class that shows how the swapNames() and the createQualifiedGreeter()
methods are used.


Write javadoc comments.
Include both java files in your solution document.
 */