
/**
 * Write a description of class Hippo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hippo extends Animal implements Swimable, Runnable {
    private int swim_limit;
    private int run_limit;

    public Hippo(String name) {
        this.name = name;
        this.run_limit = 50;
        swim_limit = 200;
    }

    String voice() {
        return "uf-uf-uf";
    }

    @Override
    public boolean swim(int length) {
        return swim_limit >= length;
    }

    @Override
    public boolean run(int length)  {
        return run_limit >= length;
    }
}