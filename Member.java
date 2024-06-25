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
public class Member extends Person{
    static int id;
    String startdate,period;
    int weight,height;
    boolean spa,box,steam;

    public Member(String startdate, String period, int weight, int height, boolean spa, boolean box, boolean steam, String name, String phoneNum, String gender) {
        super(name, phoneNum, gender);
        this.startdate = startdate;
        this.period = period;
        this.weight = weight;
        this.height = height;
        this.spa = spa;
        this.box = box;
        this.steam = steam;
        id++;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Member.id = id;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean isSpa() {
        return spa;
    }

    public void setSpa(boolean spa) {
        this.spa = spa;
    }

    public boolean isBox() {
        return box;
    }

    public void setBox(boolean box) {
        this.box = box;
    }

    public boolean isSteam() {
        return steam;
    }

    public void setSteam(boolean steam) {
        this.steam = steam;
    }
      public void addMember() {
        String filePath = "members.txt";
        try {
            try (FileWriter writer = new FileWriter(filePath, true)) {
                writer.write("\n");
                writer.write(name);
                writer.write(",");
                writer.write(phoneNum);
                writer.write(",");
                writer.write(startdate);
                writer.write(",");
                writer.write(gender);
                writer.write(",");
                writer.write(period);
                writer.write(",");
                writer.write(Integer.toString(weight));
                writer.write(",");
                writer.write(Integer.toString(height));
                writer.write(",");
                writer.write(Boolean.toString(spa));
                writer.write(",");
                writer.write(Boolean.toString(steam));
                writer.write(",");
                writer.write(Boolean.toString(box));
                writer.write(",");
                writer.write(Integer.toString(id));
                
            }


        } catch (Exception e) {
            System.out.println(e);
        }

    }
    
    
}
