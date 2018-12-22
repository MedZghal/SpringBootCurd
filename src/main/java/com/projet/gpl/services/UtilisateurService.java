/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projet.gpl.services;

import com.projet.gpl.entites.Utilisateur;
import com.projet.gpl.metier.UtilisateurMetier;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ProSYS
 */
@RestController
public class UtilisateurService {
    
    @Autowired
    public UtilisateurMetier metier;
    
    @GetMapping("/GetListUtilisateurs")
    public List<Utilisateur> GetListUtilisateurs() {
        return  metier.GetListUtilisateurs();
    }
    
}
