package com.asseco.pst.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "user")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class User extends PersistentObject<Long> {

    private static final long serialVersionUID = -2480887313595383597L;

    @Column
    private String name;

    @Column
    private String age;
}
