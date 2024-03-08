package com.educandoweb.course.entities;

import java.io.Serializable;

public class User implements Serializable{
private Long id;
private String nome;
private String email;
private String phone;
private String password;


public User(Long id, String nome, String email, String phone, String password) {
    this.id = id;
    this.nome = nome;
    this.email = email;
    this.phone = phone;
    this.password = password;
}
public Long getId() {
    return id;
}
public void setId(Long id) {
    this.id = id;
}
public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
public String getEmail() {
    return email;
}
public void setEmail(String email) {
    this.email = email;
}
public String getPhone() {
    return phone;
}
public void setPhone(String phone) {
    this.phone = phone;
}
public String getPassword() {
    return password;
}
public void setPassword(String password) {
    this.password = password;
}


}
