package doa

import android.icu.text.CaseMap
import androidx.room.*
import androidx.room.Dao
import modle.Task

@Dao
     interface daoo {
         @Insert
         fun insert(task: Task)
    @Update
    fun update(task: Task)
    @Delete
    fun delete(task: Task)
    @Query("select *from task where title like:title")
    fun serch(title:  Task):List<Task>
    @Query("select*from task")
    fun allTask():List<Task>
}