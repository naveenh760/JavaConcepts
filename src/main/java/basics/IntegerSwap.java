package basics;

class IntegerSwap {
    public static void main( String args[] ) {
        (new IntegerSwap()).run();
    }
  
    public void run() {
        Integer x = 5;
        Integer y = 9;
        System.out.println("Before Swap x: " + x + " y: " + y);
        noSwap(x, y);
        System.out.println("After Swap x: " + x + " y: " + y);
    }

    private void noSwap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }
    
    
}
