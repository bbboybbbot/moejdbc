package com.github.timeloveboy.moejdbc.annos;

/**
 * Created by timeloveboy on 17-10-26.
 */

import java.lang.annotation.*;

/**
 * @author sam
 * @since 2017/7/13
 */
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface Test {

    String name() default "sam";

    int num() default 0;

    String desc();

}
