package Database;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Jakob on 6/18/2018.
 */
@Entity(tableName = "Exercise")
public class Exercise {

    private String exerciseName;

    @PrimaryKey(autoGenerate = true)
    private int EId;

    public Exercise(int EId, String exerciseName) {
        this.EId = EId;
        this.exerciseName = exerciseName;
    }

    public int getEId() {
        return EId;
    }

    public void seteId(int EId) {
        this.EId = EId;
    }

    public String getExerciseName() {
        return exerciseName;
    }



    public void setExerciseName(String exerciseName) {
        this.exerciseName = exerciseName;
    }


}
