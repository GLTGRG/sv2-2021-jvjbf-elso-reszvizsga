package cars;

import java.util.ArrayList;
import java.util.List;

public class CarShop {

    private String shopName;
    private int maxPrice;
    private List<Car> carsForSell = new ArrayList<>();


    public CarShop(String shopName, int maxPrice) {
        this.shopName = shopName;
        this.maxPrice = maxPrice;
    }

    public String getShopName() {
        return shopName;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public List<Car> getCarsForSell() {
        return carsForSell;
    }

    boolean addCar(Car car){
        if (car.getPrice() <= maxPrice){
            carsForSell.add(car);
            return true;
        }
        return false;
    }

    int sumCarPrice(){
        int sumPrice = 0;
        for (Car car : carsForSell){
            sumPrice += car.getPrice();
        }
        return sumPrice;
    }

    int numberOfCarsCheaperThan(int price){
        int cheaperCars = 0;
        for (Car car : carsForSell){
            if (car.getPrice() < price){
                cheaperCars += 1;
            }
        }
        return cheaperCars;
    }

    List<Car> carsWithBrand(String brand){
        List<Car> sameBrand = new ArrayList<>();
        for (Car car : carsForSell){
            if (car.getBrand().equals(brand)){
                sameBrand.add(car);
            }
        }
        return sameBrand;
    }
}
