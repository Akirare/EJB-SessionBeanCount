/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cusc;

import javax.ejb.Stateless;

/**
 *
 * @author ASUS
 */
@Stateless
public class SessionBeanCount implements SessionBeanCountLocal {
    int count = 0;
    @Override
    public int Increase() {
      
        count++;
        return count;
    }

    public int Decrease()
    {
        count--;
        return count;
    }
}
