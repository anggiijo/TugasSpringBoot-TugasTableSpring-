/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spboot.tugasinventory.repositories;

import com.spboot.tugasinventory.models.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



/**
 *
 * @author Sendy.dr
 */

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    
}
