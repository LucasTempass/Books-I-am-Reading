package TF_IDF;

public abstract class AbstractWord implements Comparable<AbstractWord> {
    
    protected String value;
    protected int DF;
    
    public AbstractWord(String iValue) {
        value = iValue;
        DF = 1;
        
    }
    
    public AbstractWord(String iValue, int iDF) {
        value = iValue;
        DF = iDF;
    }
    
    public void setDF(int iDF) {
        DF = iDF;
    }
    
    public String getValue() {
        return value;
    }
    
    public int getDF() {
        return DF;
    }
    
    public int incrementDF() {
        return ++DF;
    }
    
    public int incrementDFBy(int amount) {
        DF += amount;
        return DF;
        
    }
    
}
