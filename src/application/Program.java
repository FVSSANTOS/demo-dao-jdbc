package application;

import java.util.Date;

import model.enitities.Department;
import model.enitities.Seller;

public class Program {
    public static void main(String[] args) throws Exception {
        
        Department obj = new Department(1,"Books");

        Seller seller = new Seller(21,"Bob","bob@gmail.com",new Date(), 3000.0, obj);
        System.out.println(seller);
    }
}
