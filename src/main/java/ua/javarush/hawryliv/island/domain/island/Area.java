package ua.javarush.hawryliv.island.domain.island;

import ua.javarush.hawryliv.island.domain.Plant;
import ua.javarush.hawryliv.island.domain.animal.Animal;

import java.util.ArrayList;
import java.util.List;

public class Area {
    private List<Plant> plants = new ArrayList<>();
    private List<Animal> animals = new ArrayList<>();

    public List<Plant> getPlants() {
        return plants;
    }

    public List<Animal> getAnimals() {
        return animals;
    }
}
