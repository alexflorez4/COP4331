package q4;

/**
 * Answer the question and explain what happens without running the code:
 What is the value of x after the following code is executed ?

 int x = 0;
 try {
 Greeter g1 = new Greeter("Alice");
 Greeter g2 = new Greeter("Alice");

 if (g1.sayHello() != g2.sayHello()) {
 g2 = null;
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
 }
 */
public class q4 {
}
/*
 Answer: x = 3.
 After the objects are created, the condition on the if statement returns true.  The relational operator equal to '==' checks if
 the 2 objects are equal.  In this case they are not.  Therefore g2=null gets executed.
 In System.out when q2 calls the method sayHello(), a null pointer exception occurs because q2 is now null.
 The catch block increases the value of x by 1 and then finally increases again by 1.
 */

