/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author Antonio Junior
 */
public class MaxDaysOfMounth {

    public class MaxDays extends RuntimeException {
    
        public MaxDays(String errorMessage, Throwable err) 
        {
        super(errorMessage, err);
        }
}
}
