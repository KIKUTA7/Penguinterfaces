Write an abstract class Animal with the attribute int age and the method void birthday() which increments the age by one. Write a class Penguin which inherits from Animal and adds the extra attributes String name and double height.

Write an interface Comparable which contains a method int compareTo(Penguin other) which should behave as specified in the standard. Write an interface Copyable which provides a method Penguin copy() which returns a copy of the given object.

Turn both Penguin into a Comparable as well as into a Copyable. Two penguins are meant to be ordered in highest priority according to their age, then according to their heights, and finally according to their names. If their names agree as well, they are considered as equal.

Hint: Useful, perhaps, could be the method [Math.signum()](https://docs.oracle.com/javase/ 7/docs/api/java/lang/Math.html#signum(double))
