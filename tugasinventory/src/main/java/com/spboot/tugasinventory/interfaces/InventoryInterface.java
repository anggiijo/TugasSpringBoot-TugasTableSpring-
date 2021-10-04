/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spboot.tugasinventory.interfaces;

import com.spboot.tugasinventory.models.Inventory;
import java.util.List;

/**
 *
 * @author Anggi Johanes
 */

    


public interface InventoryInterface {
    List<Inventory> getAll();
    void store(Inventory inventory);
    Inventory getById(long id);
    void delete(long id);
}
