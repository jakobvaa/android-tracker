package Database;

import android.arch.persistence.room.TypeConverter;

import java.util.Date;

/**
 * Created by Jakob on 6/20/2018.
 */

public class Converter {

    @TypeConverter
    public Date timestampToDate(Long value){
        return value == null ? null : new Date(value);
    }

    @TypeConverter
    public long dateToTimestammp(Date date) {
        if (date == null) {
            return -1;
        } else {
            return date.getTime();
        }
    }
}
