/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package in.plam.ajm;

import java.util.Calendar;

/**
 *
 * @author udumbara
 */
public class Sunday {
    
    public Integer calcSunday(){
        
        Calendar startDate = Calendar.getInstance();
        startDate.set(1901, Calendar.JANUARY, 1);
        Calendar endDate = Calendar.getInstance();
        endDate.set(2000, Calendar.DECEMBER, 31);
        
        int sundayCounter = 0;
        
        while(startDate.before(endDate)){

            if((startDate.get(Calendar.DATE) == 1) && (startDate.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) ){
                sundayCounter+=1;
            }

            startDate.add(Calendar.DATE, 1);
        }
        
        return sundayCounter;
    }
}
