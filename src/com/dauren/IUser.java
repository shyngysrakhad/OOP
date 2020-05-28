package com.dauren;

import java.sql.SQLException;

public interface IUser {
    void showFriends();
    void updateUsername(String username) throws SQLException;
    void updatePassword(String password) throws SQLException;
    void updateFirstName(String firstName) throws SQLException;
    void updateLastName(String lastName) throws SQLException;
    void addFriend(User friend) throws SQLException;
    void deleteFriend(User friend) throws SQLException;

    boolean isExistUser(String username) throws SQLException;
    boolean isFriend(User friend) throws SQLException;
}
