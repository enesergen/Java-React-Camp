package NLayeredDemo.bussiness.concretes;

import java.util.List;


import NLayeredDemo.bussiness.abstracts.ProductService;
import NLayeredDemo.core.LoggerService;
import NLayeredDemo.dataAccess.abstracts.ProductDao;
import NLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService {

	private ProductDao productDao;
	private LoggerService loggerService;
	
	public ProductManager(ProductDao productDao,LoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService=loggerService;
		
	}

	@Override
	public void add(Product product) {
		if(product.getCategoryId()==1) {
			System.out.println("This category is invalid");
			return;
		}
		this.productDao.add(product);
		this.loggerService.logToSystem("product was added : "+product.getName());
		
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
