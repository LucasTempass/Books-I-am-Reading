package TF_IDF;

public class Keyword extends AbstractWord {
    
    public Keyword(String iValue, int iDF) {
        super(iValue);
        DF = iDF;
        
    }
    
    @Override
    public int compareTo(AbstractWord o) {
        return Integer.compare(o.getDF(), super.getDF());
    }
    
}
