package po83.savinov.oop.model;

public class Approach {

    private  int duration; // продолжительность выполнения
    private  double weight; // вес снаряда
    private int numOfRepetitions; // число повторов

    public  Approach() // конструктор, инициализирующий поля числовыми значениями
    {
        this.weight = 0;
        this.duration = 2;
        this.numOfRepetitions = 12;
    }

    public  Approach(int duration, double weight, int numOfRepetitions) // конструктор, принимающий три параметра
    {
        this.duration = duration;
        this.weight = weight;
        this.numOfRepetitions = numOfRepetitions;
    }

    public double getWeight()
    {
        return  weight;
    }

    public void  setWeight(double weight)
    {
        this.weight = weight;
    }

    public  int getDuration()
    {
        return  duration;
    }

    public void setDuration(int duration)
    {
        this.duration = duration;
    }

    public int getNumOfRepetitions()
    {
        return numOfRepetitions;
    }

    public  void setNumOfRepetitions(int numOfRepetitions)
    {
        this.numOfRepetitions = numOfRepetitions;
    }

    /* переопределение метода toString */
    public String toString()
    {
        return String.format("w: %s kg #: %s t: %s min",this.weight, this.numOfRepetitions, this.duration);
    }

    /* метод вычисляет хэш-код как произведение продолжительности, числа повторов и хэш-кода веса (Double.hashCode()) */
    public  int hashCode()
    {
        int hash = this.duration & Double.hashCode(weight);
        return hash;
    }

    /* метод проверяет соответствие типов объектов (являются экземплярами одного класса), одинаковость названий и используемого инвентаря */
    public  boolean equals(Object object)
    {
        Approach otherApproach = (Approach) object;
        return this.duration == otherApproach.duration && this.weight == otherApproach.weight && this.numOfRepetitions == otherApproach.numOfRepetitions;
    }
}
