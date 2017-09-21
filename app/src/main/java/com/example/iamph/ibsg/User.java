package com.example.iamph.ibsg;

/**
 * Created by iamph on 21/09/2017.
 */

public class User {
    private static final User INSTANCE = new User();
    public String religion = "";
    public float knowledge = 0;
    public float interest = 0;
    private User() {}

    public static User getInstance() {
        return INSTANCE;
    }

}
