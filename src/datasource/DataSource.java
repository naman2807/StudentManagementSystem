package datasource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created By: Naman Agarwal
 * User ID: naman2807
 * Package Name: datasource
 * Project Name: StudentManagementSystem
 * Date: 14-02-2021
 */

public class DataSource {
    private PreparedStatement preparedStatement;
    private Connection connection;

    public void abc() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_database","root","");
            preparedStatement = connection.prepareStatement("insert into records values('naman',191500469,'pankaj','preeti',789456,'abc')");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


}
