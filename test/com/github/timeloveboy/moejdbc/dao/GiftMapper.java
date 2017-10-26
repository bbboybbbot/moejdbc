package com.github.timeloveboy.moejdbc.dao;


import com.github.timeloveboy.moejdbc.annos.Param;
import com.github.timeloveboy.moejdbc.annos.Select;

import java.util.List;

/**
 * Created by shiquan on 16/7/18.
 */
public interface GiftMapper {

    @Select("select * from GiftFlow where CreateTime >= #{start} and CreateTime <= #{end}")
    List<GiftFlow> findInTime(@Param("start") int start, @Param("end") int end);
}
