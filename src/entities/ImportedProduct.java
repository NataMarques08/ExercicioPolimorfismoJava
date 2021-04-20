package entities;

public class ImportedProduct extends Product{
    private Double customFree;

    public ImportedProduct(){super();} // construtor padrão

    public ImportedProduct(String name, Double price, Double customFree) {
        super(name, price);
        this.customFree = customFree;
    }

    public Double getCustomFree() {
        return customFree;
    }

    public void setCustomFree(Double customFree) {
        this.customFree = customFree;
    }
    @Override
    public String priceTag(){
        return super.priceTag()+" ( Custom fee $ "+String.format("%.2f",customFree)+" )";
    }

    public Double totalPrice(){
        return getPrice() + customFree;
    }
}
