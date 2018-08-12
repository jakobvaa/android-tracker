package Database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverters;

/**
 * Created by Jakob on 6/18/2018.
 */
@Database(entities = {Program.class,Workout.class,Exercise.class, Day.class},version =1)
@TypeConverters({Converter.class})
public abstract class AppDatabase extends RoomDatabase {

    public abstract DAO dao();

}
