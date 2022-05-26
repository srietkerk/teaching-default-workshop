package inheritance;

import java.util.ArrayList;

public class Cat extends Pet {
    public Cat(String name, String adoptionDay, float weight) {
        super(name, "cat", adoptionDay, weight);
    }

    public boolean isHealthyweight(ArrayList<Integer> appropriateWeights) {
        float currentWeight = this.getWeight();
        if (appropriateWeights.contains(currentWeight)) {
            return true;
        }
        return false;
    }

}
