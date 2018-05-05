package main.Project.Rides;


import main.Project.Employees.BaseEmployee;
import main.Project.Utilities.Bank;

public class Swing extends BaseRide
{
    private int _currentAmountOfSwings;
    private int _maxAmountOfSwings;

    public Swing(int maxamountofswings , int runningCost)
    {
        super._buildCost = 10;
        super._maxEmployees = 1;
        super._maxVisitors = 1;
        super._baseIncome = 1;
        super._runningCost = runningCost;
        _currentAmountOfSwings = 1;
        _maxAmountOfSwings = maxamountofswings;
    }

    @Override
    int CalculateDailyCost()
    {
        int result = _runningCost;

        for (BaseEmployee employee: _assignedEmployees)
        {
            result += employee.get_wage();
        }

        return result;
    }

    @Override
    int CalculateDailyIncome()
    {
        return (int)((_baseIncome + _assignedEmployees.size()) * (1 + CalculateCurrentBoost()));
    }

    @Override
    int CalculateDailyTally()
    {
        return CalculateDailyIncome() - CalculateDailyCost();
    }

    @Override
    double CalculateCurrentBoost()
    {
        return 0;
    }

    @Override
    void UpdateClass()
    {
        _coinsPerDay = CalculateDailyIncome();
        _maxEmployees = _currentAmountOfSwings;
    }

    @Override
    boolean AddEmployee(BaseEmployee employee)
    {
        if (_assignedEmployees.size() < _maxEmployees)
        {
            _assignedEmployees.add(employee);
            return true;
        }
        return false;
    }


    public boolean AddSwing(Bank bank)
    {
        if (bank.getCoins() >= _buildCost) {
            if (_currentAmountOfSwings < _maxAmountOfSwings) {
                bank.setCoins(bank.getCoins() - _buildCost);
                _currentAmountOfSwings++;
                UpdateClass();
                return true;
            }
        }
        return false;
    }

    public int get_currentAmountOfSwings() {return _currentAmountOfSwings;}
    public int get_maxAmountOfSwings() {return _maxAmountOfSwings;}
}
