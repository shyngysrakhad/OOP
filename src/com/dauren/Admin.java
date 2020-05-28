package com.dauren;

import java.sql.SQLException;

public class Admin extends User implements IAdmin{
    private String sql;
    public Admin(String username, String password, String firstName, String lastName) throws SQLException {
        super(username, password, firstName, lastName);
    }

    @Override
    public void deleteUser(User user) throws SQLException {
        sql = "DELETE FROM project.user where id = " + user.getId();
        executeUpdate(sql);
        System.out.println(user.getUsername() + " is deleted successfully");
    }

    @Override
    public void deleteFriends(User user1, User user2) throws SQLException {
        sql = "DELETE FROM project.friends where user_id_1 = " + user1.getId() + " and user_id_2 = " + user2.getId();
        executeUpdate(sql);
        System.out.println(user1.getUsername() + " and " + user2.getUsername() + " are no longer friends");
    }
}
