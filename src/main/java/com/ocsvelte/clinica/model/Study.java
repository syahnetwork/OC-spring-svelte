package com.ocsvelte.clinica.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Study {

    @Id
    @GeneratedValue(generator = "study-id-generator", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "study-id-generator", sequenceName = "public.study_study_id_seq", initialValue = 1, allocationSize = 1)
    @Column(name = "study_id", unique = true, nullable = false)
    private int studyId;
}
