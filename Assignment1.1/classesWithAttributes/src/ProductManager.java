public class ProductManager {
    public void Add(Product product){
        //JDBC
        System.out.println("Ürün Eklendi : " + product.get_name());
    }
}
