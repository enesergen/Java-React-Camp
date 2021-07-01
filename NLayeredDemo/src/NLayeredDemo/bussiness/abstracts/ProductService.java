package NLayeredDemo.bussiness.abstracts;

import java.util.List;

import NLayeredDemo.entities.concretes.Product;

public interface ProductService {
	void add(Product product);
	List<Product> getAll();

}
