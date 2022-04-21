/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ASUS RG
 */
public class SinhVien {
    
    private int id;
    private String name;
    private String genDer;
    private String email;
    private String birthDay;
    private String idClass;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the genDer
     */
    public String getGenDer() {
        return genDer;
    }

    /**
     * @param genDer the genDer to set
     */
    public void setGenDer(String genDer) {
        this.genDer = genDer;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the birthDay
     */
    public String getBirthDay() {
        return birthDay;
    }

    /**
     * @param birthDay the birthDay to set
     */
    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    /**
     * @return the idClass
     */
    public String getIdClass() {
        return idClass;
    }

    /**
     * @param idClass the idClass to set
     */
    public void setIdClass(String idClass) {
        this.idClass = idClass;
    }

    public SinhVien(int id, String name, String genDer, String email, String birthDay, String idClass) {
        this.id = id;
        this.name = name;
        this.genDer = genDer;
        this.email = email;
        this.birthDay = birthDay;
        this.idClass = idClass;
    }
    
    public SinhVien() {
    }

}
