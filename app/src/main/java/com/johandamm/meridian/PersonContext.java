package com.johandamm.meridian;


/**
 * Created by Otto on 20-04-2015.
 */
public class PersonContext {
    public String UserName,Name,PhoneNumber,Team;
    public PersonContext(String userName,String name,String phoneNumber,String team)
    {
        this.UserName = userName;
        this.Name = name;
        this.PhoneNumber = phoneNumber;
        this.Team = team;
    }
    public PersonContext()
    {

    }
}
