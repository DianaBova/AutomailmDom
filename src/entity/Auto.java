/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;



/**
 *
 * @author Lenovo
 */
public class Auto{
    private Long id;
    private ModelAuto modelAuto;
    private Date dateRegistry;//первичная регистрация
    private int mileage;//показ одометра
    private String vincode;
    private String regNomer;
    private String color;    
    private User user;

    public Auto() {
    }

    public Auto(ModelAuto modelAuto, Date dateRegistry, int mileage, String vincode, String regNomer, String color, User user) {
        this.modelAuto = modelAuto;
        this.dateRegistry = dateRegistry;
        this.mileage = mileage;
        this.vincode = vincode;
        this.regNomer = regNomer;
        this.color = color;
        this.user = user;
    }


    public Long getId() {
        return id;
    }

    public Date getDateRegistry() {
        return dateRegistry;
    }


    public int getMileage() {
        return mileage;
    }

    public String getVincode() {
        return vincode;
    }

    public String getRegNomer() {
        return regNomer;
    }

    public String getColor() {
        return color;
    }

    public User getUser() {
        return user;
    }

    public ModelAuto getModelAuto() {
        return modelAuto;
    }
    

    public void setDateRegistry(Date dateRegistry) {
        this.dateRegistry = dateRegistry;
    }


    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void setVincode(String vincode) {
        this.vincode = vincode;
    }

    public void setRegNomer(String regNomer) {
        this.regNomer = regNomer;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setModelAuto(ModelAuto modelAuto) {
        this.modelAuto = modelAuto;
    }

    @Override
    public String toString() {
        return "Auto{" + "dateRegistry=" + dateRegistry + ", mileage=" + mileage + ", vincode=" + vincode + ", regNomer=" + regNomer + ", color=" + color + ", modelAuto=" + modelAuto + ", user=" + user + '}';
    }
    


    
    
    
}
