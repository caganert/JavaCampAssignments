public class Product {
    //attribute - field
    private int _id;
    private String _name;
    private String _description;
    private double _price;
    private int _stockAmount;

    private String _kod;

    public int get_id() {
        return _id;
    }

    public void set_id(int id) {
        _id = id;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String name) {
        _name = name;
    }

    public String get_description() {
        return _description;
    }

    public void set_description(String description) {
        _description = description;
    }

    public double get_price() {
        return _price;
    }

    public void set_price(double price) {
        _price = price;
    }

    public int get_stockAmount() {
        return _stockAmount;
    }

    public void set_stockAmount(int stockAmount) {
        _stockAmount = stockAmount;
    }

    public String get_kod(){
        return _name.substring(0,1) + _id;
    }
}
