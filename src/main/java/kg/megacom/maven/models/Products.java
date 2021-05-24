package kg.megacom.maven.models;

import java.util.List;

public class Products {
    public String product;
    public String init;
    public List<Data> dataseries;

    public Products() {
    }

    public Products(String product, String init, List<Data> dataseries) {
        this.product = product;
        this.init = init;
        this.dataseries = dataseries;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getInit() {
        return init;
    }

    public void setInit(String init) {
        this.init = init;
    }

    public List<Data> getDataseries() {
        return dataseries;
    }

    public void setDataseries(List<Data> dataseries) {
        this.dataseries = dataseries;
    }

    @Override
    public String toString() {
        return "Products{" +
                "product='" + product + '\'' +
                ", init='" + init + '\'' +
                ", dataseries=" + dataseries +
                '}';
    }
}
