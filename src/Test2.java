public class Test2 {
    private int fVal;
    private int sVal;

    public Test2(){
        fVal = 1;
        sVal = 2;
    }
    public Test2(int _fVal, int _sVal){
        fVal = _fVal;
        sVal = _sVal;
    }

    public int getFVal() {
        return fVal;
    }

    public void setFVal(int fVal) {
        this.fVal = fVal;
    }

    public int getSVal() {
        return sVal;
    }

    public void setSVal(int sVal) {
        this.sVal = sVal;
    }
}
