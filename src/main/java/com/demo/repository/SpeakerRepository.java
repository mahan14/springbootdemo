package com.demo.repository;

import java.util.List;

import com.demo.model.Speaker;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
