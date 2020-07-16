package Iterator;

public class Demo {
    
    public static void main(String[] args) {
        SwitchArray<Integer> iSwitchArray = new SwitchArray<Integer>();
        iSwitchArray.add(2);
        iSwitchArray.add(3);
        iSwitchArray.add(4);
        //||| Immutable |||
        iSwitchArray.switchState();
        Iterator iIterator = iSwitchArray.iterator();
        while (iIterator.hasNext()) System.out.println(iIterator.next());
        System.out.println(iSwitchArray.asArrayList().toString());
        
    }
    
}
