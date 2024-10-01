package com.campusdual.classroom;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FreshMerchandise extends Merchandise {
    private Date expirationDate;

    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf, int quantity, Date expirationDate){
        super(name, uniqueId, responsibleId, zone, area, shelf, quantity);
        this.expirationDate = expirationDate;
    }

    public String getFormattedDate(Date date){
        // para el formato de fechas de caducidad
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        return dateFormat.format(date);
    }

    public String getSpecificData(){
        // Concatenamos los strings
        String location = "Localización: " + getLocation();
        String caducidad = "Caducidad: " + getFormattedDate(expirationDate);

        return location + caducidad;
    }

    public void printSpecificData(){
        System.out.println(getSpecificData());
    }

    public Date getExpirationDate(){
        return this.expirationDate;
    }

    public void setExpirationDate(Date expirationDate){
        this.expirationDate = expirationDate;
    }
}
