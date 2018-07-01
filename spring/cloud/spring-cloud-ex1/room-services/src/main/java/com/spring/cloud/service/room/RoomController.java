package com.spring.cloud.service.room;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping(value="/rooms")
@Api(value="rooms", description = "Data service operations on rooms", tags=("rooms"))
public class RoomController {
    @Autowired
    private RoomRepository roomRepository;

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value="Get All Rooms", notes="Gets all rooms in the system", nickname="getRooms")
    public List<Room> findAll(@RequestParam(name="roomNumber", required = false)String roomNumber){
        if(StringUtils.isNotEmpty(roomNumber)){
            return Collections.singletonList(this.roomRepository.findByRoomNumber(roomNumber));
        }
        return (List<Room>) this.roomRepository.findAll();
    }

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    @ApiOperation(value="Get Room", notes="Gets a single room based on its unique id", nickname = "getRoom")
    public Room findOne(@PathVariable("id")long id){
        return this.roomRepository.findOne(id);
    }
}
