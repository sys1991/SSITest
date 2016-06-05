package demo.services;

import demo.model.User;

/**
 * Created by sys on 2016/6/5.
 */
public interface UserService extends GenericService<User,Integer>{
    User login(User user);
}
