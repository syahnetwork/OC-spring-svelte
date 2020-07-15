package com.ocsvelte.clinica.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Subject implements Serializable {

    @Id
    @Column(name = "subject_id", unique = true, nullable = false)
    @GeneratedValue(generator = "id-generator")
    private int subjectId;
}