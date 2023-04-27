package model.dao;

import java.util.List;

import model.enitities.Seller;

public interface SellerDao {

    public void insert(Seller obj);
    public void update(Seller obj);
    public void deleteById(Integer id);
    public Seller findById(Integer id);
    public  List<Seller> findAll();
}