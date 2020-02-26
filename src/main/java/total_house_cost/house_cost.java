package total_house_cost;
public class house_cost {
    private int type;
    private double area;
    public house_cost(int type, double area)
    {
        this.area=area;
        this.type=type;
    }

    public int getType()
    {
        return type;
    }

    public void setType(int type)
    {
        this.type = type;
    }

    public double getArea()
    {
        return area;
    }

    public void setArea(double area)
    {
        this.area = area;

    }
    public int CostPerSqFeet(int type)
    {
        int cost=0;
        switch (type)
        {
            case 1:cost=1500;
                break;
            case 2:cost=2000;
                break;
            case 3:cost=2500;
                break;
            case 4:cost=3000;
                break;
            default:cost=0;
                break;
        }
        return cost;
    }
    public double calculateTotalCost(){

        int costPfeet = CostPerSqFeet(this.type);
        return costPfeet*this.area;
    }
}
