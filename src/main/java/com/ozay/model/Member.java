package com.ozay.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.ozay.domain.User;
import com.ozay.domain.util.CustomDateTimeDeserializer;
import com.ozay.domain.util.CustomDateTimeSerializer;
import org.joda.time.DateTime;

import java.sql.Date;
import java.util.Set;

public class Member {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String login;
    private Integer buildingId;
    private Long userId;
    private Double ownership;
    private boolean renter;
    private String parking;
    private String unit;
    private DateTime expirationDate;
    private boolean deleted;

    private Set<Role> roles;


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Integer getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(Integer buildingId) {
        this.buildingId = buildingId;
    }

    public Double getOwnership() {
        return ownership;
    }

    public void setOwnership(Double ownership) {
        this.ownership = ownership;
    }

    public boolean isRenter() {
        return renter;
    }

    public void setRenter(boolean renter) {
        this.renter = renter;
    }

    public String getParking() {
        return parking;
    }

    public void setParking(String parking) {
        this.parking = parking;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public DateTime getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(DateTime expirationDate) {
        this.expirationDate = expirationDate;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "Member{" +
            "id='" + id + '\'' +
            "login='" + login + '\'' +
            ", firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", email='" + email + '\'' +
            ", user_id='" + userId + '\'' +
            "}";
    }
}
