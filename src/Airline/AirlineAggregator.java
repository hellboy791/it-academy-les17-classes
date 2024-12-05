package Airline;

import java.util.ArrayList;
import Airline.Airline;
import Time.Time;

public class AirlineAggregator {

    private ArrayList<Airline> airlineList;

    public AirlineAggregator(Airline _airline){
        airlineList = new ArrayList<Airline>();
        airlineList.add(_airline);
    }

    public AirlineAggregator(){
        airlineList = new ArrayList<Airline>();
    }

    public ArrayList<Airline> getOriginalAirlineList() {
        return airlineList;
    }

    public ArrayList<Airline> getAirlinesByDestination(String _finalDestination){
        ArrayList<Airline> tempList = new ArrayList<>();
        for (int i = 0; i < airlineList.size(); i++){
            if (airlineList.get(i).getFinalDestination().equals(_finalDestination)){
                tempList.add(airlineList.get(i));
            }
        }
        return tempList;
    }

    public ArrayList<Airline> getAirlinesByDayOfWeek(int _dayOfWeek){
        ArrayList<Airline> tempList = new ArrayList<Airline>();
        for (int i = 0; i < airlineList.size(); i++){
            if (airlineList.get(i).getDaysOfWeek() == _dayOfWeek){
                tempList.add(airlineList.get(i));
            }
        }
        return tempList;
    }

    public ArrayList<Airline> getAirlinesByDayOfWeekWithGreaterTime(int _dayOfWeek, Time _time){
        ArrayList<Airline> tempList = new ArrayList<Airline>();
        for (int i = 0; i < airlineList.size(); i++){
            if (airlineList.get(i).getDaysOfWeek() == _dayOfWeek && (_time.getTimeInSeconds() - airlineList.get(i).getDepartureTime().getTimeInSeconds() < 0)){
                tempList.add(airlineList.get(i));
            }
        }
        return tempList;
    }

    public void addAirlinesToList(Airline _airline){
        airlineList.add(_airline);
    }

    public void printAirlinesByDayOfWeekWithGreaterTime(int _dayOfWeek, Time _time){
        printList(getAirlinesByDayOfWeekWithGreaterTime(_dayOfWeek, _time));
    }

    public void printAirlinesByDayOfWeek(int _dayOfWeek){
        printList(getAirlinesByDayOfWeek(_dayOfWeek));
    }

    private void printList(ArrayList<Airline> _tempList){
        for (int i = 0; i < _tempList.size(); i++){
            System.out.println(_tempList.get(i).toString());
        }
    }

}
