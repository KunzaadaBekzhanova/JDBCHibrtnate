package peaksoft;

import peaksoft.dao.UserDaoJdbcImpl;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserDaoJdbcImpl userDaoJdbc = new UserDaoJdbcImpl();
        userDaoJdbc.createUsersTable();

//
//        userDaoJdbc.saveUser("Kunzaada","Bekzhanova",(byte)24);
//        userDaoJdbc.saveUser("Chynara","Mamatalieva",(byte)33);

        System.out.println(userDaoJdbc.existsByFirstName("Kunzaada"));

    }
}
