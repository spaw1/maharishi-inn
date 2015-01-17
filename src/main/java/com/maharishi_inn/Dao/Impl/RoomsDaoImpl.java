/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maharishi_inn.Dao.Impl;

import com.maharishi_inn.Dao.RoomsDao;
import com.maharishi_inn.model.Rooms;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author EvaBam
 */
@Repository
public class RoomsDaoImpl extends AbstractDao<Rooms> implements RoomsDao {
      public RoomsDaoImpl(Class<Rooms> entityClass) {
        super(entityClass);
    }


    @Override
    public void addRoom(Rooms room) {
        getSession().merge(room);
    }

    @Override
    public Rooms getRoom(long roomid) {
         return (Rooms) getSession().get(Rooms.class, roomid);
       
    }

    @Override
    public void deleteRoom(long roomid) {
        Rooms room = getRoom(roomid);

        if (room != null) {
            getSession().delete(room);
        }
    }

    @Override
    public List<Rooms> listRooms() {
          return getSession().createCriteria(Rooms.class).list();
        
    }

}
