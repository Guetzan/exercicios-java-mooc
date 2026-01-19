import java.util.ArrayList;

public class ExerciseManagement {
    private ArrayList<Exercise> exercises;
    
    ExerciseManagement() {
        this.exercises = new ArrayList<>();
    }
    
    public ArrayList<String> exerciseList() {
        ArrayList<String> list = new ArrayList<>();
        
        for(Exercise exercise: this.exercises) {
            list.add(exercise.getName());
        }
        
        return list;
    }
    
    public void add(String exercise) {
        this.exercises.add(new Exercise(exercise));
    }
    
    public void markAsCompleted(String exerciseName) {
        for(Exercise exercise: this.exercises) {
            if(exercise.getName().equals(exerciseName)) {
                exercise.setAsComplete();
            }
        }
    }
    
    public boolean isCompleted(String exerciseName) {
        for(Exercise exercise: this.exercises) {
            if(exercise.getName().equals(exerciseName)) {
                return exercise.isComplete();
            }
        }
        
        return false;
    }
}
