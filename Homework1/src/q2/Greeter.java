package q2;

/**
 * A class for producing simple greetings.
 * either recursion or iteration.
 * @author Alexander Florez
 * @version 1.0
 * @since 01/16/18
 */
public class Greeter
{
    /**
     Constructs a Greeter object that can greet a person or
     entity.
     @param aName the name of the person or entity who should
     be addressed in the greetings.
     */
    public Greeter(String aName)
    {
        name = aName;
    }

    /**
     Greet with a "Goodbye" message.
     @return a message containing "Goodbye" and the name of
     the greeted person or entity.
     */
    public String sayGoodbye()
    {
        return "Goodbye, " + name + "!";
    }

    /**
     Greet with a "Hello" message.
     @return a message containing "Hello" and the name of
     the greeted person or entity.
     */
    public String sayHello()
    {
        return "Hello, " + name + "!";
    }

    /**
     * This method swaps the names of this greeter and another instance.
     * @param other Instance of another Greeter class.
     */
    public void swapNames(Greeter other)
    {
        String temp = this.getName();
        this.setName(other.getName());
        other.setName(temp);
    }

    /**
     * This method returns an object build with the current object name concatenated with a String qualifier
     * @param qualifier String to build the new object name
     * @return New Greeter object
     */
    public Greeter createQualifiedGreeter(String qualifier)
    {
        return new Greeter(qualifier + " " + this.name);
    }

    /**
     * Getter for current object name
     * @return String with object name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Setter for current object name
     * @param name String for setting object name
     */
    public void setName(String name)
    {
        this.name = name;
    }

    private String name;
}