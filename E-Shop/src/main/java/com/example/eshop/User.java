package com.example.eshop;

public class User {
    private final int user_id;
    private final String first_name;
    private final String last_name;
    private final String email;
    private final String phone_no;

    User(int u_id, String f_name, String l_name, String email, String ph_no){
        user_id = u_id;
        first_name = f_name;
        last_name = l_name;
        this.email = email;
        phone_no = ph_no;
    }

    public int getUser_id(){
        return user_id;
    }
    public String getFirst_name(){
        return first_name;
    }
    public String getLast_name(){
        return last_name;
    }
    public String getEmail(){
        return email;
    }
    public String getPhone_no(){
        return phone_no;
    }
}
