/**
 * Created by Hydra13 on 28.03.2017.
 */
public abstract class Obstacle {
    abstract boolean doIt(Animal animal);
    @Override
    public String toString() {
        return "Obstacle: " + this.getClass().getName();
    }
}
