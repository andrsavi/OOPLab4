package po83.savinov.oop.model;

public class Aerobics extends AbstractExercise implements Exercise {

    private  int duration; //продолжительность в минутах
    public  static  final  int dur = 3; //время выполнения - упражнения 3 минуты

    public Aerobics (String name, Equipments equipments, Approach[] approaches) // конструктор, принимающий три параметра – название упражнения, используемый спортинвентарь и массив подходов
    {
        super(name, equipments);
        WeightTraining weightTraining = new WeightTraining(name, approaches);
    }

    public  int getDuration() { return  duration; } // метод, возвращающий продолжительность

    public void setDuration(int newDuration) { duration = newDuration; } // метод, возвращающий новое значение продолжительности


    public  String toString() // метод возвращает строку в формате "<name>, Equipment: <equipment>, <duration> min"
    {
        return String.format("%s, Equipment: %s",super.getName(), super.getEquipments());
    }

    public  int hashCode() //  метод вычисляет хэш-код как произведение числа 53 на результат вызова метода hashCode() суперкласса и продолжительности
    {
        int hash = 53&super.hashCode() & getDuration();
        return hash;
    }

    public boolean equals(Object object) // метод  проверяет соответствие типов объектов (являются экземплярами одного класса), одинаковость названий, используемого инвентаря, продолжительности
    {
        Aerobics otherAbsExercise = (Aerobics) object;
        return super.getName() == otherAbsExercise.getName() && this.getEquipments() == otherAbsExercise.getEquipments() && this.getDuration() == otherAbsExercise.getDuration();
    }
}
