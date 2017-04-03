package geocity;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shoaib
 */
public class City {
     private  int lat, lon; 
 

 private  int id; 
 private String Code; 
 private String Countryname; 
 private int Region; 
 
 public City() {} ;
    
 


    public void setLat(int lat) {
        this.lat = lat;
    }

    public void setLon(int lon) {
        this.lon = lon;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    public void setCountryname(String Countryname) {
        this.Countryname = Countryname;
    }

    public void setRegion(int Region) {
        this.Region = Region;
    }
    
 
    
  
 public int getId() { 
  return id; 
 } 
 
 public int getLat() { 
  return lat; 
 } 
 
 public int getLon() { 
  return lon; 
 } 
 
 public String getCountryCode() { 
  return Code; 
 } 
 
 public String getName() { 
  return Countryname; 
 } 
 
 public int getPopulation() { 
  return Region; 
 } 
}
    

