package po83.savinov.oop.model;

public class Workout {

    private Exercise[] exercises;
    private  int size;
    private int total;

    /*конструктор, по-умолчанию инициализирующий массив из 16 элементов (сами элементы имеют значение null)*/
    public Workout()
    {
        this.size = 16;
        this.exercises = new Exercise[size];
    }

    /*конструктор принимающий целое число – емкость массива, инициирующий массив указанным числом элементов (сами элементы имеют значение null)*/
    public Workout(int empty) {
        exercises = new Exercise[empty];
        size = empty;
    }

    /*метод, принимающий массив отделов – его элементы копируются в новый массив, ссылка на который сохраняется в атрибуте класса */
    public Workout(Exercise[] exercises)
    {
        this.exercises = new Exercise[exercises.length];
        System.arraycopy(exercises, 0, this.exercises, 0, exercises.length);
        size = exercises.length;
    }

    /* метод добавляющий упражнение (принимает ссылку на экземпляр класса Exercise). Пока этот метод возвращает истину после выполнения операции добавления элемента */
    public  boolean addExercise(Exercise exercise)
    {
        if(size == 0)
            return  false;
        for (int i = 0; i < exercises.length; i++)
        {
            if(exercises[i] == null)
            {
                exercises[i] = exercise;
                size--;
                break;
            }
        }
        return true;
    }

    /* метод вставки упражнение в заданную позицию (принимает номер элемента в массиве, ссылку на экземпляр класса Exercise). При вставке элементы массива, начиная с указанного сдвигаются вправо, и ссылка на элемент заносится в массив. Пока этот метод возвращает истину после выполнения операции добавления элемента */
    public  boolean addExerciseInto(Exercise exercise, int pos)
    {
        if(size == 0 || pos >= exercises.length || pos < 0)
            return false;
        System.arraycopy(exercises, pos, exercises, pos + 1, exercises.length - pos);
        size--;
        return true;
    }

    /* метод, возвращающий ссылку на экземпляр класса Exercise по его номеру в массиве. Принимает номер в качестве параметра */
    public  Exercise getExercise(int pos)
    {
        if (pos < 0 || pos >= exercises.length)
            return null;
        return exercises[pos];
    }

    /* метод, изменяющий ссылку на экземпляр класса Exercise по его номеру в массиве. Принимает в качестве параметров номер и ссылку на экземпляр класса Exercise. Возвращает ссылку, которую заменили */
    public Exercise replaceExercise(Exercise exercise, int pos)
    {
        if (pos < 0 || pos > exercises.length) return  null;
        Exercise temp = exercises[pos];
        if(temp == null) size--;
        exercises[pos] = exercise;
        return temp;
    }

    /* метод, удаляющий упражнение из массива по его номеру в массиве (принимает номер в массиве в качестве параметра). Возвращает удаленную из массива ссылку на экземпляр класса Exercise */
    public  Exercise removeExerciseAt(int pos) {
        if (pos < 0 || pos > exercises.length) return  null;
        Exercise temp = exercises[pos];
        exercises[pos] = null;
        size++;
        return temp;
    }


    /*метод возвращающий общее число упражнений.*/
    public  int getExerciseCount() { return  total; }


    /* метод, возвращающий общую длительность тренировки */
    public int durationTotal() {
        int result = 0;
        for(int i = 0; i < size; i++){
            if(exercises[i] != null) {
                result += exercises[i].getDuration();
            }
        }
        return result;
    }

    /* метод, проверяющий, есть ли упражнение с заданным именем в массиве. Возвращает логическое значение */
    public boolean hasExercise(String exerciseName){
        for(int i = 0; i < size; i++){
            if(exercises[i] != null && exercises[i].getName().equals(exerciseName)){
                return true;
            }
        }
        return false;
    }

    /* метод, − удаляющий все упражнения с заданным названием из массива. Принимает название упражнения в качестве параметра. Возвращает число удаленных элементов */
    public int removeAll(String exerciseName){
        int count = 0;
        for(int i = 0; i < size; i++){
            if(exercises[i] != null && exercises[i].getName().equals(exerciseName)){
                Exercise exercise = exercises[i];
                total--;
                for(int j = i + 1; j < size; j++){
                    exercises[j-1] = exercises[j];
                }
                exercises[size-1] = null;
            }
            count++;
        }
        return count;
    }

    /* метод, возвращающий массив упражнений, выполняемых без инвентаря (Equipments.NONE) */
    public Exercise[] getWithoutEquipment() {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (exercises[i].getEquipments().equals(Equipments.NONE)) {
                count++;
            }
        }
        Exercise[] exercises = new Exercise[count];
        int j = 0;
        for(int i = 0; i < size; i++) {
            if(exercises[i].getEquipments().equals(Equipments.NONE)) {
                exercises[j] = exercises[i];
                j++;
            }
        }
        return exercises;
    }

    public Exercise[] getExercises() // метод возвращает число упражнений
    {
        return exercises;
    }
    public String toString() // переопределение метода toString
    {
        StringBuilder sb = new StringBuilder("Workout:\n");
        Exercise[] returnWO = getExercises();
        for (int i = 0; i < returnWO.length; i++)
        {
            if (returnWO[i] != null) { sb.append(returnWO[i].toString() + "\n");}
        }
        return sb.toString();
    }

    public  int indexOf(Exercise exercise) // метод возвращающий индекс первого вхождения объекта типа Exercise
    {
        Exercise[] returnWO = getExercises();
        for (int i = 0; i < returnWO.length; i++) {
            if (returnWO[i].equals(exercise)) {
                return i;
            }
        }
        return -1;
    }

    public int LastIndexOf(Exercise exercise) // метод, возвращающий индекс последнего вхождения объекта типа Exercise
    {
        Exercise[] returnWO = getExercises();
        for (int i = returnWO.length - 1; i >= 0; i--) {
            if (returnWO[i].equals(exercise)) {
                return i;
            }
        }
        return -1;
    }

    public  boolean remove(Exercise exercise) // метод, удаляющий упражнение из массива (принимает ссылку на объект типа Exercise в качестве параметра)
    {
        for(int i = 0; i < size; i++){
            if(exercises[i] != null && exercises[i].equals(exercise)){
                total--;
                for(int j = i + 1; j < size; j++){
                    exercises[j-1] = exercises[j];
                }
                exercises[size-1] = null;
            }
            return true;
        }
        return false;
    }
}
