package Iterator;

public class Demo {
    
    public static void main(String[] args) {
        SwitchArray<Integer> switchArray = new SwitchArray<Integer>();
        switchArray.add(2);
        switchArray.add(3);
        switchArray.add(4);
        //||| Immutable |||
        switchArray.switchState();
        Iterator<Integer> iIterator = switchArray.iterator();
        while (iIterator.hasNext())
            System.out.println(iIterator.next());
        System.out.println(switchArray.asArrayList().toString());
    
    }
    
}
