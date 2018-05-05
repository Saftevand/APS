package main.Project.Rides;


import main.Project.Boosters.BaseBooster;
import main.Project.Employees.BaseEmployee;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseRide
{
    protected int _coinsPerDay;
    protected int _maxEmployees;
    protected int _maxVisitors;
    protected List<BaseEmployee> _assignedEmployees = new ArrayList<BaseEmployee>();
    protected List<BaseBooster> _appliedBoosters = new ArrayList<BaseBooster>();
    protected int _buildCost;
    protected int _baseIncome;
    protected int _runningCost;



    public BaseRide()
    {

    }

    abstract int CalculateDailyCost();      //All the expensives e.g. motors, employees etc
    abstract int CalculateDailyIncome();    //All the revenues e.g. coinsperday plus boosters
    abstract int CalculateDailyTally();     //Income minus Cost = Tally
    abstract double CalculateCurrentBoost();   //Go trough the list of booster and add the boost together
    abstract void UpdateClass();
    abstract boolean AddEmployee(BaseEmployee employee);

    public void set_assignedEmployees(List<BaseEmployee> _assignedEmployees) {this._assignedEmployees = _assignedEmployees;}
    public void set_appliedBoosters(List<BaseBooster> _appliedBoosters) {this._appliedBoosters = _appliedBoosters;}

    public List<BaseBooster> get_appliedBoosters() {return _appliedBoosters;}
    public int get_coinsPerDay() {return _coinsPerDay;}
    public int get_maxVisitors() {return _maxVisitors;}
    public List<BaseEmployee> get_assignedEmployees() {return _assignedEmployees;}
    public int get_maxEmployees() {return _maxEmployees;}
    public int get_buildCost() {return _buildCost;}
    public int get_baseIncome() {return _baseIncome;}

}
