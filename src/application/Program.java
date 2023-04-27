package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.enitities.Department;
import model.enitities.Seller;

public class Program {
    public static void main(String[] args) throws Exception {

        SellerDao sellerDao = new DaoFactory().createSellerDao();

        System.out.println("===== TEST 1: seller findById =====");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);
        
    }
}
