/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author tobir
 */
public class IncorrectDate {
        public class IncorrectDateFormate extends RuntimeException {
    
        public IncorrectDateFormate(String errorMessage, Throwable err) 
        {
        super(errorMessage, err);
        }
    }
}