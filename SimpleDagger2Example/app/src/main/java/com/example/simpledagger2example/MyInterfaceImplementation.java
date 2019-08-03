/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.example.simpledagger2example;

import java.util.Date;


/*
 *Chandra Dhakite
 * This class is not singleton - to check dagger functionality
 * and has implememted the getDate method
 * */
public class MyInterfaceImplementation implements MyInterface {

    private long date;

    public MyInterfaceImplementation() {
        this.date = new Date().getTime();
    }


    @Override
    public long getDate() {
        return date;
    }


}
