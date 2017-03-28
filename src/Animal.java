/**
 * Abstract class Animal - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
abstract class Animal {
    protected String name;

    abstract String voice();
    
    @Override
    public String toString() {
        return this.getClass().getName() + " " + name;
    }    
}
