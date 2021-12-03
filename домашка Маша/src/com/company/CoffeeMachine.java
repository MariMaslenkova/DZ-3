package com.company;

public abstract class CoffeeMachine implements Recipes {
    public int volWater;
    public int volCoffee;
    public String name;

    public int waterCount; // счетчик воды
    public int coffeeCount; //счетчик кофе


    public abstract void info(String name, int volCoffee, int volWater);// информация о машине

    public abstract int waterRemainder(int volWater, int waterCount);// остаток воды

    public abstract int coffeeRemainder(int volCoffee, int coffeeCount);// остаток кофе

    public abstract void resetWaterCount();// сброс счетчика воды//

    public abstract void resetCoffeeCount();// сброс счетчика кофе//

}

