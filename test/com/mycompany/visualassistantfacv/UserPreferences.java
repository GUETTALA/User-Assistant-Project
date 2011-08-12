/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.visualassistantfacv;

/**
 *
 * @author Abdelheq
 */
public class UserPreferences {

    private String Description;
    private int Importance;

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public int getImportance() {
        return Importance;
    }

    public void setImportance(int Importance) {
        this.Importance = Importance;
    }

    public UserPreferences clone(){
        UserPreferences result = new UserPreferences();
        result.Description = this.Description;
        result.Importance = this.Importance;

        return result;
    }

}
