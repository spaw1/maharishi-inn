/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maharishi_inn.Dao;

import com.maharishi_inn.model.Rooms;
import java.util.List;

/**
 *
 * @author EvaBam
 */
public interface RoomsDao {
    public void addRoom(Rooms room);
    public List<Rooms> listRooms();
    public Rooms getRoom(long roomid);
    public void deleteRoom(long roomid);
    
}
