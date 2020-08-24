package com.example.location.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.location.entitys.Location;

public interface LocationDAO extends JpaRepository<Location, Integer>{

}
