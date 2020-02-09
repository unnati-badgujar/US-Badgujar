package Inheritance;


/*What about the diamond problem?
The “diamond problem” is an ambiguity that can arise as a consequence of allowing multiple inheritance. It is a serious problem for languages (like C++) that allow for multiple inheritance of state. In Java, however, multiple inheritance is not allowed for classes, only for interfaces, and these do not contain state.

Consider the following situation:

    interface A {
        default void m() { ... }        
    }
    interface B extends A {}
    interface C extends A {}
    class D implements B, C {}

The rules for default method selection given on the previous page provide a straightforward interpretation of this scenario and its variants.

In the initial case (the code above), the implementation of m inherited by D is unambiguously that defined by A—there is no other possibility. If the situation is changed so that B now also declares a default implementation of m, that becomes the implementation that D inherits by the “most specific implementation” rule. But if both B and C provide default implementations, then they conflict, and D must provide an overriding declaration, possibly using the syntax X.super.m(...) in the body of m to explicitly choose one of the inherited methods. All three cases are clearly covered by the rules for method resolution explained in the previous answer.

Default methods are virtual, like all methods in Java. This can sometimes lead to surprising results. Given the declarations

 
will print hello from B. The static type of c is unimportant; what counts is that it is an instance of D, whose most specific version of m is inherited from B.
*/

interface A {
default void m() { System.out.println("hello from A"); }
}
interface B extends A {
default void m() { System.out.println("hello from B"); }
}
interface C extends A {}
class D implements B, C {}
public class DimondRingProblem {
	public static void main(String[] args) {

	    C c = new D();
	    c.m();
	}

}
