package Rides;

import Boosters.BaseBooster;
import Employees.BaseEmployee;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseRide
{
    private int _coinsPerDay;
    private int _maxEmployees;
    private int _maxVisitors;
    private List<BaseEmployee> _assignedEmployees = new ArrayList<BaseEmployee>();
    private List<BaseBooster> _appliedBoosters = new ArrayList<BaseBooster>();

    public BaseRide(int coinsPerDay, int maxEmployees, int maxVisitors)
    {
        _coinsPerDay = coinsPerDay;
        _maxEmployees = maxEmployees;
        _maxVisitors = maxVisitors;
    }

    abstract int CalculateDailyCost();      //All the expensives e.g. motors, employees etc
    abstract int CaclulateDailyIncome();    //All the revenues e.g. coinsperday plus boosters
    abstract int CalculateDailyTally();     //Income minus Cost = Tally
    abstract int CalculateCurrentBoost();   //Go trough the list of booster and add the boost together

    public void set_assignedEmployees(List<BaseEmployee> _assignedEmployees) {this._assignedEmployees = _assignedEmployees;}
    public void set_appliedBoosters(List<BaseBooster> _appliedBoosters) {this._appliedBoosters = _appliedBoosters;}

    public List<BaseBooster> get_appliedBoosters() {return _appliedBoosters;}
    public int get_coinsPerDay() {return _coinsPerDay;}
    public int get_maxVisitors() {return _maxVisitors;}
    public List<BaseEmployee> get_assignedEmployees() {return _assignedEmployees;}
    public int get_maxEmployees() {return _maxEmployees;}


}
