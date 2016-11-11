/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automailmdom;


import entity.Auto;
import entity.Marka;
import entity.ModelAuto;
import entity.User;
import java.util.ArrayList;

/**
 *
 * @author Diana
 */
public class AutomailmDom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ModelAuto modelAuto1 = new ModelAuto("A3", "1.2 TFSI AT", "хэтчбек", "передний", "автомат","бензин");
        ModelAuto modelAuto2 = new ModelAuto("A6", "2.4 MT", "универсал", "передний", "механика","бензин");
        ModelAuto modelAuto3 = new ModelAuto("Patrol", "5.6 AT", "внедорожник", "полный", "автомат","бензин");
        
        Marka marka = new Marka("Audi", new ArrayList<ModelAuto>());
        marka.getModel().add(modelAuto1);
        marka.getModel().add(modelAuto2);
        Marka marka1 = new Marka("Nissan", new ArrayList<ModelAuto>());
        marka1.getModel().add(modelAuto3);

        User user = new User("Fjedja", "Zaitsev", "fediazai@gmail.com", "ZA123", null);
        User user1 = new User("Gena", "Zuevv", "zuev@gmail.com", "Zu123", "567894326");
        Auto auto = new Auto(modelAuto1,null, 165000, "WAUZZZ4G9DN106848", "677BSK", "black", user);
        Auto auto2 = new Auto(modelAuto3,null, 165000, "WAUZZZ4G9DN106848", "677BSK", "black", user);
        System.out.println(marka.getMarkaName());
        for (ModelAuto modelAuto : marka.getModel()) {
            System.out.println(modelAuto.getModel()+" "+modelAuto.getEngine()+" "+modelAuto.getBodyType());
           
        }
        System.out.println(marka1.getMarkaName());
        for (ModelAuto modelAuto : marka1.getModel()) {
            System.out.println(modelAuto.getModel()+" "+modelAuto.getEngine()+" "+modelAuto.getBodyType());
        }
        System.out.println(auto);
    }
    
}
