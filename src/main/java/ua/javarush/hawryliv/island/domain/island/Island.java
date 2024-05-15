package ua.javarush.hawryliv.island.domain.island;

public class Island {
    private final Area[][] areas;

    public Island(int sizeX, int sizeY){
        this.areas = new Area[sizeX][sizeY];
    }
}
