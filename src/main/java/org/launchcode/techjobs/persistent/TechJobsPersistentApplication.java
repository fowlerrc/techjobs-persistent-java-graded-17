package org.launchcode.techjobs.persistent;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.*;
import java.util.Stack;


@SpringBootApplication
public class TechJobsPersistentApplication {


    public TechJobsPersistentApplication() throws SQLException {
    }

    public static void main(String[] args) {
		SpringApplication.run(TechJobsPersistentApplication.class, args);
	}

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/techjobs", "root", "root");
		Statement statement = connection.createStatement();


}
