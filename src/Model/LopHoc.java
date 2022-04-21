/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ASUS RG
 */
public class LopHoc {
   
    private String idLop;
    private String tenLop;

    public LopHoc() {
    }

    public LopHoc(String idLop, String tenLop) {
        this.idLop = idLop;
        this.tenLop = tenLop;
    }
     
    /**
     * @return the idLop
     */
    public String getIdLop() {
        return idLop;
    }

    /**
     * @param idLop the idLop to set
     */
    public void setIdLop(String idLop) {
        this.idLop = idLop;
    }

    /**
     * @return the tenLop
     */
    public String getTenLop() {
        return tenLop;
    }

    /**
     * @param tenLop the tenLop to set
     */
    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    @Override
    public String toString() {
        return idLop;
    }

       
}
