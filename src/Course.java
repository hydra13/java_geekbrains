/**
 * Created by Hydra13 on 28.03.2017.
 */
public class Course {
    private Obstacle[] obstacles;
    Course(Obstacle ... obstacles){
        this.obstacles = obstacles;
    }

    void doIt(Team team){
        team.clearLastResults();
        team.clearLastSuccessResults();
        for (Obstacle obstacle : obstacles) {
            team.appendResults(obstacle.toString());
            for (Animal animal : team.animals){
                boolean resultAnimal = obstacle.doIt(animal);
                if (resultAnimal){
                    team.appendSuccessResults("\t" + animal + ": " + resultAnimal);
                }
                team.appendResults("\t" + animal + ": " + resultAnimal);
            }
        }
    }
}
