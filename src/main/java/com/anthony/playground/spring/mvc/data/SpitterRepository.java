package com.anthony.playground.spring.mvc.data;

import com.anthony.playground.spring.mvc.Spitter;

public interface SpitterRepository {

  Spitter save(Spitter spitter);
  
  Spitter findByUsername(String username);

}
