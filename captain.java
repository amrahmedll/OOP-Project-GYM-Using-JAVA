/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gymapp;

import java.io.FileWriter;

/**
 *
 * @author EGYPT
 */
public class captain extends Person {
    String password;

    public captain(String password, String name, String phoneNum, String gender) {
        super(name, phoneNum, gender);
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    public void addCaptain() {
        String filePath = "captains.txt";
        try {
            FileWriter writer = new FileWriter(filePath, true);
            writer.write("\n");
            writer.write(name);
            writer.write(",");
            writer.write(phoneNum);
            writer.write(",");
            writer.write(password);
            writer.write(",");
            writer.write(gender);
            writer.close();



        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
