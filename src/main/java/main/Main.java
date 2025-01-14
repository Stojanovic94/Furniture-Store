package main;

import client.FurnitureStore;
import factories.FurnitureFactory;
import factories.ModernFurnitureFactory;
import factories.VictorianFurnitureFactory;
import factories.IndustrialFurnitureFactory;

public class Main {
    public static void main(String[] args) {
        // Moderni stil
        System.out.println("Modern Furniture:");
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        FurnitureStore modernStore = new FurnitureStore(modernFactory);
        modernStore.showFurniture();

        System.out.println();

        // Viktorijanski stil
        System.out.println("Victorian Furniture:");
        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
        FurnitureStore victorianStore = new FurnitureStore(victorianFactory);
        victorianStore.showFurniture();

        System.out.println();

        // Industrijski stil
        System.out.println("Industrial Furniture:");
        FurnitureFactory industrialFactory = new IndustrialFurnitureFactory();
        FurnitureStore industrialStore = new FurnitureStore(industrialFactory);
        industrialStore.showFurniture();
    }
}
