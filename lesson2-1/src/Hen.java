
/**
 * Write a description of class Hen here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hen extends Animal implements Jumpable, Runnable {
    private float jump_limit;
    private int run_limit;

    public Hen(String name) {
        this.name = name;
        this.run_limit = 100;
        jump_limit = 10f;
    }

    String voice() {
        return "ko-ko-ko";
    }

    @Override
    public boolean jump(float height) {
        return jump_limit >= height;
    }

    @Override
    public boolean run(int length)  {
        return run_limit >= length;
    }
}