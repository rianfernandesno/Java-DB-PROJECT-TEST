package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Departament;
import model.entities.Seller;

import java.util.Date;

public class Programm {
    public static void main(String[] args) {

        Departament obj = new Departament(1, "Books");

        Seller seller = new Seller(21, "bob", "bob@gmail.com",new Date(), 3000,obj);

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println(seller);
    }
}
