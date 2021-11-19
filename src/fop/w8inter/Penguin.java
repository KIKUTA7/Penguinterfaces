package fop.w8inter;

public class Penguin extends Animal implements Copyable, Comparable{
    private String name;
    private double height;

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public Penguin (int age, String name, double height)
    {
        this.name = name;
        this.age = age;
        this.height = height;
    }


    @Override
    public int compareTo(Penguin other) {
        if(this.age < other.getAge()) return -1;
        if(this.age > other.getAge()) return 1;
        if(this.height < other.getHeight()) return -1;
        if(this.height > other.getHeight()) return 1;
        int Min = other.getName().length();
        if(Min> this.name.length()) Min  = this.name.length();
        for (int i=0;i<Min;i++)
        {if(this.name.charAt(i)<other.getName().charAt(i)) return -1;
            else if (this.name.charAt(i)>other.getName().charAt(i)) return 1;}
        if(Min == this.getName().length() && Min!= other.getName().length()) return -1;
        if(Min == other.getName().length() && Min!= this.getName().length()) return 1;
        return 0;

    }

    @Override
    public Penguin copy() {
        return new Penguin(this.getAge(),this.getName(),this.getHeight());
    }
}
