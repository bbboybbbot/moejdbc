package com.github.timeloveboy.moejdbc.executor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by timeloveboy on 17-10-26.
 */
public class excute {
    Statement stmt;

    public excute(Statement stme) {
        this.stmt = stme;
    }

    int update(String sql) throws SQLException {
        return stmt.executeUpdate(sql);
    }

    ResultSet query(String sql) throws SQLException {
        return stmt.executeQuery(sql);
    }

}
