package examplesOOP.chain.prototype;

/**
 * Created by asus on 25.07.17.
 */
public abstract class Toys implements Cloneable {
    private String type;
    private String cost;
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public abstract void CreateToys();
}
