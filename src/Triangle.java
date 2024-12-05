public class Triangle {
    private double[] coordinatesA;
    private double[] coordinatesB;
    private double[] coordinatesC;
    private double sideA;
    private double sideB;
    private double sideC;

    //по умолчанию создаем равносторонний треугольник
    public Triangle(){
        setSideA(1);
        setSideB(1);
        setSideC(1);
    }

    public Triangle(double _sideA, double _sideB, double _sideC){
        setSideA(_sideA);
        setSideB(_sideB);
        setSideC(_sideC);
    }

    public Triangle(double[] _coordinatesA, double[] _coordinatesB, double[] _coordinatesC){
        if (_coordinatesA.length != 2 || _coordinatesB.length != 2 || _coordinatesC.length != 2){
            throw new RuntimeException("Не верно заданы координаты");
        }
        this.coordinatesA = _coordinatesA;
        this.coordinatesB = _coordinatesB;
        this.coordinatesC = _coordinatesC;
        this.sideA = getLengthByCoordinates(_coordinatesA, _coordinatesB);
        this.sideB = getLengthByCoordinates(_coordinatesB, _coordinatesC);
        this.sideC = getLengthByCoordinates(_coordinatesC, _coordinatesA);
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    private double getLengthByCoordinates(double[] _side1, double[] _side2){
        return Math.sqrt(Math.pow(_side2[0] - _side1[0], 2) + Math.pow(_side2[1] - _side1[1], 2));
    }

    public double square(){
        double halfPerim;

        halfPerim = this.perimetr() / 2;
        return Math.sqrt(halfPerim * (halfPerim - this.sideA) * (halfPerim - this.sideB) * (halfPerim - this.sideC));
    }

    public double perimetr(){
        return this.sideA + this.sideB + this.sideC;
    }

    public double[] intersectionPointOfMedians(){
        if (this.coordinatesA == null || this.coordinatesB == null || this.coordinatesC == null){
            throw new RuntimeException("Для вычисления точки пересечения медиан не заданы координаты вершин треугольника!");
        }
        double[] arr = new double[2];
        arr[0] = (this.coordinatesA[0] + this.coordinatesB[0] + this.coordinatesC[0]) / 3;
        arr[1] = (this.coordinatesA[1] + this.coordinatesB[1] + this.coordinatesC[1]) / 3;
        return arr;
    }


}