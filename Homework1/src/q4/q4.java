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

/**
 * int x = 0;
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

 Answer:

 x = 3.

 Assuming that the method sayHello() is implemented/exists.

 Because there is a comparison operator between the 2 objects, q1 & q2, I assume that the methods return something.

 If the methods return a boolean, let's say true, then q1 & q2 will be equal, therefore, x=3.

 Same solution if they return a string that is in the String pool, let's say, return "Hi there".

 However, if the method returns a new String object, the returned values will point to different objects, therefore, q2 will be set to null.
 In this case, after the method q2.sayHello() is called, the catch NullPointerException will be called, finally x =3.

 */

