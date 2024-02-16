package types;

/**
 * This is a special type of inner class that does not have a name,
 * it is typically used when you need to define a class on the fly without explicitly creating a separate class
 * anonymous inner classes are declared and instantiated at the same time.
 * they can be used for implementing interfaces or extending classes
 */
public class AnonymousInnerClass {

    public void someMethod(){
        //method body

        Runnable runnable= new Runnable() {
            @Override
            public void run() {
                //
            }
        };
    }
}
