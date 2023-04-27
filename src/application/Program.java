package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.enitities.Department;
import model.enitities.Seller;

public class Program {
    public static void main(String[] args) throws Exception {
        
        Department obj = new Department(1,"Books");

        Seller seller = new Seller(21,"Bob","bob@gmail.com",new Date(), 3000.0, obj);

        SellerDao sellerDao = new DaoFactory().createSellerDao();

        Seller seller2 = sellerDao.findById(3);

        System.out.println(seller2);
        
    }
}
