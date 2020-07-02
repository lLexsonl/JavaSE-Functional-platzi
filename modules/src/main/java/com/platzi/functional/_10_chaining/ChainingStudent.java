package com.platzi.functional._10_chaining;

public class ChainingStudent {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello,")
                .append("calling")
                .append("from main");

        // test class Chainer
        Chainer chainer = new Chainer();
        chainer.sayHi()
                .sayBye();
    }

    static class Chainer {
        public Chainer sayHi() {
            System.out.println("Hi");
            return this;
        }

        public Chainer sayBye() {
            System.out.println("Bye");
            return this;
        }
    }
}
