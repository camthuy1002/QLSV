/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ASUS RG
 */
public class Admin {
    
    
    private int idAdmin;
    private String userName;
    private String passWord;

    public Admin() {
    }

    public Admin(int idAdmin, String userName, String passWord) {
        this.idAdmin = idAdmin;
        this.userName = userName;
        this.passWord = passWord;
    }
    
      
    /**
     * @return the idAdmin
     */
    public int getIdAdmin() {
        return idAdmin;
    }

    /**
     * @param idAdmin the idAdmin to set
     */
    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the passWord
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     * @param passWord the passWord to set
     */
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    
}
