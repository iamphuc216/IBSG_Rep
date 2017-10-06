package com.example.iamph.ibsg;

/**
 * Created by iamph on 21/09/2017.
 */

public class User {
    private static final User INSTANCE = new User();
    public String religion = "";
    public float knowledge = 0;
    public float interest = 0;
    public String userType = "";
    public String firstname = "";
    public String lastname = "";
    public String phone = "";
    public String nationality = "";
    private User() {}

    public static User getInstance() {
        return INSTANCE;
    }

}
