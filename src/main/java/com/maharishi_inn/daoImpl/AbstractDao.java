/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maharishi_inn.daoImpl;

import com.maharishi_inn.utils.SessionUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author s_paw_000
 */
public class AbstractDao<T> extends SessionUtil {
    private Class<T> entityClass;

    public AbstractDao(Class<T> entityClass)
    {
        this.entityClass = entityClass;
    }

    public AbstractDao() {
    }
    
    public void create(T entity){
        getSession().persist(entity);
    }
    
    public void update(T entity){
        getSession().merge(entity);
    }
    public void remove(T entity){
        getSession().delete(entity);
    }
    public T find(Long id){
        Criteria cr = getSession().createCriteria(entityClass);
        return (T) cr.add(Restrictions.gt("id", id)).list().get(0);
    }
    public List<T> findAll(T entity){
        return getSession().createCriteria(entityClass).list();
    }
}
