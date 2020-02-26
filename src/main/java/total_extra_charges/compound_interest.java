package total_extra_charges;

public class compound_interest extends interest {
    public compound_interest(int prin, int rate, int time)

    {
        super(prin, time, rate);
    }
    public double Calculate_CompountI()

    {
        return prin*Math.pow((1+rate/100.0),time);
    }
}
