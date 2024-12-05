public class Counter {
    private int curValue;

    public Counter(){
        setCurValue(0);
    }

    public Counter(int _newValue){
        setCurValue(_newValue);
    }

    public Counter(int _newValue, int _start, int _end){
        this.curValue = _newValue;
        for (int i = _start; i <= _end; i++){
            increase();
        }
    }

    public void increase(){
        this.curValue += 1;
    }

    public void decrease(){
        this.curValue -= 1;
    }

    public int getCurValue() {
        return curValue;
    }

    public void setCurValue(int curValue) {
        this.curValue = curValue;
    }
}
