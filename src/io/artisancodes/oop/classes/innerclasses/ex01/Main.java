package io.artisancodes.oop.classes.innerclasses.ex01;

/**
 * Java Inner Classes
 */
class OuterClass {
    int x = 10;

    class InnerClass {
        int y = 5;
    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass myOuterClass = new OuterClass();
        OuterClass.InnerClass myInnerClass = myOuterClass.new InnerClass();
        System.out.println(myInnerClass.y + myOuterClass.x);
    }
}
