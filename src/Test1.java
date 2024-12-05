public class Test1 {
    private int variable1;
    private int variable2;

    public Test1(){
        variable1 = 0;
        variable2 = 0;
    }
    public int getVariable1() {
        return variable1;
    }

    public void setVariable1(int variable1) {
        this.variable1 = variable1;
    }

    public int getVariable2() {
        return variable2;
    }

    public void setVariable2(int variable2) {
        this.variable2 = variable2;
    }

    public int sum(Test1 t1){

        return t1.variable1 + t1.variable2;
    }

    public int max(Test1 t1){
        if (t1.variable1 > t1.variable2){
            return t1.variable1;
        } else return t1.variable2;
    }
}
