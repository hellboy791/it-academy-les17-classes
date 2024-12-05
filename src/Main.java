
import Customer.*;
import Time.*;
import Airline.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Train[] sortTrainListByTrainNumber(Train _train[]){
        Train[] sortedArray = _train.clone();
        Train tempValue;

        for (int i = 0; i < sortedArray.length; i++){
            for (int j = i + 1; j < sortedArray.length; j++){
                if (sortedArray[i].getTrainNumber() > sortedArray[j].getTrainNumber()){
                    tempValue = sortedArray[i];
                    sortedArray[i] = sortedArray[j];
                    sortedArray[j] = tempValue;
                }
            }
        }
        return sortedArray;
    }

    public static Train[] sortTrainListByDestination(Train _train[]){
        Train[] sortedArray = _train.clone();
        int compareResult;
        int timeDifference;
        Train tempValue;

        for (int i = 0; i < sortedArray.length; i++){
            for (int j = i + 1; j < sortedArray.length; j++){
                compareResult = sortedArray[i].getFinalDestination().compareToIgnoreCase(sortedArray[j].getFinalDestination());
                if (compareResult < 0) {
                    continue;
                } else if (compareResult == 0){
                    timeDifference = sortedArray[i].getDepartureTime().getTimeInSeconds() - sortedArray[j].getDepartureTime().getTimeInSeconds();
                    if (timeDifference > 0){
                        tempValue = sortedArray[i];
                        sortedArray[i] = sortedArray[j];
                        sortedArray[j] = tempValue;
                    } else {
                        continue;
                    }
                } else {
                    tempValue = sortedArray[i];
                    sortedArray[i] = sortedArray[j];
                    sortedArray[j] = tempValue;
                }

            }
        }
        return sortedArray;
    }


    public static void main(String[] args) {

        //Customer
        ArrayList<Customer> sortedAggr = new ArrayList<Customer>();
        ArrayList<Customer> arrayOne = new ArrayList<Customer>();
        CustomerAggregator aggr = new CustomerAggregator(new Customer(1, "Степаненко", "Александр", "Владимирович", "г. Минск, ул. Великоморска, д. 6", 987663212, "BY43SSKHH76322"));
        aggr.addCustomerToList(new Customer(2, "Пупкин", "Василий", "Петрович", "г. Москва, ул. Молодежная, д.1 ", 332124451, "RU883HJ9823"));
        aggr.addCustomerToList(new Customer(3, "Уткин", "Егор", "Леонидович", "г. Москва, ул. Запорожская, д.7 ", 111114451, "RU883HJ15543"));
        aggr.addCustomerToList(new Customer(4, "Абрамов", "Исмаил", "Ахтунгович", "г. Брест, ул. Кирова, д.12 ", 555555555, "BY213HJ159843"));
        aggr.addCustomerToList(new Customer(5, "Юсупов", "Абдул", "Вахтангович", "г. Воронеж, пл. Царская, д.98 ", 445544455, "RU153HJ136843"));
        aggr.addCustomerToList(new Customer(6, "Анисимова", "Екатерина", "Геннадьевна", "г. Минск, пл. Свободы, д.1 ", 888888888, "BY111KJ112233"));

        sortedAggr = aggr.getSortedCustomersByLastName();
        arrayOne = aggr.getCustomersWithAgivenRangeOfCards(444444444, 999999999);

        aggr.printSortedCustomerList();
        System.out.println();
        aggr.printCustomersWithAgivenRangeOfCards(444444444, 999999999);
        //end Customer

        //Airline
        AirlineAggregator airlines = new AirlineAggregator(new Airline("Минск", 3321, "Airbus", new Time(12,15,0), 2));
        airlines.addAirlinesToList(new Airline("Москва", 31221, "Boing-777", new Time(12,40,0), 2));
        airlines.addAirlinesToList(new Airline("Пекин", 115, "Boing-737", new Time(9,0,0), 5));
        airlines.addAirlinesToList(new Airline("Санкт-Петербург", 31221, "Boing-777", new Time(8,35,0), 2));
        airlines.addAirlinesToList(new Airline("Киев", 565, "Airbus", new Time(5,40,50), 5));
        airlines.addAirlinesToList(new Airline("Вильнюс", 7910, "Airbus", new Time(14,20,0), 3));
        airlines.addAirlinesToList(new Airline("Варшава", 7107, "Boing-777", new Time(18,15,0), 2));
        System.out.println();
        airlines.printAirlinesByDayOfWeek(2);
        System.out.println();
        airlines.printAirlinesByDayOfWeekWithGreaterTime(2, new Time(12,15,0));
        //end Airline




        //Train
        Scanner sc = new Scanner(System.in);
        Train[] trainList = new Train[5];
        Train[] trainListSortedByNum = new Train[trainList.length];
        Train[] trainSortedByDestination = new Train[trainList.length];

        trainList[0] = new Train("Минск", 2151, new Time(11,25,0));
        trainList[1] = new Train("Брест", 12, new Time(14,25,0));
        trainList[2] = new Train("Москва", 511, new Time(8,25,0));
        trainList[3] = new Train("Барнаул", 662, new Time(22,25,0));
        trainList[4] = new Train("Минск", 78, new Time(10,5,0));

        trainListSortedByNum = sortTrainListByTrainNumber(trainList);
        trainSortedByDestination = sortTrainListByDestination(trainList);

        System.out.println("Введите номер поезда для получения информации о маршруте следования: ");
        int trainNum = sc.nextInt();
        for (int i = 0; i < trainList.length; i++){
            if (trainList[i].getTrainNumber() == trainNum){
                trainList[i].printInfo();
                break;
            }
        }

        //end Train

        //Test1
        Test1 t1 = new Test1();
        System.out.println(t1.sum(t1));
        t1.setVariable1(1);
        t1.setVariable2(-5);
        System.out.println("Сумма переданных параметров равна " + t1.sum(t1));
        System.out.println("Максимальное значение равно " + t1.max(t1));
        //end Test1

        //Test2
        Test2 t2 = new Test2();
        System.out.println(t2.getFVal() + " + " + t2.getSVal());
        //end Test2

        //Student
        int[] perfGood = {10, 9, 9, 9, 10};
        int[] perfBad = {2, 3, 4, 10, 10};

        Student s2 = new Student("s", 1, perfGood);
        if (s2.isStudentExcellent()){
            System.out.println("Студент: " + s2.getFio() + ", группа №" + s2.getgNum());
        }

        Student s1 = new Student("Pupkin P P", 3, perfGood);
        if (s1.isStudentExcellent()){
            System.out.println("Студент: " + s1.getFio() + ", группа №" + s1.getgNum());
        }

        Student[] listOfStudents = new Student[10];
        listOfStudents[0] = new Student("fdf", 3, perfBad);
        listOfStudents[1] = new Student("AAA F F", 3, perfBad);
        listOfStudents[2] = new Student("BBB B B", 3, perfBad);
        listOfStudents[3] = new Student("CCC C C", 5, perfBad);
        listOfStudents[4] = new Student("DDD D D", 6, perfGood);
        listOfStudents[5] = new Student("FFF F F", 3, perfBad);
        listOfStudents[6] = new Student("DDD D D", 1, perfGood);
        listOfStudents[7] = new Student("EEE E E", 3, perfBad);
        listOfStudents[8] = new Student("JJJ JF J", 12, perfGood);
        listOfStudents[9] = new Student("POIPOI PO IO", 3, perfBad);

        for (Student student: listOfStudents){
            if (student.isStudentExcellent()){
                System.out.println("Студент: " + student.getFio() + ", группа №" + student.getgNum());
            }
        }
        //end Student

        //COUNTER
        Counter counter = new Counter(5, 1, 3);
        System.out.println(counter.getCurValue());
        //end COUNTER

        //TIME
        Time t = new Time(0, 2, 59);
        t.changeTime(5, 58, -63);
        System.out.println(t.getHours() + ":" + t.getMinutes() + ":" + t.getSeconds());
        Time tt2 = new Time();
        tt2.setSeconds(-5);
        tt2.setMinutes(-9);
        tt2.setHours(7);
        //end TIME

        //Triangle
        double[] a = {2, 1};
        double[] b = {3, 4};
        double[] c = {1, 6};

        Triangle tt = new Triangle(3, 4, 5);
        System.out.println("Периметр треугольника равен " + tt.perimetr());
        System.out.println("Площадь треугольника равна " + tt.square());

        Triangle tr1 = new Triangle(a, b, c);
        System.out.println("Координаты точки пересечения медиан [" + tr1.intersectionPointOfMedians()[0] + ", " + tr1.intersectionPointOfMedians()[1] + "]");

        Triangle tr = new Triangle();
        tr.setSideA(3);
        tr.setSideB(4);
        tr.setSideC(5);
        System.out.println("Периметр треугольника равен " + tr.perimetr());
        System.out.println("Площадь треугольника равно" + tr.square());
        //end Triangle

    }
}