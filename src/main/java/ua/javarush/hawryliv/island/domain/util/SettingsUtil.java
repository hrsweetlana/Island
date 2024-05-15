package ua.javarush.hawryliv.island.domain.util;

import ua.javarush.hawryliv.island.domain.UnitSettings;
import ua.javarush.hawryliv.island.domain.animal.Duck;

public final class SettingsUtil {
    public static int getWeight(Class<?> aClass){
    return 0;
    }

    public static UnitSettings getUnitSettings(Class<?> aClass){
        return null;
    }

    public static void main(String[] args) {
        UnitSettings unitSettings = SettingsUtil.getUnitSettings(Duck.class);
        System.out.println(unitSettings.getWeight());
    }
}
