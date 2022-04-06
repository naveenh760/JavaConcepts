package interfaces.multiple;

public interface InterfaceA {
    default public void doSomething(){
        System.out.println("do  something from interface A");
    }
}
