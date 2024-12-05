package Time;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(){
        setHours(0);
        setMinutes(0);
        setSeconds(0);
    }

    public Time(int _hours, int _minutes, int _seconds){
        if (_hours < 0){
            setHours(0);
        } else setHours(_hours);

        if (_minutes < 0){
            setMinutes(0);
        } else setMinutes(_minutes);

        if (_seconds < 0){
            setSeconds(0);
        } else setSeconds(_seconds);
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours > 24){
            throw new RuntimeException("Значение часов не может быть более 24!");
        }
        if (hours < 0) {
            this.hours = 0;
        } else this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if (minutes > 60){
            throw new RuntimeException("Значение минут не может быть более 60!");
        }
        if (minutes < 0){
            this.minutes = 0;
        } else this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if (seconds > 60){
            throw new RuntimeException("Значение секунд не может быть более 24!");
        }
        if (seconds < 0 ){
            this.seconds = 0;
        } else this.seconds = seconds;
    }

    public void changeTime(int _hours, int _minutes, int _seconds){
        int tempSec;
        int curSec;

        tempSec = _seconds + (_minutes * 60) + (_hours * 60 * 60);
        curSec = getSeconds() + (getMinutes() * 60) + (getHours() * 60 * 60);
        curSec = curSec + tempSec;

        if (curSec < 0){
            throw new RuntimeException("Результат находится за нулевой границей времени");
        }

        setHours(curSec / 60 / 60);
        curSec = curSec - getHours() * 60 * 60;
        setMinutes(curSec / 60);
        curSec = curSec - getMinutes() * 60;
        setSeconds(curSec);
    }
    public int getTimeInSeconds(){
        return this.seconds + this.minutes * 60 + this.hours * 60 * 60;
    }
}
