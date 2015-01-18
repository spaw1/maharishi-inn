/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maharishi_inn.Controller;

import com.maharishi_inn.Service.RoomsService;
import com.maharishi_inn.model.Rooms;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author EvaBam
 */
@Controller
public class RoomsController {
    @Autowired
    RoomsService roomsService;
    @RequestMapping(value = "rooms/add", method = RequestMethod.POST)
    public String addroom(@Valid Rooms room, BindingResult result) {
        if (result.hasErrors()) {
            return "addRoom";
        } else {
           roomsService.addRoom(room);
        }
        return "Rooms/addRoom";
    }
  @RequestMapping(value = "*")
    public String list() {
      //  model.addAttribute("rooms",roomsService.listRooms());
      //  return "rooms/roomlist";
        return "index";
    }
  
}
