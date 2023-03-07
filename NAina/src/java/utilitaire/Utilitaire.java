/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitaire;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author rakot
 */
public class Utilitaire {
    public String[] spliteur(HttpServletRequest req){
        String url=req.getPathInfo();
        String[] rep=url.split("/");
        
        return rep;
    }
}
