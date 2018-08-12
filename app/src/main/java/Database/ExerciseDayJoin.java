package Database;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;

/**
 * Created by Jakob on 6/18/2018.
 */

@Entity(tableName = "ExerciseDay", primaryKeys = {"eId","dayName","programId"},foreignKeys = {
        @ForeignKey(entity = Exercise.class, parentColumns = "eId", childColumns = "exerciseId"),
        @ForeignKey(entity = Day.class, parentColumns = "dayName",childColumns = "dayName"),
        @ForeignKey(entity = Day.class, parentColumns = "programId", childColumns = "programId")})

public class ExerciseDayJoin {
    private final int exerciseId;
    private final int programId;
    private final String dayName;

    public ExerciseDayJoin(int exerciseId, int programId, String dayName) {
        this.exerciseId = exerciseId;
        this.programId = programId;
        this.dayName = dayName;
    }

    public int getExerciseId() {
        return exerciseId;
    }

    public int getProgramId() {
        return programId;
    }

    public String getDayName() {
        return dayName;
    }
}
