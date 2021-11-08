/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto_3.Reto3.Interface;

import Reto_3.Reto3.modelo.Reservation;
import org.springframework.data.repository.CrudRepository;

/**
 * Crea el repositorio InterfaceReservation
 * @since 08-11-2021
 * @version 1.0
 * @author Cristian Camilo Cárdenas López
 */
public interface InterfaceReservation extends CrudRepository<Reservation,Integer> {
    
}
