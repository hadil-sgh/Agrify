/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agrify.entities;

/**
 *
 * @author Hadil sghair
 */
public class Healh {
    private int healthid;
      private String animalId;
    private String typeDeMaladie;
    private String medicament;
    private String typeDeTraitement;
    private String dosage;

    public Healh(int healthid, String animalId, String typeDeMaladie, String medicament, String typeDeTraitement, String dosage) {
        this.healthid = healthid;
        this.animalId = animalId;
        this.typeDeMaladie = typeDeMaladie;
        this.medicament = medicament;
        this.typeDeTraitement = typeDeTraitement;
        this.dosage = dosage;
    }

    public Healh(String animalId, String typeDeMaladie, String medicament, String typeDeTraitement, String dosage) {
        this.animalId = animalId;
        this.typeDeMaladie = typeDeMaladie;
        this.medicament = medicament;
        this.typeDeTraitement = typeDeTraitement;
        this.dosage = dosage;
    }

    public Healh() {
    }

    public int getHealthid() {
        return healthid;
    }

    public void setHealthid(int healthid) {
        this.healthid = healthid;
    }

    public String getAnimalId() {
        return animalId;
    }

    public void setAnimalId(String animalId) {
        this.animalId = animalId;
    }

    public String getTypeDeMaladie() {
        return typeDeMaladie;
    }

    public void setTypeDeMaladie(String typeDeMaladie) {
        this.typeDeMaladie = typeDeMaladie;
    }

    public String getMedicament() {
        return medicament;
    }

    public void setMedicament(String medicament) {
        this.medicament = medicament;
    }

    public String getTypeDeTraitement() {
        return typeDeTraitement;
    }

    public void setTypeDeTraitement(String typeDeTraitement) {
        this.typeDeTraitement = typeDeTraitement;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    @Override
    public String toString() {
        return "Healh{" + "healthid=" + healthid + ", animalId=" + animalId + ", typeDeMaladie=" + typeDeMaladie + ", medicament=" + medicament + ", typeDeTraitement=" + typeDeTraitement + ", dosage=" + dosage + '}';
    }

   
    
    
}
