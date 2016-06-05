package demo.dao.Impl;

import demo.dao.UserDao;
import demo.model.User;
import org.springframework.stereotype.Repository;

/**
 * Created by sys on 2016/6/5.
 */
@Repository
public class UserDaoImpl extends GenericDaoImpl<User,Integer> implements UserDao {



}
