package com.anthony.playground.spring.mvc.data;

import com.anthony.playground.spring.mvc.Spittle;

import java.util.List;

public interface SpittleRepository {

  List<Spittle> findRecentSpittles();

  List<Spittle> findSpittles(long max, int count);
  
  Spittle findOne(long id);

  void save(Spittle spittle);

}
