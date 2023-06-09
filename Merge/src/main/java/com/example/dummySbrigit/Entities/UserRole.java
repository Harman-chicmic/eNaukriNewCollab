package com.example.dummySbrigit.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name="userRoles")
public class UserRole {
    @Id
    @GeneratedValue
    int id;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "roleId")
    Roles roleId;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "userId")
    User userId;
    private boolean deleted;
//    private boolean status;


}