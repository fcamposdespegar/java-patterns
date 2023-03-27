package com.fcampos.javapattenrs.prototype;

public class PrototypeClient {


        public static void main(String[] args) throws CloneNotSupportedException {
            Swordsman s1 = new Swordsman();
            s1.move("ALGUNA POSITION ORIGINAL", 20);
            s1.attack();

            System.out.println(s1);
            Swordsman s2 = (Swordsman) s1.clone();
            System.out.println(s2);
        }
}
