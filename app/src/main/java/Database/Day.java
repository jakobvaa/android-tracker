package Database;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.support.annotation.NonNull;

/**
 * Created by Jakob on 6/18/2018.
 */

//Ha heile dinna entiteten i en liste i program isteden.
@Entity(tableName = "day_table",primaryKeys = {"programId","dayName"},foreignKeys = @ForeignKey(entity = Program.class, parentColumns = "pid",childColumns = "programId"))
public class Day {
    public final int programId;

    @NonNull
    public final String dayName;

    public Day(final int programId, final String dayName){
        this.programId = programId;
        this.dayName = dayName;
    }
    public int getProgramId() {
        return programId;
    }

    public String getDayName() {
        return dayName;
    }


}
