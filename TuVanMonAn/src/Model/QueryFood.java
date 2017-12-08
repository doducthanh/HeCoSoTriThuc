/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author quangns
 */
public class QueryFood {
    
    /**
     * Tim kiem mon an theo ID
     * @param ID ma cua mon an trong database
     * @return Cac thuoc tinh cua mon an:
     * tenmon, soluong, protein, tinh bot, lipit, nhom, diem, status
     * @throws SQLException 
     */
    public static ArrayList<String> SearchFood(String ID) throws SQLException {
        try(Connection conn = ConnectSQL.connectsql()) {
            String query = "SELECT * FROM tbl_monan WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, ID);
            ResultSet rs;
            ArrayList<String> food = new ArrayList<String>();
            rs = ps.executeQuery();
            while (rs.next()) {
                String tenmon = rs.getString("tenmon");
                String soluong = rs.getString("soluong");
                String protein = rs.getString("protein");
                String tinhbot = rs.getString("tinhbot");
                String lipit = rs.getString("lipit");
                String nhom = rs.getString("nhom");
                String diem = rs.getString("diem");
                String status = rs.getString("status");
                food.add(ID);
                food.add(tenmon);
                food.add(soluong);
                food.add(protein);
                food.add(tinhbot);
                food.add(lipit);
                food.add(nhom);
                food.add(diem);
                food.add(status);
            }
            conn.close();
            return food;
        }
        catch(Exception e) {
            System.out.println("error: " + e);
        }
        return null;
    } 
    
    
    public static ArrayList<String> SearchFoodName(String tenmon) throws SQLException {
        try(Connection conn = ConnectSQL.connectsql()) {
            String query = "SELECT * FROM tbl_monan WHERE tenmon = ? COLLATE utf8_vietnamese2_ci;";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, tenmon);
            ResultSet rs;
            ArrayList<String> food = new ArrayList<String>();
            rs = ps.executeQuery();
            while (rs.next()) {
                String id = rs.getString("ID");
                String soluong = rs.getString("soluong");
                String protein = rs.getString("protein");
                String tinhbot = rs.getString("tinhbot");
                String lipit = rs.getString("lipit");
                String nhom = rs.getString("nhom");
                String diem = rs.getString("diem");
                String status = rs.getString("status");
                food.add(id);
                food.add(tenmon);
                food.add(soluong);
                food.add(protein);
                food.add(tinhbot);
                food.add(lipit);
                food.add(nhom);
                food.add(diem);
                food.add(status);
            }
                conn.close();
            return food;
        }
        catch(Exception e) {
            System.out.println("error: " + e);
        }
        return null;
    } 
    
    
    /**
     * them mon an vao thuc don
     * @param tenmon ten mon an them vao thuc don
     * @param soluong 
     * @param protein 
     * @param tinhbot
     * @param lipit
     * @param nhom thuoc nhom nao
     * @param diem
     * @throws SQLException 
     */
    public static void InsertFood(String tenmon, String soluong, String protein,
            String tinhbot, String lipit, String nhom, long diem) throws SQLException {
        try(Connection conn = ConnectSQL.connectsql()) {
            String query = "INSERT INTO tbl_monan(tenmon, soluong, protein, tinhbot, lipit, nhom, diem)"
                    + " VALUES(?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, tenmon);
            ps.setString(2, soluong);
            ps.setString(3, protein);
            ps.setString(4, tinhbot);
            ps.setString(5, lipit);
            ps.setString(6, nhom);
            ps.setLong(7, diem);
            ps.executeUpdate();
            conn.close();
        }
        catch(Exception e) {
            System.err.println("error: " + e);;
        }
    }
    
    public static void main(String[] args) throws SQLException {
        ArrayList<String> food = SearchFoodName("cơm");
        System.out.println(food.get(1));
        InsertFood("che", "1 bat", "70", "90", "49", "1", 0000000010);
    }
}