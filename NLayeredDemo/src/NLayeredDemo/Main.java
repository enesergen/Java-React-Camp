package NLayeredDemo;

import NLayeredDemo.bussiness.abstracts.ProductService;
import NLayeredDemo.bussiness.concretes.ProductManager;
import NLayeredDemo.core.JLoggerManagerAdapter;
import NLayeredDemo.dataAccess.concretes.AProductDao;
import NLayeredDemo.dataAccess.concretes.HibernateProductDao;
import NLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		ProductService productService=new ProductManager(new AProductDao(),new JLoggerManagerAdapter());

		Product product=new Product(1,3,"Apricot",100,50);
		productService.add(product);
		
		
	}

}
