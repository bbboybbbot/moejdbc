package com.github.timeloveboy.moejdbc.beanresult;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.sql.ResultSet;

/**
 * Created by timeloveboy on 17-10-26.
 */
public class resultclassfactory {
    <T> T build(Class c, ResultSet resultSet) throws Exception {
        T result = (T) c.newInstance();
        for (Field flied : c.getFields()) {
            Class tc = flied.getGenericType().getClass();
            Type t = flied.getGenericType();
            String name = flied.getName();
            resultSet.getObject(name, tc);

            Method m = c.getMethod("get" + flied.getName());
            String value = (String) m.invoke(result); // 调用getter方法获取属性值
            if (value == null) {
                m = c.getMethod("set" + flied.getName(), tc);
                m.invoke(result, "");
            }
        }
        return result;
    }
}
