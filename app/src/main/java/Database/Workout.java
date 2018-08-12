package Database;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

import java.util.Date;

/**
 * Created by Jakob on 6/18/2018.
 */
@Entity(tableName = "Workout",
        foreignKeys =@ForeignKey(entity = Program.class,parentColumns = "pid",childColumns = "programId"))
public class Workout {

    @PrimaryKey(autoGenerate = true)
    private int WId;

    private int programId;
    private Date date;
    private String note;


    public Workout(int WId, int programId, Date date, String note) {
        this.WId = WId;
        this.programId = programId;
        this.date = date;
        this.note = note;
    }

    public int getProgramId() {
        return programId;
    }

    public void setProgramId(int programId) {
        this.programId = programId;
    }

    public void setWId(int wId) {
        this.WId = wId;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setNote(String note) {
        this.note = note;
    }


    public Date getDate() {
        return date;
    }

    public String getNote() {
        return note;
    }
    public int getWId() {
        return this.WId;
    }

}
