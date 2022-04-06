package interfaces.multiple;

public interface InterfaceB {
    default public void doSomething(){
        System.out.println("do something from interface B");
    }
}
