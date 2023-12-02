package problem5;
import java.util.List;

public interface DiscountStrategy {
    public void applyDiscount(List<CartItem> listCart);
}
