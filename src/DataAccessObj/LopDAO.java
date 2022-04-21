/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataAccessObj;

import Model.LopHoc;
import java.sql.ResultSet;
import java.util.Vector;
import java.sql.Statement;

/**
 *
 * @author ASUS RG
 */
//Ham lay ra tat ca cac lop hoc trong CSDL
public class LopDAO extends ConnectDB{
    public Vector<LopHoc> DanhSachLop() {
        Vector<LopHoc> vec = new Vector<LopHoc>();
        try {
            String sql = "select * from mytestdb.lophoc";
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                LopHoc lh = new LopHoc();
                lh.setIdLop(rs.getString(1));
                lh.setTenLop(rs.getString("TenLop"));
                vec.add(lh);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return vec;
    }
    
}
