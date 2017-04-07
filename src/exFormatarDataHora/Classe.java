/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exFormatarDataHora;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Jonathas
 */
public class Classe {
    private static final DateFormat dia_Hora = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); //para dia e hora
    private static final DateFormat hora = new SimpleDateFormat("HH:mm:ss"); //somente hora
   
    public static void main(String[] args) {
        
        Date date = new Date();
        System.out.println(dia_Hora.format(date));
        //ou...
        Calendar cal = Calendar.getInstance();
        System.out.println(hora.format(cal.getTime()));
                
    }    
}
