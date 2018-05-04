package Machines;

import Employees.BaseEmployee;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseMachine
{
    private int _coinPerDay;
    private int _maxEmployees;
    private List<BaseEmployee> _assignedEmployees = new ArrayList<>();

    public BaseMachine(int coinPerDay, int maxEmployees)
    {
        _coinPerDay = coinPerDay;
        _maxEmployees = maxEmployees;

    }
    

    public void set_assignedEmployees(List<BaseEmployee> _assignedEmployees) {this._assignedEmployees = _assignedEmployees;}

    public List<BaseEmployee> get_assignedEmployees() {return _assignedEmployees;}
    public int get_maxEmployees() {return _maxEmployees;}
    public int get_coinPerDay() {return _coinPerDay;}

}
