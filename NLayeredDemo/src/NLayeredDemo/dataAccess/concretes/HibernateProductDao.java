package NLayeredDemo.dataAccess.concretes;

import java.util.List;

import NLayeredDemo.dataAccess.abstracts.ProductDao;
import NLayeredDemo.entities.concretes.Product;

public class HibernateProductDao implements ProductDao {

	@Override
	public void add(Product product) {
		System.out.println("Added by hibernate " + product.getName());
	}

	@Override
	public void update(Product product) {
		System.out.println("Updated by hibernate " + product.getName());

	}

	@Override
	public void delete(Product product) {
		System.out.println("Deleted by hibernate " + product.getName());

	}

	@Override
	public Product get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
