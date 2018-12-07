package by.bsu.timur.lec8;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface UserDao {
    @Query("SELECT * FROM USER")
    LiveData<List<User>> getUsers();

    @Insert
    void addUser(User user);

    @Query("DELETE FROM USER")
    void deleteAll();
}
