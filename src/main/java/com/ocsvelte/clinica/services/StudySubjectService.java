package com.ocsvelte.clinica.services;

import com.ocsvelte.clinica.model.StudySubject;
import com.ocsvelte.clinica.repository.StudySubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudySubjectService implements IStudySubject {

    StudySubjectRepository studySubjectRepository;

    @Autowired
    public StudySubjectService(StudySubjectRepository studySubjectRepository) {
        this.studySubjectRepository = studySubjectRepository;
    }

    @Override
    public List<StudySubject> getAllStudySubjects() {
        return studySubjectRepository.findAll();
    }

    @Override
    public Optional<StudySubject> findById(int studySubjectId) {
        return studySubjectRepository.findById(studySubjectId);
    }

    @Override
    public StudySubject save(StudySubject studySubject) {
        return studySubjectRepository.save(studySubject);
    }

    @Override
    public void deleteById(int studySubjectId) {
        studySubjectRepository.deleteById(studySubjectId);
    }
}
