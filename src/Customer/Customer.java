package Customer;

public class Customer {
    //Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
    private int id;
    private String lastName;
    private String firstName;
    private String middleName;
    private String address;
    private long creditCardNum;
    private String bankAccountNumber;

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", address='" + address + '\'' +
                ", creditCardNum=" + creditCardNum +
                ", bankAccountNumber='" + bankAccountNumber + '\'' +
                '}';
    }

    public Customer(int _id, String _lastName, String _firstName, String _middleName, String _addsress, long _creditCardNum, String _bankAccountNumber){
        setId(_id);
        setLastName(_lastName);
        setFirstName(_firstName);
        setMiddleName(_middleName);
        setAddress(_addsress);
        setCreditCardNum(_creditCardNum);
        setBankAccountNumber(_bankAccountNumber);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getCreditCardNum() {
        return creditCardNum;
    }

    public void setCreditCardNum(long creditCardNum) {
        this.creditCardNum = creditCardNum;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }
}
