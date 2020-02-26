package total_extra_charges;

public class simple_interest extends interest {
    public simple_interest(int prin, int rate, int time)

    {
        super(prin, time, rate);
    }
    public double calculate_simpleInterest()

    {
        return (prin*time*rate)/100.0;
    }
}
