package s;

public class EmployeeStorage {

    public void addEmployee(Employee employee) {
        MySql db = new MySql();
        db.save(employee);
    }


}
