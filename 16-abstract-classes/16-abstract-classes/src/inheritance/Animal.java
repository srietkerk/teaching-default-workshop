package inheritance;

import java.awt.Color;
import java.awt.Point;

public abstract class Animal
{
   private Color color;
   
   public Animal(Color color) { this.color = color; }
   
   public Color getColor() { return color; }
   public void setColor(Color c) { color = c; }
   abstract double getArea();
   abstract double getPerimeter();
   abstract void translate(Point p);
}


   
