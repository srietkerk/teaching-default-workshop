package composition;

public interface Cat {
    default void eat() {
        this.setFullStatus(true);
    }

    default void needToEat() {
        if (isHungry()) {
            eat();
        }
    }

    default boolean isHungry() {
        return !getFullStatus();
    }

    boolean getFullStatus();
    void setFullStatus(boolean status);

     default String makeNoise() {
        return "Roar!";
    }

    default String purr() {
        return "purrrr";
    }

}
