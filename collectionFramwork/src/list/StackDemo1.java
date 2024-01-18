package list;

import java.util.Stack;

public class StackDemo1
{
    public static void main(String[] args) {
        //create stack list which accept only String value
        Stack<String> stack=new Stack<String>();

        //adding element in stack using -push() method
        stack.push("java");
        stack.push("c++");
        stack.push("python");
        stack.push("php");
        stack.push("html");
        stack.push("javaScript");
        stack.push("c");

        //print stack
        System.out.println("stack contains elements :"+stack);//[java, c++, python, php, html, javaScript, c]

        //remove element from stack using -pop() method -it will remove last element
        stack.pop();
        System.out.println("removing element from stack :"+stack);//[java, c++, python, php, html, javaScript]

        //print the size of element of stack - using size() method
        System.out.println("size of stack :"+stack.size());//6

        //remove html from stack
        System.out.println("before removing stack :"+stack);//[java, c++, python, php, html, javaScript]
        stack.remove("html");
        System.out.println("stack after removing HTML :"+stack);//[java, c++, python, php, javaScript]

        //print the capacity of the stack
        System.out.println("capacity of stack :"+stack.capacity());//10

        //print all the element from stack using for each loop
        System.out.println("printing element from stack using for each loop :");
        for (String s:stack)
        {
            System.out.print(s+" ");//java c++ python php javaScript
        }
    }
}
