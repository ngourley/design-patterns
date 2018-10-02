package com.ngourley.structural.facade;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcFacade {

    DbSingleton instance = null;

    public JdbcFacade() {
        this.instance = DbSingleton.getInstance();
    }

    public int createTable() throws SQLException {
        Statement sta = this.instance.getConnection().createStatement();
        int count = sta.executeUpdate("CREATE TABLE Address (ID INTEGER, StreetName "
                + "VARCHAR(20), City VARCHAR(20))");
        System.out.println("Table created.");
        sta.close();
        return count;
    }

    public int insertIntoTable() throws SQLException {
        Statement sta = this.instance.getConnection().createStatement();
        int count = sta.executeUpdate("INSERT INTO Address (ID, StreetName, City) "
                + "values (1, '1234 Some street', 'Layton')");
        System.out.println(count + " record(s) created.");
        sta.close();
        return count;
    }

    public List<Address> getAddresses() throws SQLException {
        Statement sta = this.instance.getConnection().createStatement();
        ResultSet rs = sta.executeQuery("SELECT * FROM Address");

        List<Address> addresses = new ArrayList<>();

        while(rs.next()) {
            addresses.add(
                new Address(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3)
                )
            );
        }

        return addresses;
    }

    class Address {
        int index;
        String street;
        String city;

        public int getId() {
            return this.index;
        }

        public String getStreetName() {
            return this.street;
        }

        public String getCity() {
            return this.city;
        }

        public Address(int index, String street, String city) {
            this.index = index;
            this.street = street;
            this.city = city;
        }
    }
}
