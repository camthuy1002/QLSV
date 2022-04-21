/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataAccessObj;

import Model.SinhVien;
import java.util.ArrayList;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 *
 * @author ASUS RG
 */
public class SinhVienDAO extends ConnectDB{
    public ArrayList<SinhVien> DanhSachSinhVien()
    {
        ArrayList<SinhVien> arrSinhVien = new ArrayList<SinhVien>();
        try {
            String sql = """
                         SELECT sinhvien.ID, sinhvien.Name, sinhvien.Gender, sinhvien.Email, date_format(sinhvien.DateOfBirth, "%d/%m/%Y") as DateOfBirth, lophoc.ID 
                         FROM sinhvien INNER JOIN lophoc ON sinhvien.IDClass = lophoc.ID""";
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while(rs.next())
            {
                SinhVien sv = new SinhVien();
                sv.setId(rs.getInt(1));
                sv.setName(rs.getString(2));
                sv.setGenDer(rs.getString(3));
                sv.setEmail(rs.getString(4));
                sv.setBirthDay(rs.getString(5));
                sv.setIdClass(rs.getString(6));
                arrSinhVien.add(sv);

            }
        } catch (Exception e) {
            e.printStackTrace();;
        }
        
        return arrSinhVien;
    }
    
    public ArrayList<SinhVien> DanhSachSinhVienTheoLop(String idLop)
    {
        ArrayList<SinhVien> arrSinhVienLop = new ArrayList<SinhVien>();
        try {
            String sql = "select ID, Name, Gender, Email, date_format(sinhvien.DateOfBirth, \"%d/%m/%Y\") as DateOfBirth, IDClass\n" +
"from sinhvien where IDClass=?";
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, idLop);
            ResultSet rs = pre.executeQuery();
            while(rs.next())
            {
                SinhVien sv = new SinhVien();
                sv.setId(rs.getInt(1));
                sv.setName(rs.getString(2));
                sv.setGenDer(rs.getString(3));
                sv.setEmail(rs.getString(4));
                sv.setBirthDay(rs.getString(5));
                sv.setIdClass(rs.getString(6));
                arrSinhVienLop.add(sv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }       
        return arrSinhVienLop;       
    }
    
    public int ThemSinhVien(SinhVien sv) 
    {
        try {
            String sql;
            sql = "INSERT INTO `mytestdb`.`sinhvien` (`ID`, `Name`, `Gender`, `Email`, `DateOfBirth`, `IDClass`) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setInt(1, sv.getId());
            pre.setString(2, sv.getName());
            pre.setString(3, sv.getGenDer());
            pre.setString(4, sv.getEmail());
            pre.setString(5, sv.getBirthDay());
            pre.setString(6, sv.getIdClass());
            return pre.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
   
}
