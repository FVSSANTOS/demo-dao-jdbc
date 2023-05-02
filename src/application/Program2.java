package application;

import java.util.ArrayList;
import java.util.List;

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

        System.out.println("==== Test 3 department delete ====");
        departmentDao.deleteById(7);
        System.out.println("Delete completed!");

        System.out.println("==== Test 4 department findById ====");
        department = departmentDao.findById(2);
        System.out.println(department);

        System.out.println("\n===== TEST 5: department findByAll =====");
        List<Department> list = departmentDao.findAll();
        list = departmentDao.findAll();
        for(Department obj : list){
            System.out.println(obj);
        }
    }
}
