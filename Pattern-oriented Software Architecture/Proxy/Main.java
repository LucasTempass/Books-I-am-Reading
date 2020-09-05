package Proxy;

public class Main {
    
    public static void main(String[] args) {
        President president = new President("Xi", "China");
        Representative ambassador = new Ambassador("Ling Biao", "China", president);
        President foreignLeader = new President("Pedro", "Spain");
        System.out.println(foreignLeader.negotiate(president));
        System.out.println(foreignLeader.negotiate(ambassador));
        
    }
    
}
