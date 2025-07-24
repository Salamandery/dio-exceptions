package br.com.dio.model;

import java.time.LocalDate;
import java.util.Objects;

public class UserModel {
    private long id;
    private String name;
    private String email; 
    private LocalDate birthday;


    public UserModel() {
    }

    public UserModel(long id, String name, String email, LocalDate birthday) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.birthday = birthday;
    }


    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthday() {
        return this.birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserModel userModel)) return false;
        return this.id == userModel.id && 
        Objects.equals(this.name, userModel.name) && 
        Objects.equals(this.email, userModel.email) && 
        Objects.equals(this.birthday, userModel.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name, this.email, this.birthday);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", email='" + getEmail() + "'" +
            ", birthday='" + getBirthday() + "'" +
            "}";
    }
}

    
