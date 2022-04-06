package oops.examples;

public class A {
    private void m1(){
        System.out.println("am1");
    }

    public void m2(){
        System.out.println("am2");
    }

}

class B extends A{
    private void m1(){
        System.out.println("bm1");
    }

    public void m2(){
        System.out.println("bm2");
    }

    public static void main(String[] args){
        A obj = new B();
      //Thows compile time error since m1 is private method and cannot be called by clas B.
     //   obj.m1();
    }
}
