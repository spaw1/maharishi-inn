/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maharishi_inn.Service.Impl;

import com.maharishi_inn.Dao.RoomsDao;
import com.maharishi_inn.Service.RoomsService;
import com.maharishi_inn.model.Rooms;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author EvaBam
 */
@Service
@Transactional
public class RoomsServiceImpl implements RoomsService {
    @Autowired
    RoomsDao roomsDao;

   @Transactional
    public void addRoom(Rooms room) {
       roomsDao.addRoom(room);
    }

     @Transactional
    public List<Rooms> listRooms() {
        return roomsDao.listRooms();
     
    }

      @Transactional
    public Rooms getRoom(long roomid) {
        return roomsDao.getRoom(roomid);
       
    }

    @Override
    public void deleteRoom(long roomid) {
        roomsDao.deleteRoom(roomid);
        
    }
    
}
