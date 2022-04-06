package interfaces.multiple;

public class ImplClass implements InterfaceA, InterfaceB{
    @Override
    public void doSomething() {
        //Option 1 -> provide your own implementation
        System.out.println("do something impl class");

        //Option 2 -> Use existing implementation from InterfaceA or InteraceB or both
        InterfaceA.super.doSomething();
        InterfaceB.super.doSomething();
    }

    public static void main(String[] args){
        ImplClass implClass = new ImplClass();
        implClass.doSomething();
    }
}
