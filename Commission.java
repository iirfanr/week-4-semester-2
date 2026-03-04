public class Commission extends Hourly
{
    private double TotalSales;
    private double CommRates;

    /* The constructor takes 6 parameters: the first 5 are the same as for Hourly (name, address, phone number, social security
number, hourly pay rate) and the 6th is the commission rate for the employee. The constructor should call the constructor
of the parent class with the first 5 parameters then use the 6th to set the commission rate. */
    public Commission(String eName, String eAddress, String ePhone,
                      String socSecNumber, double rate, double CommissionRates)
    {
        super (eName, eAddress, ePhone, socSecNumber, rate);

        CommRates = CommissionRates;
    }

    /*One additional method is needed: public void addSales (double totalSales) that adds the parameter to the instance
variable representing total sales. */
    public void addSales (double totalSales)
    {
        TotalSales += totalSales;
    }

    /*The pay method must call the pay method of the parent class to compute the pay for hours worked then add to that the
pay from commission on sales. (See the pay method in the Executive class.) The total sales should be set back to 0 (note:
you don't need to set the hoursWorked back to 0—why not?). */
    public double pay()
    {
        double payment= super.pay() + TotalSales*CommRates;

        TotalSales = 0;

        return payment;
    }
    
    /*The toString method needs to call the toString method of the parent class then add the total sales to that. */
    public String toString()
    {
        String result= super.toString();

        result += "\nCurrent sales: " + TotalSales;

        return result;
    }
}
