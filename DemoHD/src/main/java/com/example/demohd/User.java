package com.example.demohd;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Optional;

@Entity
public class User implements UserRepository {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String emailAdress;
    private String password;
    private boolean admin;

    public User() {}
    public User(String name, String emailAdress) {
        this.name = name;
        this.emailAdress = emailAdress;
    }
    public User(String name, String emailAdress, String password, boolean admin) {
        this.name = name;
        this.emailAdress = emailAdress;
        this.password = password;
        this.admin = admin;
    }


    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }
    public String getEmailAdress() {
        return emailAdress;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
    public boolean isAdmin() {
        return admin;
    }

    @Override
    public String toString() {
        return "User{" +
                //"id=" + id +
                "   name='" + name + '\'' +
                ", emailAdress='" + emailAdress + '\'' +
                ", password='" + password + '\'' +
                ", admin=" + admin +
                '}';
    }

    @Override
    public <S extends User> S save(S entity) {
        return null;
    }

    @Override
    public <S extends User> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<User> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<User> findAll() {
        return null;
    }

    @Override
    public Iterable<User> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(User entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends User> entities) {

    }

    @Override
    public void deleteAll() {

    }
}