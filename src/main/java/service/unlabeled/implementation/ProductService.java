package service.unlabeled.implementation;

import Entity.unlabeled.Product;
import repository.unlabeled.ProductRepositoryInterface;
import repository.unlabeled.implementation.ProductRepository;
import service.unlabeled.ProductServiceInterface;

import java.util.Set;

public class ProductService implements ProductServiceInterface {

    private static ProductServiceInterface serviceInterface = null;
    private ProductRepositoryInterface repositoryInterface;

    private ProductService(){
        this.repositoryInterface = ProductRepository.getMyProductRepository();
    }

    public static ProductServiceInterface getServiceInterface(){
        if (serviceInterface == null) serviceInterface = new ProductService();
        return serviceInterface;
    }

    @Override
    public Set<Product> getAll() {
        return this.repositoryInterface.getAll();
    }

    @Override
    public Product create(Product t) {
        return this.repositoryInterface.create(t);
    }

    @Override
    public Product read(Integer myID) {
        return this.repositoryInterface.read(myID);
    }

    @Override
    public Product update(Product t) {
        return this.repositoryInterface.update(t);
    }

    @Override
    public boolean delete(Integer myID) {
        return this.repositoryInterface.delete(myID);
    }
}
