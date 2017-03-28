/**
 * Created by Hydra13 on 28.03.2017.
 */
public class Team {
    protected Animal[] animals = new Animal[4];
    private String name;
    private String lastAllResult;
    private String lastSuccessResult;

    Team (String name,  Animal animal1,
                        Animal animal2,
                        Animal animal3,
                        Animal animal4) {
        this.name = name;
        this.animals[0] = animal1;
        this.animals[1] = animal2;
        this.animals[2] = animal3;
        this.animals[3] = animal4;
    }

    void clearLastResults(){
        lastAllResult = "";
    }

    void clearLastSuccessResults(){
        lastSuccessResult = "";
    }

    void appendResults(String string){
        lastAllResult += string + "\n";
    }

    void appendSuccessResults(String string){
        lastSuccessResult += string + "\n";
    }

    void showResults(){
        System.out.println("-----" + this.toString() + " - All Results-----");
        System.out.print(lastAllResult);
        System.out.println("--------------------------------------");
    }

    void showSuccessResults(){
        System.out.println("-----" + this.toString() + " - Success Results-----");
        System.out.print(lastSuccessResult);
        System.out.println("--------------------------------------");
    }

    @Override
    public String toString() {
        return this.getClass().getName() + " " + name;
    }
}
