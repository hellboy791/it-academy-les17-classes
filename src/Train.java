import Time.*;

public class Train {
    private String finalDestination;
    private int trainNumber;
    private Time departureTime;

    public Train(String _finalDestination, int _trainNumber, Time _departureTime){
        this.finalDestination = _finalDestination;
        this.trainNumber = _trainNumber;
        this.departureTime = _departureTime;
    }

    public void setFinalDestination(String finalDestination) {
        this.finalDestination = finalDestination;
    }

    public String getFinalDestination(){
        return finalDestination;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setDepartureTime(Time departureTime) {
        this.departureTime = departureTime;
    }

    public Time getDepartureTime() {
        return departureTime;
    }

    public void printInfo(){
        System.out.println("Поезд №" + this.trainNumber + " отправляется в " + departureTime.getHours() + " часов и " + departureTime.getMinutes() + " в населенный пункт '" + this.finalDestination + "'");
    }


}
