package demo.dao.Impl;

import demo.dao.GenericDao;
import org.apache.ibatis.session.SqlSession;

import javax.annotation.Resource;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by sys on 2016/6/5..
 *
 */
public class GenericDaoImpl<T extends Serializable, ID extends Number> implements GenericDao<T, ID> {



    @Resource
    private SqlSession sqlSession;

    private String namespace;

    @SuppressWarnings("unchecked")
    public GenericDaoImpl() {
        Class<T> modelClass;
        modelClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        namespace = modelClass.getSimpleName().toLowerCase();
    }




    @Override
    public void create(T model) {
        sqlSession.insert(namespace + ".create", model);
    }

    @Override
    public void remove(ID id) {
        sqlSession.delete(namespace + ".remove", id);
    }

    @Override
    public void modify(T model) {
        sqlSession.update(namespace + ".modify", model);
    }

    @Override
    public T search(ID id) {
        return sqlSession.selectOne(namespace+".search",id);
    }

    @Override
    public T search(String statement, Object parameter) {
        return sqlSession.selectOne(statement,parameter);
    }

    @Override
    public List<T> list() {
        return sqlSession.selectList(namespace+".list");
    }

    @Override
    public List<T> list(String statement, Object parameter) {
        return sqlSession.selectList(statement,parameter);
    }
}
