package types;

/**
 * this type of inner class is defined within a method or a scope block.
 * it has access to the members of the enclosing class as well as the local variables and parameters of the method or
 * scope block in which it is defined
 * local inner classes are not accessible outside the method or scope block
 */
public class LocalInnerClass {

    public void someMethod(){
        //method body

        class LocalInnerClassIn{

            //local inner class body

        }
    }
}
