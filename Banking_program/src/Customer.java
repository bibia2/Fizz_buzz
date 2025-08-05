public class Customer {
    // private attributes
    private String name;
    private double balance;

    // parameterized constructor
    public Customer(String name, double balance)
    {
        this.name = name;
        this.balance = balance;
    }

    // gives back name and balance
    public String toString()
    {
        return name + " has \t $" + balance;
    }

    // take a percentage value and add it to the balance
    public void addPercentage(double percentage)
    {
        balance = balance + (balance * (percentage/100));
    }

    // getters for name and balance
    public String getName()
    {
        return name;
    }
    public double getBalance()
    {
        return balance;
    }

    // setters for name and balance
    public void setName(String name)
    {
        this.name = name;
    }
    public void setBalance(double balance)
    {
        this.balance = balance;
    }
}
