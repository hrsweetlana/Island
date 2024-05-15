package ua.javarush.hawryliv.island.domain;

public @interface Settings {
    String filename();
    boolean isHunter() default false;
    String filenameMenu() default "";
}
