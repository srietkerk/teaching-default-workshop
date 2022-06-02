# Teaching Default Methods: A composition approach to Object Oriented Programming
This repository, while being nested in a couple of folders, hosts two main folders, one for composition and one for inheritance.

In the composition folder, you will find three files:
> `Cat.java`

> `Pet.java`

> `Wild.java`

Since this is the composition example that we are going over in our activity, these three files are interfaces with default methods. Each interface holds functions we deemed relevant to cats, pets, and wild animals. There are a mixture of default methods and abstract methods in these interfaces. 

In the inheritance folder, the files are:
>  `Cat.java`

>  `Pet.java`

As the home for the inheritance example we are going over in the class, the cat is a concrete class that extends the abstract class pet. The pet class has a lot of implemented methods, one abstract method, and class variables to be used by its children. 

The task that we are giving the students is to make a lion class reusing the least amount of code. We are expecting students to arrive at the fact that, in the composition example, the lion can be composed of the cat and wild interfaces. Meanwhile, inheriting from the cat class is the most inherent solution for the inheritance example but will require refactoring and more work. We want to introduce the idea that object oriented programming can have a composition-centered look rather than only being inheritance-based.
