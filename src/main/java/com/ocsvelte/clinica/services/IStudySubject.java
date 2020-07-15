package com.ocsvelte.clinica.services;

import com.ocsvelte.clinica.model.StudySubject;

import java.util.List;
import java.util.Optional;

public interface IStudySubject {

    List<StudySubject> getAllStudySubjects();

    Optional<StudySubject> findById(int studySubjectId);

    StudySubject save(StudySubject studySubject);

    void deleteById(int studySubjectId);
}
