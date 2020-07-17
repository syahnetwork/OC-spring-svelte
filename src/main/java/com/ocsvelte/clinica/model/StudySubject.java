package com.ocsvelte.clinica.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "study_subject")
@GenericGenerator(name = "id-generator", strategy = "native", parameters = {@Parameter(name = "sequence_name", value = "study_subject_study_subject_id_seq")})
@Getter
@Setter
@EnableJpaRepositories
@NoArgsConstructor
@AllArgsConstructor
public class StudySubject {

    @Id
    @Column(name = "study_subject_id", unique = true, nullable = false)
    @GeneratedValue(generator = "id_generator")
    private int studySubjectId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id")
    private UserAccount userAccount;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "study_id")
    private Study study;

//    @Type(type = "status")
//    @Column(name = "status_id")
//    private Status status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subject_id")
    private Subject subject;

    private String label;
    private String secondaryLabel;
    private Date enrollmentDate;
    private Date dateCreated;
    private Date dateUpdated;
    private Integer updateId;
    private String ocOid;


}
