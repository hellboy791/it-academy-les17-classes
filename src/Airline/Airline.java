package Airline;

import Time.Time;

public class Airline {
    private String finalDestination;
    private long flightNumber;
    private String aircraftType;
    private Time departureTime;
    private int daysOfWeek;

    @Override
    public String toString() {
        return "Airline{" +
                "finalDestination='" + finalDestination + '\'' +
                ", flightNumber=" + flightNumber +
                ", aircraftType='" + aircraftType + '\'' +
                ", departureTime=" + departureTime.getHours() + ":" + departureTime.getMinutes() + ":" + departureTime.getSeconds() +
                ", daysOfWeek=" + daysOfWeek +
                '}';
    }

    public Airline(String _finalDestination, long _flightNumber, String _aircraftType, Time _departureTime, int _daysOfWeek){
        setFinalDestination(_finalDestination);
        setFlightNumber(_flightNumber);
        setAircraftType(_aircraftType);
        setDepartureTime(_departureTime);
        setDaysOfWeek(_daysOfWeek);
    }

    public String getFinalDestination() {
        return finalDestination;
    }

    public void setFinalDestination(String finalDestination) {
        this.finalDestination = finalDestination;
    }

    public long getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(long flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public Time getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Time departureTime) {
        this.departureTime = departureTime;
    }

    public int getDaysOfWeek() {
        return daysOfWeek;
    }

    public void setDaysOfWeek(int daysOfWeek) {
        if (daysOfWeek > 7 || daysOfWeek < 0){
            throw new RuntimeException("День недели может быть указан только в диапазоне от 1 до 7, где '1' это 'понедельник', '7' это 'воскресенье'");
        }
        this.daysOfWeek = daysOfWeek;
    }
}
