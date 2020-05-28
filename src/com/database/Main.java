package com.database;

import java.sql.*;
import java.util.Scanner;

public class Main {

    private static final String url = "jdbc:mysql://localhost:3306/sys?autoReconnect=true&useSSL=false";
    private static final String user = "root";
    private static final String password = "Chinga18";
    private static Scanner scanner = new Scanner( System.in );

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected!");
            System.out.println("_____________");
            System.out.println("Choose the room:");

            /*String query = "insert into room(id) values (?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            for (int i = 1; i < 10; ++i){
                preparedStatement.setInt(1, i);
                preparedStatement.executeUpdate();
            }*/
            Guest arman = new Guest(2, "Arman", "Suleimen");

            String all_rooms = "select * from room where isFree = true";
            Statement roomStatement = connection.createStatement();
            ResultSet rs = roomStatement.executeQuery(all_rooms);

            while (rs.next()){
                int id = rs.getInt(1);
                System.out.println("id: " + id);
            }

            int room_no = scanner.nextInt();

            String new_booking = "insert into booking (room_no, fname, lname, nights) values (?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(new_booking);
            preparedStatement.setInt(1, room_no);
            preparedStatement.setString(2, arman.getFname());
            preparedStatement.setString(3, arman.getLname());
            scanner = new Scanner(System.in);
            System.out.println("Choose count of nights");
            int nights = scanner.nextInt();
            preparedStatement.setInt(4, nights);
            preparedStatement.executeUpdate();
            String update = "update room set isFree = false where id = " + room_no;
            Statement updateStatement = connection.createStatement();
            updateStatement.executeUpdate(update);
            System.out.println("Room " + room_no + " is booked successfully!");



            /*Guest shyngys = new Guest(1, "Shyngys", "Rakhad");
            Guest arman = new Guest(2, "Arman", "Suleimen");
            Guest steve = new Guest(3, "Steve", "Jobs");

            String query = "delete from employee where id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            for (int i = 4; i <= 6; ++i){
                preparedStatement.setInt(1, i);
                preparedStatement.execute();
            }

            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery("SELECT * FROM employee");
            while (rs.next()){
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String surname = rs.getString(3);
                System.out.println("id: " + id + " name: " + name + " surname: " + surname);
            }*/

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    private boolean isFree(int room_no){
        return true;
    }

}
