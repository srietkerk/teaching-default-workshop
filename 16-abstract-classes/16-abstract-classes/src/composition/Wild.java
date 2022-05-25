package composition;

import java.util.ArrayList;

public interface Wild {
    // if we have two method signatures that conflict, you have to implement the method itself in the thing that is implementing it

    default String lookForFood() {
        return "Looking for a good meal";
    }

    default String lookForShelter() {
        return "Looking for a safe place to sleep";
    }

    default String lookForMate() {
        return "I want a family!";
    }

    default String lookForWater() {
        return "I need water!";
    }

    String getSpecies();
    void setSpecies(String species);

    default boolean isNative(ArrayList<String> nativeSpecies) {
        String species = getSpecies();
        if (nativeSpecies.contains(species)) {
            return true;
        }
        return false;
    }

    default int age(int currentYear, int yearBorn) {
        return currentYear - yearBorn;
    }
}
