package ua.javarush.hawryliv.island.domain.animal;

import ua.javarush.hawryliv.island.domain.Direction;
import ua.javarush.hawryliv.island.domain.island.Area;

public abstract class Animal {
    private int healthPoint; //0, 100

    public abstract void eat(Area area);

    //обмежена кількість тварин, які можуть проживати на певній area
    //може бути досягнута границя острова
    //тваринка сама вибирає наліво чи направо
    //ми перевіряємо чи можемо її пересунути чи ні

    public Direction chooseDirection() {
        return null;
    }

    //в залежності від healthPoint перевіряємо чи тваринка може розмножуватися
    public abstract Animal reproduce();

}
