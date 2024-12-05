public class Student {
    private String fio;
    private int gNum;
    private int[] perfomance;

    public Student(){
        fio = "";
        gNum = 0;
        perfomance = new int[5];
    }

    public Student(String _fio, int _gNum, int[] _perfomance){
        fio = _fio;
        gNum = _gNum;
        perfomance = _perfomance;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getgNum() {
        return gNum;
    }

    public void setgNum(int gNum) {
        this.gNum = gNum;
    }

    public int[] getPerfomance() {
        return perfomance;
    }

    public void setPerfomance(int[] perfomance) {
        this.perfomance = perfomance;
    }
    public boolean isStudentExcellent(){

        for (int j : perfomance) {
            if (j != 9 && j != 10) {
                return false;
            }
        }
        /*
        if (isDataValid()){
            for (int j : perfomance) {
                if (j != 9 && j != 10) {
                    return false;
                }
            }
            return true;
        }
         */
        return true;
    }

    public boolean isDataValid(){
        if (this.fio.equals("")){
            System.out.println("ФИО не может быть пустым");
            //throw new RuntimeException("ФИО не может быть пустым");
        }
        if (this.gNum == 0){
            System.out.println("Номер группы не может быть нулевым");
            //throw new RuntimeException("Номер группы не может быть нулевым");
        }
        if (this.perfomance.length != perfomance.length){
            System.out.println("Успеваемость должна состоять из 5 значений!");
            //throw new RuntimeException("Успеваемость должна состоять из 5 значений!");
        }
        return true;
    }
}
