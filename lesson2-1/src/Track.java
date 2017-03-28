/**
 * Write a description of class Track here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class Track extends Obstacle{
    private int length;

    public Track(int length) {
        this.length = length;
    }

    @Override
    boolean doIt(Animal animal) {
        if (animal instanceof Runnable)
            return ((Runnable) animal).run(length);
        else
            return false;
    } 
}