/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.test;

import ma.projet.classes.Projet;
import ma.projet.classes.Tache;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import ma.projet.classes.Employe;
import ma.projet.classes.EmployeTache;
import ma.projet.services.EmployeService;
import ma.projet.services.EmployeTacheService;
import ma.projet.services.ProjetService;
import ma.projet.services.TacheService;

/**
 *
 * @author hp
 */
public class Test {
    public static void main(String[] args)throws ParseException {
        EmployeService es = new EmployeService();
        ProjetService ps = new ProjetService();
        TacheService ts = new TacheService();
        EmployeTacheService ets = new EmployeTacheService();   
        // employer ajouter
       //  es.create(new Employe("wafaa","kouach","0767254386"));
         //es.create(new Employe("samya","kouame ","0639876545"));
         //es.create(new Employe("asmaa","mamaa","0641234456"));
         //es.create(new Employe("adil","Zakaria","0687657823"));
       // es.create(new Employe("marwa","lamiaa","0127657823"));
     
         //projet ajoutser
        // ps.create(new Projet("Projet1", new Date(1950,3,18), new Date(2000,8,17), es.getById(1)));
         //ps.create(new Projet("Projet2", new Date(1960,4,13), new Date(2010,10,12), es.getById(2)));
        // ps.create(new Projet("Projet3", new Date(1970,4,11), new Date(2020,9,27), es.getById(3)));
        // ps.create(new Projet("Projet4", new Date(1980,7,24), new Date(2030,11,13), es.getById(4)));
        // ps.create(new Projet("Projet5", new Date(1990,8,28), new Date(2040,9,10), es.getById(5)));
//           
         //tache creer 
          // ts.create(new Tache("Tache1", new Date(122,3,20), new Date(122,6,20),5000 ,ps.getById(1)));
//           ts.create(new Tache("Tache2", new Date(2000,3,20), new Date(2040,6,20),5000 ,ps.getById(2)));
//           ts.create(new Tache("Tache3", new Date(2010,3,20), new Date(2050,6,20),5000 ,ps.getById(3)));
//           ts.create(new Tache("Tache4", new Date(2020,3,20), new Date(2060,6,20),5000 ,ps.getById(4)));
//           ts.create(new Tache("Tache5", new Date(2030,3,20), new Date(2070,6,20),5000 ,ps.getById(5)));

        // des taches des employesTache
        
            ets.create(new EmployeTache(new Date(122,3,22), new Date(122,6,19), es.getById(1), ts.getById(1)));
        
        
         
        
        
}
}
