package com.spring.cloud.service.business.reservation.client;

import com.spring.cloud.service.business.reservation.domain.Room;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value="ROOMSERVICES")
public interface RoomService {

    @RequestMapping(value="/rooms", method= RequestMethod.GET)
    List<Room> findAll(@RequestParam(name="roomNumber", required=false)String roomNumber);

    @RequestMapping(value="/rooms/{id}", method = RequestMethod.GET)
    Room findOne(@PathVariable("id")long id);
}
