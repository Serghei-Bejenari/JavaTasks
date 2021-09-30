package com.example.stack;
import java.util.EmptyStackException;

public class RunStack {
 
    public static void main(String[] args) {
        MyStack<String> myStack = new MyStack<>();
        myStack.push("First element");
        myStack.push("Second element");
        myStack.push("Third element");
        System.out.println("Result of peek: " + myStack.peek());
        System.out.println("Popping one item: " + myStack.pop());
        System.out.println("Result of peek after pop: " + myStack.peek());
        System.out.println("Result of empty: " + myStack.empty());
        System.out.println("Popping 2 times");
        myStack.pop();
        myStack.pop();
        System.out.println("Result of empty after pop: " + myStack.empty());
        System.out.println("Trying to peek");
        try {
            myStack.peek();
        } catch (EmptyStackException e) {
            System.out.println("Caught exception: " + e.toString());
        }
    }
 
}