package Strategy;

public class Demo {
    
    public static void main(String[] args) {
        System.out.println(new SummingAlgo().square(20));
        System.out.println(new MultiplyingAlgo().square(20));

    }
}
