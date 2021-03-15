package modle

import android.content.Context
import androidx.room.Dao
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import doa.daoo

@Database(entities = [Task::class],version = 1,exportSchema = false)
abstract  class mydatabese:RoomDatabase() {
    abstract fun doa(): daoo

    companion object {
        var data: mydatabese? = null
        fun getenstence(context: Context): mydatabese {
            if (data == null) {

                data= Room.databaseBuilder(context, mydatabese::class.java, "mo")
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build()


            } else {
            }
                return data!!

            }


        }
}
