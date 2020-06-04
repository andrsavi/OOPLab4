package po83.savinov.oop.model;

public abstract class AbstractExercise implements Exercise {


    private  String name; // название
    private  Equipments equipments; // используемый инвентарь


    public AbstractExercise() // конструктор, не принимающий параметров, инициализирует название пустой строкой, а используемый спортинвентарь – Equipments.NONE
    {
        name = "";
        equipments = Equipments.NONE;
    }

    public AbstractExercise(String name, Equipments equipments) // конструктор, принимающий 2 параметра – название и используемый спортинвентарь
    {
        this.name = name;
        this.equipments = equipments;
    }

    @Override
    public String getName() // метод, возвращающий название
    {
        return  name;
    }

    @Override
    public void setName(String name) // метод, устанавливающий новое значение названия
    {
        this.name = name;
    }

    @Override
    public Equipments getEquipments() // метод, возвращающий используемый спортинвентарь
    {
        return equipments;
    }

    @Override
    public void setEquipments(Equipments equipments) // метод, устанавливающий новое значение спортинвентаря
    {
        this.equipments = equipments;
    }

    public String toString() // переопределение метода toString
    {
        return  String.format("%s, Equipment: %s",this.name, this.equipments);
    }

    public boolean equals(Object object) // метод проверяет соответствие типов объектов (являются экземплярами одного класса), одинаковость названий и используемого инвентаря
    {
        AbstractExercise otherAbsEx = (AbstractExercise) object;
        return this.name == otherAbsEx.name && this.equipments == otherAbsEx.equipments;
    }
}
