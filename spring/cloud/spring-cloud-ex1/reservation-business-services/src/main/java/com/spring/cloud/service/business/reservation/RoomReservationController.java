package com.spring.cloud.service.business.reservation;

import com.spring.cloud.service.business.reservation.client.RoomService;
import com.spring.cloud.service.business.reservation.domain.Room;
import com.spring.cloud.service.business.reservation.domain.RoomReservation;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(value="RoomReservations", description = "Business process service operations on rooms and reservations", tags=("roomReservations"))
public class RoomReservationController {
    @Autowired
    private RoomService roomService;

    @Autowired
    private RoomReservationBusinessProcess businessProcess;

    @RequestMapping(value = "/rooms", method = RequestMethod.GET)
    @ApiOperation(value="Get All Rooms", notes="Gets all rooms in the system", nickname="getRooms")
    public List<Room> getAllRooms(@RequestParam(name="roomNumber", required=false)String roomNumber){
        return this.roomService.findAll(roomNumber);
    }

    @RequestMapping(value="/roomReservations/{date}", method=RequestMethod.GET)
    @ApiOperation(value="Get Room Reservations", notes="Gets all reservations for a specific date", nickname="getReservationsForDate")
    public List<RoomReservation> getRoomReservationsForDate(@PathVariable("date") String date){
        return this.businessProcess.getRoomReservationsForDate(date);
    }

}
