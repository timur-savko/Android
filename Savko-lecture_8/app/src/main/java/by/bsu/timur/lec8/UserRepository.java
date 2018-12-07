package by.bsu.timur.lec8;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.os.AsyncTask;

import java.util.List;

public class UserRepository {
    private UserDao userDao;
    private LiveData<List<User>> allUsers;

    UserRepository(Application application) {
        UserDB db = UserDB.getDB(application);
        userDao = db.userDao();
        allUsers = userDao.getUsers();
    }

    LiveData<List<User>> getUsers() {
        return allUsers;
    }

    void insert(User user) {
        new insertAsyncTask(userDao).execute(user);
    }

    private static class insertAsyncTask extends AsyncTask<User, Void, Void> {

        private UserDao userDao;

        insertAsyncTask(UserDao dao) {
            userDao = dao;
        }

        @Override
        protected Void doInBackground(final User... params) {
            userDao.addUser(params[0]);
            return null;
        }
    }
}
