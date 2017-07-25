package examplesOOP.chain.adapter;

/**
 * Created by asus on 25.07.17.
 */
public class Deptor {

    private Integer id;
    private  String Name;
    private Integer debt;

    public Deptor(Integer id, String name, Integer debt) {
        this.id = id;
        Name = name;
        this.debt = debt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getDebt() {
        return debt;
    }

    public void setDebt(Integer debt) {
        this.debt = debt;
    }

    @Override
    public String toString() {
        return "Deptor{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", debt=" + debt +
                '}';
    }
}
