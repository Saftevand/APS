package Boosters;

public abstract class BaseBooster
{
    private int _percentBoost;

    public BaseBooster(int percentBoost)
    {
        _percentBoost = percentBoost
    }

    public int get_percentBoost() {return _percentBoost;}
}
