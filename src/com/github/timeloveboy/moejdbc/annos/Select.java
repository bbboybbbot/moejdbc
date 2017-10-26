package com.github.timeloveboy.moejdbc.annos;

/**
 * Created by timeloveboy on 17-10-26.
 */

import java.lang.annotation.*;

/**
 * @author sam
 * @since 2017/7/13
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface Select {
    String[] value();
}
