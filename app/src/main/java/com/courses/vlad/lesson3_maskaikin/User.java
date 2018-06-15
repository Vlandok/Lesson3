package com.courses.vlad.lesson3_maskaikin;

public class User {
    public String name;
    public String surname;
    public String email;
    public String login;
    public String region;
    public long numberCard;
    public String status;

    User(String name, String surname, String email, String login, String region, String numberCard, String status) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.login = login;
        this.region = region;
        this.numberCard = Long.parseLong(numberCard);
        this.status = status;
    }
}
