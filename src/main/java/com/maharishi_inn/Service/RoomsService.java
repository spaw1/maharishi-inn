/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maharishi_inn.Service;

import com.maharishi_inn.model.Rooms;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author EvaBam
 */
@Service
public interface RoomsService {
    public void addRoom(Rooms room);
    public List<Rooms> listRooms();
    public Rooms getRoom(long roomid);
    public void deleteRoom(long roomid);
    
}
