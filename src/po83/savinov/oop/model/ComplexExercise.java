package po83.savinov.oop.model;

public interface ComplexExercise extends Exercise {

    boolean add(Approach approach); // метод добавляет ссылку в конец очереди
    Approach remove(); // метод, удаляющий нулевой элемент очереди (голову)
    Approach approach(); // метод, возвращающий нулевой элемент очереди (голову) без ее удаления
    boolean add(int i, Approach approach); // метод вставки ссылки в заданную позицию
    Approach getApproach(int i); // метод, возвращающий ссылку из списка по её номеру
    void setApproach(int i, Approach approach); // метод, изменяет ссылку в списке по её номеру
    Approach remove(int i); // метод удаляет ссылку из списка по её номеру
    int size(); // метод, возвращающий общее число ссылок в списке
    Approach[] getApproaches(); // метод, возвращающий массив ссылок
    double[] approachWeights(); // метод, возвращающий массив весов в каждом подходе упражнения
    int[] approachRepetitions(); // метод, возвращающий массив числа повторов в каждом подходе упражнения
    Approach remove(Approach approach); // метод удаляющий подход из списка (принимает в качестве параметра ссылку типа Approach)
    int indexOf(Approach approach); // метод, возвращающий индекс первого вхождения объекта Approach
    int lastIndexOf(Approach approach); // метод, возвращающий индекс последнего вхождения объекта Approach
}
