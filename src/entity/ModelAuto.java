/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Lenovo
 */
public class ModelAuto {
    private Long id;
    private String model;
    private String engine;//двигатель
    private String bodyType;//тип кузова
    private String drive;//ведущий мост
    private String transmission;//коробка
    private String fuel;

    public ModelAuto() {
    }

    public ModelAuto(String model, String engine, String bodyType, String drive, String transmission, String fuel) {
        this.model = model;
        this.engine = engine;
        this.bodyType = bodyType;
        this.drive = drive;
        this.transmission = transmission;
        this.fuel = fuel;
    }

    
    

    public Long getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getEngine() {
        return engine;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getDrive() {
        return drive;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getFuel() {
        return fuel;
    }
    

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public void setDrive(String drive) {
        this.drive = drive;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return "ModelAuto{" + "model=" + model + ", engine=" + engine + ", bodyType=" + bodyType + ", drive=" + drive + ", transmission=" + transmission + ", fuel=" + fuel + '}';
    }
    

}
