import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;


public class ExerciseManagementTest {
    private ExerciseManagement management;
    
    @Before
    public void initialize() {        
        management = new ExerciseManagement();    
    }
    
    @Test
    public void exerciseListEmptyAtBeginning() {
        assertEquals(0, management.exerciseList().size());
    }
    
    @Test
    public void addingExerciseGrowsListByOne() {
        management.add("Add a new exercise to the list");
        assertEquals(1, management.exerciseList().size());
    }
    
    @Test
    public void addedExerciseIsInList() {
        management.add("Add a new exercise to the list");
        assertTrue(management.exerciseList().contains("Add a new exercise to the list"));
    }
    
    @Test
    public void exerciseCanBeMarkedAsComplete() {
        management.add("Add a new exercise to the list");
        management.markAsCompleted("Add a new exercise to the list");
        assertTrue(management.isCompleted("Add a new exercise to the list"));
    }
    
    @Test
    public void isUncompleteExerciseNotComplete() {
        management.add("Add a new exercise to the list");
        management.markAsCompleted("Add a new exercise to the list");
        assertFalse(management.isCompleted("Implement a basic RPG game"));
    }
}