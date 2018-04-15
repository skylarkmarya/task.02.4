import java.util.Comparator;
import java.util.Objects;

public class Stationary {
    String name;
    double price;

    public Stationary(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stationary that = (Stationary) o;
        return Double.compare(that.price, price) == 0 &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "Stationary{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public static Comparator<Stationary> CAMPARE_BY_NAME = new Comparator<Stationary>() {
        @Override
        public int compare(Stationary o1, Stationary o2) {
            return o1.name.compareTo(o2.name);
        }
    };
    public static Comparator<Stationary> CAMPARE_BY_NAME_PRICE = new Comparator<Stationary>() {
        @Override
        public int compare(Stationary o1, Stationary o2) {
            if(o1.name.equals(o2.name)){
                return (int)o1.price*100 - (int)o2.price*100;
            }
            else{
                return o1.name.compareTo(o2.name);
            }
        }
    };
}






