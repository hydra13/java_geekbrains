/**
 * Write a description of class Water here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class Water extends Obstacle{
    private int length;

    public Water(int length) {
        this.length = length;
    }

    @Override
    boolean doIt(Animal animal) {
        if (animal instanceof Swimable)
            return ((Swimable) animal).swim(length);
        else
            return false;
    }
}