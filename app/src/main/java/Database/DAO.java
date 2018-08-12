package Database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by Jakob on 6/25/2018.
 */
@Dao
public interface DAO {

    @Insert()
    void insertProgram(Program program);

    @Query("SELECT * FROM Program")
    List<Program> getPrograms();

}
