package po83.savinov.oop.model;

public class Test {

    public static void main(String[] args) {
        //System.out.println("Я сделаль!");
        //lab1tests();
        //lab2tests();
        //lab3test();
        lab4test();
    }

    /* public  static  void lab2tests() {
        Approach approach = new Approach();
        Approach approach1 = new Approach(1 ,1, 1 );
        Approach approach2 = new Approach(2 ,2, 2 );
        Approach approach10 = new Approach(10 ,10, 10 );
        WeightTraining weightTraining = new WeightTraining("Бег");
        weightTraining.add(approach);
        weightTraining.add(approach1);
        weightTraining.add(approach2);
        weightTraining.add(1,approach10);
        weightTraining.remove(1);
        System.out.println(weightTraining.getDuration());
        System.out.println(weightTraining.getApproach(0).getWeight());
        weightTraining.remove();
        System.out.println(weightTraining.getApproach(0).getWeight());
    } */

    /*public static void lab1tests() {
        Workout workout1 = new Workout(8);
        Exercise firstEx = new Exercise("Bobs", 5);
        Exercise secondEx = new Exercise("Run", 10);
        Exercise thirdEx = new Exercise("Chin-ups", 15);
        Exercise fourEx = new Exercise("Swimming", 10);
        Exercise fiveEx = new Exercise("Dumbbells", 7);
        workout1.addExercise(firstEx);
        workout1.addExercise(secondEx);
        workout1.addExercise(thirdEx);
        workout1.addExercise(fourEx);
        workout1.addExercise(fiveEx);
        System.out.println(workout1.durationTotal());
        System.out.println(workout1.hasExercise("Run"));
        System.out.println(workout1.getExercise(4));
    }
    */

    /*public  static void lab3test()
    {
        Approach approach = new Approach();
        Approach approach1 = new Approach(1 ,1, 1 );
        Approach approach2 = new Approach(2 ,2, 2 );
        Approach approach10 = new Approach(10 ,10, 10 );
        Approach[] approaches = new Approach[4];
        approaches[0] = approach;
        approaches[1] = approach1;
        approaches[2] = approach2;
        approaches[3] = approach10;
        Workout workout = new Workout(5);
        Exercise exercise1 = new Aerobics("Присед",Equipments.NONE,approaches);
        Exercise exercise2 = new Aerobics("Становая",Equipments.BURBELL,approaches);
        Exercise exercise3 = new Aerobics("Жим",Equipments.BURBELL,approaches);
        Exercise exercise4 = new Aerobics("Подтягивания",Equipments.NONE,approaches);
        Exercise exercise5 = new Aerobics("Отжимания",Equipments.NONE,approaches);
        workout.addExercise(exercise1);
        workout.addExercise(exercise2);
        workout.addExercise(exercise3);
        workout.addExercise(exercise4);
        workout.addExercise(exercise5);
        Exercise[] exercises = workout.getWithoutEquipment();
        for (int i = 0; i < exercises.length; i++) {
            System.out.println(exercises[i].getName());
        } */
    static  void lab4test() {
        Approach approach = new Approach();
        Approach approach1 = new Approach(1 ,1, 1 );
        Approach approach2 = new Approach(2 ,2, 2 );
        Approach approach10 = new Approach(10 ,10, 10 );
        Approach[] approaches = new Approach[4];
        approaches[0] = approach;
        approaches[1] = approach1;
        approaches[2] = approach2;
        approaches[3] = approach10;
        Workout workout = new Workout(5);
        Exercise exercise1 = new Aerobics("Присед",Equipments.NONE,approaches);
        Exercise exercise2 = new Aerobics("Становая", Equipments.BURBELL,approaches);
        Exercise exercise3 = new Aerobics("Жим", Equipments.BURBELL,approaches);
        Exercise exercise4 = new Aerobics("Подтягивания",Equipments.NONE,approaches);
        Exercise exercise5 = new Aerobics("Отжимания",Equipments.NONE,approaches);
        workout.addExercise(exercise1);
        workout.addExercise(exercise2);
        workout.addExercise(exercise3);
        workout.addExercise(exercise4);
        workout.addExercise(exercise5);
        WeightTraining weightTraining = new WeightTraining("Штанга",Equipments.BURBELL);
        weightTraining.add(approach);
        weightTraining.add(approach1);
        weightTraining.add(approach2);
        System.out.println(weightTraining);
        System.out.println(weightTraining.remove(approach1));
        System.out.println(weightTraining);
        System.out.println(workout);
        workout.remove(exercise4);
        System.out.println(workout);
    }
}
