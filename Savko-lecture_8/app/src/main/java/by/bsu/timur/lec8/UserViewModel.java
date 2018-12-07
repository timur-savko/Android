package by.bsu.timur.lec8;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import java.util.List;

public class UserViewModel extends AndroidViewModel {
    private UserRepository userRepository;
    private LiveData<List<User>> allUsers;

    public UserViewModel(@NonNull Application application) {
        super(application);
        userRepository = new UserRepository(application);
        allUsers = userRepository.getUsers();
    }

    LiveData<List<User>> getAllUsers() {
        return allUsers;
    }

    void insert(User user) {
        userRepository.insert(user);
    }
}
