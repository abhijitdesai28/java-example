package types;

/**
 * this type of inner class is defined as static within the outer class
 * it does not have access to the instance members of outer class,only to the static members
 * to create an instance of static nested class ,u don't need an instance of outer class
 */
public class StaticNestedClass {

    //body of outer nested class

    static class StaticNestedClassInner{

        //body of inner static nested class

    }

}
