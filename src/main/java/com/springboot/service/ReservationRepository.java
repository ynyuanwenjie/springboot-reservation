package com.springboot.service;

import com.springboot.mode.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.Collection;

/**
 * Created by yuanwenjie on 2017/3/11.
 */
public interface ReservationRepository extends JpaRepository<Reservation,Integer> {

    @RestResource(path="by-name")
    Collection<Reservation> findByName(@Param("rn")String name);

}
