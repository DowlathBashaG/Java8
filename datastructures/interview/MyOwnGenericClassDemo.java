package io.dowlath.javahidden.datastructures.interview;

public class MyOwnGenericClassDemo {
    public static void main(String[] args) {
        Juice apple = new Juice();
        Water drinkingWater = new Water();
        Glass<Juice> juiceGlass = new Glass<>();
        Glass<Water> waterGlass = new Glass<>();
        juiceGlass.setLiquid(apple);
        waterGlass.setLiquid(drinkingWater);

        System.out.println(juiceGlass.getLiquid());
        System.out.println(waterGlass.getLiquid());
    }
}
