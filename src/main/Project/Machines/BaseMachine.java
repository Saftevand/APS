package main.Project.Machines;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseMachine
{
    private int _costPerDay;

    public BaseMachine(int costPerDay, int maxEmployees)
    {
        _costPerDay = costPerDay;

    }
    public int get_costPerDay() {return _costPerDay;}

}
