package Database;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;

/**
 * Created by Jakob on 6/18/2018.
 */
@Entity(tableName = "ExerciseWorkout", primaryKeys = {"exerciseId","workoutId"},foreignKeys = {
        @ForeignKey(entity = Exercise.class, parentColumns = "eId",childColumns = "exerciseId"),
        @ForeignKey(entity = Workout.class, parentColumns = "WId",childColumns = "workoutId")
})
public class ExerciseWorkoutJoin {

    private final int exerciseId;
    private final int workoutId;
    private final int kg;
    private final int reps;
    private final int sets;

    public ExerciseWorkoutJoin(int workoutId,int exerciseId, int kg, int reps, int sets) {
        this.exerciseId = exerciseId;
        this.workoutId = workoutId;
        this.kg = kg;
        this.reps = reps;
        this.sets = sets;
    }

    public int getExerciseId() {
        return exerciseId;
    }

    public int getWorkoutId() {
        return workoutId;
    }

    public int getKg() {
        return kg;
    }

    public int getReps() {
        return reps;
    }

    public int getSets() {
        return sets;
    }
}
