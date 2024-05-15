package ua.javarush.hawryliv.island.domain;

import ua.javarush.hawryliv.island.domain.animal.Animal;

import java.util.Map;

public class UnitSettings {
    private final int weight;
    private final int foodWeight;
    private final int maxStep;
    private final int maxAnimalNumberPerArea;
    private final boolean isHunter = false;
    public Map<Class<? extends Animal>, Integer> eatingProbaility;

    public int getWeight() {
        return weight;
    }

    public int getFoodWeight() {
        return foodWeight;
    }

    public int getMaxStep() {
        return maxStep;
    }

    public int getMaxAnimalNumberPerArea() {
        return maxAnimalNumberPerArea;
    }

    public boolean isHunter() {
        return isHunter;
    }
    public UnitSettings(int weight, int foodWeight, int maxStep, int maxAnimalNumberPerArea) {
        this.weight = weight;
        this.foodWeight = foodWeight;
        this.maxStep = maxStep;
        this.maxAnimalNumberPerArea = maxAnimalNumberPerArea;
    }
}
