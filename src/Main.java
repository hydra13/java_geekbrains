/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main {

    public static void main(String[] args) {
//  первоначальный код с занятия
//        Animal[] zoo = {new Cat("Murzik"), new Hen("Izzy"), new Hippo("Hippopo")};
        Track track = new Track(80);
        Wall wall = new Wall(3);
        Water water = new Water(10);
//
//        for (Animal animal : zoo) {
//            System.out.println(animal + " say: " + animal.voice());
//            System.out.println(" run: " + track.doIt(animal));
//            System.out.println(" jump: " + wall.doIt(animal));
//            System.out.println(" swim: " + water.doIt(animal));
//        }

        Course c = new Course(track, wall, water);

        Team t1 = new Team("Кошаки",
                new Cat("Мурзик"),
                new Cat( "Барсик"),
                new Cat("Васька"),
                new Cat("Матроскин"));
        Team t2 = new Team("Великаны",
                new Hippo("Гиппо1"),
                new Hippo("Гиппо2"),
                new Hippo("Гиппо3"),
                new Hippo("Гиппо4"));

        c.doIt(t1);
        c.doIt(t2);
        t1.showResults();
        t2.showResults();
    }
}