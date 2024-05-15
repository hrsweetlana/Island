package ua.javarush.hawryliv.island.domain.animal;

import ua.javarush.hawryliv.island.domain.Settings;
import ua.javarush.hawryliv.island.domain.UnitSettings;
import ua.javarush.hawryliv.island.domain.island.Area;
import ua.javarush.hawryliv.island.domain.util.SettingsUtil;

@Settings(filename = "duck.properties", isHunter = true)
public class Duck extends Herbivorous{
    private static final int WEIGHT = SettingsUtil.getWeight(Duck.class);
    // weight, maxAnimalNumberPerArea, maxStep, foodWeight
    private static final UnitSettings UNIT_SETTINGS = SettingsUtil.getUnitSettings(Duck.class);
    @Override
    public void eat(Area area) {

    }

    @Override
    public Animal reproduce() {
        return null;
    }
}
