package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.UserDao;
import web.model.User;
import java.util.List;

@Component
public class UserServiceImp implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public List<User> getCountUser(String count) { return userDao.getCountUser(count); }
    @Override
    public User getUserId(long id) {
        //System.out.println( id);
        return userDao.getUserId( id);
    }
    @Override
    public void saveUser(User user){
        userDao.saveUser(user);
    }
    @Override
    public void updateUser(User user){ userDao.updateUser(user);}
    @Override
    public void deleteUser(long id){
        userDao.deleteUser(id);
    }
}
