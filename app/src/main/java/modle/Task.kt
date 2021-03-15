package modle

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Task (
    @PrimaryKey @ColumnInfo  val id:Int,
    @ColumnInfo val title:String,
    @ColumnInfo  val decription:String,
    @ColumnInfo   val iscompleted:Boolean)