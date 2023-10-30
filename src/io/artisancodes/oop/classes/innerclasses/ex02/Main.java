package io.artisancodes.oop.classes.innerclasses.ex02;

/**
 * Private Inner Class
 */
class OuterClass {
    int x = 10;

    private class InnerClass {
        int y = 5;
    }

    static class StaticInnerClass {
        int y = 5;
    }
}
public class Main {
    public static void main(String[] args) {
        OuterClass myOuterClass = new OuterClass();

        // OuterClass.InnerClass has private access in OuterClass.
        //OuterClass.InnerClass myInnerClass = myOuterClass.new InnerClass();

        // An inner class can also be static, which means that you can access it without creating an object of the
        // outer class.
        OuterClass.StaticInnerClass myStaticInnerClass = new OuterClass.StaticInnerClass();
        System.out.println(myStaticInnerClass.y);
    }
}
