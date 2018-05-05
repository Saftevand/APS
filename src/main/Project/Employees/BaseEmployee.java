package main.Project.Employees;

public abstract class BaseEmployee
{
    private int _wage;
    private int _skillLevel;
    public BaseEmployee(int wage, int skillLevel)
    {
        this._wage = wage;
        _skillLevel = skillLevel;
    }

    public int get_wage() {return _wage;}
    public int get_skillLevel() {return _skillLevel;}
}
