package com.denisfesenko;

/**
 * From testdome.com
 */
public class MinimalNumberOfPackages {
    public static void main(String[] args) {
        System.out.println(minimalNumberOfPackages(16, 2, 10));
    }

    public static int minimalNumberOfPackages(int items, int availableLargePackages, int availableSmallPackages) {
        int neededLargePackages = Math.min(items / 5, availableLargePackages);
        int itemsLeft = items - neededLargePackages * 5;
        int neededSmallPackages = Math.min(itemsLeft, availableSmallPackages);

        if (itemsLeft > neededSmallPackages) {
            return -1; // Not enough small packages to cover the remaining items
        }
        return neededLargePackages + neededSmallPackages;
    }
}
