package composition;

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;

public interface Pet {
   void setName(String s);

   default String getName() {
      return this.getClass().toString();
   };

   default boolean isLoved() {
      return true;
   }

   String getAdoptionDay();

   void setAdoptionDay(String day);

   void setWeight(float weight);
   float getWeight();

   default boolean isHealthyweight(ArrayList<Integer> appropriateWeights) {
      float currentWeight = this.getWeight();
      if (appropriateWeights.contains(currentWeight)) {
         return true;
      }
      return false;
   }
}
