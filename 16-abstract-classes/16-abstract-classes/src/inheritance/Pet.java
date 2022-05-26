package inheritance;

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;

public abstract class Pet
{
   private String name;
   private String species;
   private String adoptionDay;
   private float weight;

   public Pet(String name, String species, String adoptionDay, float weight)
   {
      this.name = name;
      this.species = species;
      this.adoptionDay = adoptionDay;
      this.weight = weight;
   }

   public void setName(String n) {
      this.name = n;
   };

   public String getName() {
      return this.name;
   };

   public boolean isLoved() {
      return true;
   }

   public String getAdoptionDay() {
      return this.adoptionDay;
   };

   public void setAdoptionDay(String day) {
      this.adoptionDay = day;
   };

   public void setWeight(float weight) {
      this.weight = weight;
   }
   public float getWeight() {
      return this.weight;
   }

   abstract boolean isHealthyweight(ArrayList<Integer> appropriateWeights);
}
