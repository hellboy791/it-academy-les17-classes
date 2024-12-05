package Customer;

import java.util.ArrayList;

public class CustomerAggregator {

    private ArrayList <Customer> customerList;

    public CustomerAggregator(Customer _customer){
        customerList = new ArrayList<Customer>();
        customerList.add(_customer);
    }

    public CustomerAggregator(){
        customerList = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getSortedCustomersByLastName(){

        ArrayList<Customer> sortedList = (ArrayList<Customer>) customerList.clone();

        Customer tempVal;
        int compareResult;

        for (int i = 0; i < sortedList.size(); i++){
            for (int j = i + 1; j < sortedList.size(); j++){
                compareResult = sortedList.get(i).getLastName().compareToIgnoreCase(sortedList.get(j).getLastName());
                if (compareResult <= 0) {
                    continue;
                } else {
                    Customer tempValue = sortedList.get(i);
                    sortedList.set(i, sortedList.get(j));
                    sortedList.set(j, tempValue);
                }
            }
        }
        return sortedList;
    }

    public ArrayList<Customer> getCustomersWithAgivenRangeOfCards(int _startNum, int _endNum){
        ArrayList<Customer> tempList = new ArrayList<>();
        for (int i = 0; i < customerList.size(); i++){
            if (customerList.get(i).getCreditCardNum() >= _startNum && customerList.get(i).getCreditCardNum() <= _endNum){
                tempList.add(customerList.get(i));
            }
        }
        return tempList;
    }

    public void printSortedCustomerList(){
        printList(getSortedCustomersByLastName());
    }

    public void printCustomersWithAgivenRangeOfCards(int _startNum, int _endNum){
        printList(getCustomersWithAgivenRangeOfCards(_startNum, _endNum));
    }

    private void printList(ArrayList<Customer> _tempList){
        for (int i = 0; i < _tempList.size(); i++){
            System.out.println(_tempList.get(i).toString());
        }
    }

    public void addCustomerToList(Customer _customer){
        customerList.add(_customer);
    }

    public ArrayList<Customer> getOriginalCustomerList(){
        return this.customerList;
    }

}
