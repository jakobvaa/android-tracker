package Database;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Jakob on 6/18/2018.
 */
@Entity
public class Program {


    @PrimaryKey(autoGenerate = true)
    private int pid;
    @ColumnInfo
    private String programName;

    public Program(String programName){
        this.programName = programName;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }


}
