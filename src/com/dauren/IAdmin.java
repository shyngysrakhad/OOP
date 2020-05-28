package com.dauren;

import java.sql.SQLException;

public interface IAdmin {
    void deleteUser(User user) throws SQLException;
    void deleteFriends(User user1, User user2) throws SQLException;
}
