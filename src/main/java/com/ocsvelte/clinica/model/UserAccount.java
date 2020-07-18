package com.ocsvelte.clinica.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class UserAccount {

    @Id
    @Column(name = "user_id", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

//    @OneToMany(mappedBy = "userAccount")
//    private List<StudySubject> studySubjectList;
}
