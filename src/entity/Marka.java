/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.List;

/**
 *
 * @author Lenovo
 */
public class Marka {
    private Long id;
    private String markaName;
    private List<ModelAuto> model;

    public Marka() {
    }

    public Marka(String markaName, List<ModelAuto> model) {
        this.markaName = markaName;
        this.model = model;
    }
    
    public Long getId() {
        return id;
    }

    public String getMarkaName() {
        return markaName;
    }

    public List<ModelAuto> getModel() {
        return model;
    }

    public void setMarkaName(String markaName) {
        this.markaName = markaName;
    }

    public void setModel(List<ModelAuto> model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Marka{" + "markaName=" + markaName + ", model=" + model + '}';
    }
    
}
