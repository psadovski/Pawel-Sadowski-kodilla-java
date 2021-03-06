package com.kodilla.jdbc;

import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.Assert.assertEquals;

public class StoredProcTestSuite {
    @Test
    public void testUpdateVipLevels() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE READERS SET VIP_LEVEL = \"Not set\"";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);

        //When
        String sqlProcedureCall = "CALL UpdateVipLevels()";
        statement.execute(sqlProcedureCall);

        //Then
        String sqlCheckTable = "SELECT COUNT(*) AS HOW_MANY FROM READERS WHERE VIP_LEVEL=\"Not set\"";
        ResultSet rs = statement.executeQuery(sqlCheckTable);
        int howMany = -1;
        if (rs.next()) {
            howMany = rs.getInt("HOW_MANY");
        }
        assertEquals(0, howMany);
    }

    @Test
    public void testUpdateBestsellers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        int howMany = 0;
        String sqlCheck = "SELECT COUNT(*) AS HOW_MANY FROM BOOKS WHERE BESTSELLER = 1";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet result =statement.executeQuery(sqlCheck);
        if (result.next()) {
            howMany = result.getInt("HOW_MANY");
        }

        String sqlUpdate = "UPDATE BOOKS SET BESTSELLER = 0";
        statement.executeUpdate(sqlUpdate);

        //When
        String sqlProcedureCall = "CALL UpdateBestsellers()";
        statement.execute(sqlProcedureCall);

        //Then
        int actual = 0;
        String sqlCheckTable = "SELECT COUNT(*) AS HOW_MANY FROM BOOKS WHERE BESTSELLER = 1";
        ResultSet resultSet = statement.executeQuery(sqlCheckTable);
        if (resultSet.next()) {
            actual = resultSet.getInt("HOW_MANY");
        }
        assertEquals(howMany, actual);
    }
}
