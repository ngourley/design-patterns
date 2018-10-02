package com.ngourley.structural.facade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLException;
import java.util.List;

/**
 * This pattern can be used to:
 * - Make an API Easier to Use
 * - Reduce dependencies on outside code
 * - Simplify the interface or client usage
 * - Usually a refactoring pattern
 *
 * https://en.wikipedia.org/wiki/Facade_pattern
 */
public class FacadeDemo {

    public static void main(String[] args) throws IOException {

        JdbcFacade facade = new JdbcFacade();
        List<JdbcFacade.Address> addresses = null;

        try {
            facade.createTable();
            facade.insertIntoTable();
            addresses = facade.getAddresses();
        } catch (SQLException ex) {
            System.out.println(ex);
        }

        for (JdbcFacade.Address address : addresses) {
            System.out.println(address.getId() + " " + address.getStreetName() + " " + address.getCity());
        }

    }
}
