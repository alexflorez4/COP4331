package q2;

public class GreeterTester
{
    /**
     This method creates two Greeter objects to test the Greeter class.
     Testing swapNames, first prints the objects names, then call the method,
     then prints again the objects with the names swapped.
     Testing createQualifiedGreeter, calls the method which returns a new object.
     @param args unused
     */
    public static void main(String[] args)
    {
        Greeter worldGreeter = new Greeter("World");
        Greeter beer = new Greeter(" of Beer");

        System.out.println("Testing Swap Names: \n\n- Before: -");
        System.out.println("worldGreeter name: " + worldGreeter.getName());
        System.out.println("beer name: " + beer.getName());

        worldGreeter.swapNames(beer);

        System.out.println("- After: - \nworldGreeter name: " + worldGreeter.getName());
        System.out.println("beer name: " + beer.getName());

        System.out.println("\nTesting createQualifiedGreeter: \n");
        Greeter newWorld = beer.createQualifiedGreeter("Awesome");
        System.out.println(newWorld.getName());
    }
}
