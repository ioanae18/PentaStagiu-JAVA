package com.pentalog.pentastagiu;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class User{
    String fname;
    String lname;
    Date birthDate;

    DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
    void setBirthDate(String dateformat) {
        String strDate2 = "18-01-1997 19:06:45";
        try {
            Date newdate = df.parse(strDate2);
            System.out.println(newdate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public User(String fname, String lname, Date birthDate) {
        this.fname = fname;
        this.lname = lname;
        setBirthDate(birthDate);
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public DateFormat getDf() {
        return df;
    }

    public void setDf(DateFormat df) {
        this.df = df;
    }

    public String getFullName(){
        return this.getFname() + " " + this.getLname();
    }
}
