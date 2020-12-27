package web.dao;

import web.model.User;
import java.util.List;

public interface UserDao {
    List<User> getCountUser(String count);

    User getUserId(long id);

    void saveUser(User user);

    void updateUser(User user);//long id,

    void deleteUser(long id);
}
