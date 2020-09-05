package TF_IDF;

public class Word extends AbstractWord {
    
    private int TF, documentsPopulation;
    
    public Word(String iWord) {
        super(iWord);
    }
    
    public int getTF() {
        return TF;
    }
    
    public void updateDFRatio(int df, int N) {
        documentsPopulation = N;
        this.DF = df;
        
    }
    
    public double getTFIDF() {
        return TF * Math.log((double) documentsPopulation / DF);
    }
    
    public Word(String iValue, int iTF, int iDF) {
        super(iValue, iDF);
        TF = iTF;
        
    }
    
    public Word merge(Word iWord) {
        return new Word(iWord.getValue(), this.getTF() + iWord.getTF(), this.getDF() + iWord.getDF());
    }
    
    @Override
    public int compareTo(AbstractWord o) {
        return Double.compare(((Word) o).getTFIDF(), this.getTFIDF());
    }
    
}
