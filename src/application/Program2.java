package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.enitities.Department;

public class Program2 {
    public static void main(String [] args){

        DepartmentDao departmentDao = new DaoFactory().createDepartmentDao();
        
        System.out.println("==== Test 1 department insert ====");
        Department department = new Department(null, "Food");
        departmentDao.insert(department);
        System.out.println("Inserted! New id = "+department.getId());

        System.out.println("==== Test 2 department update ====");
        department.setName("Test");
        departmentDao.update(department);
        System.out.println("Update completed!");
    }
}
