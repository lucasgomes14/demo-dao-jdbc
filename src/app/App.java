package app;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.dao.impl.SellerDaoJDBC;
import model.entities.Department;
import model.entities.Seller;

public class App {
    public static void main(String[] args) throws Exception {
        Department department = new Department(1, "Books");
		Seller seller = new Seller(1, "Bob", "bob@gmail.com", new Date(), 3000.00, department);
		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println(seller);
    }
}
