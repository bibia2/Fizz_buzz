import java.util.Scanner;
public class Test_Customer {
    public static void main(String[] args)
    {
        String name;
        double balance;
        Scanner scan = new Scanner(System.in);
        // array of customer objects
        Customer customers[] = new Customer[6];


        System.out.println("For 6 customers enter the name and in the next line the balance");
        // for loop - for i values from 0 to 5(6 times)
        for(int i = 0; i < 6; i++)
        {
            // reading the values
            name = scan.next();
            balance = scan.nextDouble();
            // creating objects
            customers[i] = new Customer(name, balance);
        }

        // Customers with balance less than $150
        System.out.println("\nSearch for all customers who have less than $150");
        // for loop - for i values from 0 to 5(6 times)
        for(int i = 0; i < 6; i++)
        {
            // if balance is less than 150
            if(customers[i].getBalance() < 150)
            {
                // print name
                System.out.println(customers[i].getName());
            }
        }

        // Average Balance
        // initialize total to 0.
        double total = 0;
        for(int i = 0; i < 6; i++)
        {
            // add the balance amount of each customer.
            total += customers[i].getBalance();
        }
        System.out.println("\nThe average balance is: " + total/6);

        // Highest balance
        // initialize highest to 0
        double highest = 0;
        // initialize name to an empty string.
        name = "";
        for(int i = 0; i < 6; i++)
        {
            // if a customer's balance is greater than the highest
            if(customers[i].getBalance() > highest)
            {
                // the new highest will be the customer's balance
                highest = customers[i].getBalance();
                // note the customer's name
                name = customers[i].getName();
            }
        }
        System.out.println("\nThe customer with the highest balance is: " + name);

        // Lowest balance
        // initialize lowest to the highest
        double lowest = highest;
        for(int i = 0; i < 6; i++)
        {
            // if a customer's balance is lower than the lowest
            if(customers[i].getBalance() < lowest)
            {
                // the new lowest will be the customer's balance
                lowest = customers[i].getBalance();
                // note the customer's name
                name = customers[i].getName();
            }
        }
        System.out.println("\nThe customer with the lowest balance: " + name);

        // 15% balance increase.
        System.out.println("\nShow all accounts after a 15% balance increase");
        for(int i = 0; i < 6; i++)
        {
            // increase 15% balance using addPercentage() method
            customers[i].addPercentage(15);
            // print the customer
            System.out.println(customers[i]);
        }
    }
}