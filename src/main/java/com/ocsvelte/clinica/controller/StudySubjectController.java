package com.ocsvelte.clinica.controller;

import com.ocsvelte.clinica.exception.ResourceNotFoundException;
import com.ocsvelte.clinica.model.Study;
import com.ocsvelte.clinica.model.StudySubject;
import com.ocsvelte.clinica.services.StudySubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/participant")
public class StudySubjectController {

    StudySubjectService studySubjectService;

    @Autowired
    public StudySubjectController(StudySubjectService studySubjectService) {
        this.studySubjectService = studySubjectService;
    }

    @GetMapping(value = "/participant")
    public List<StudySubject> getAllStudySubjects() {
        return studySubjectService.getAllStudySubjects();
    }

    @GetMapping(value = "/participant/{studySubjectId}")
    public StudySubject getStudySubjectId(@PathVariable("studySubjectId") int studySubjectId) {
        StudySubject studySubject = studySubjectService.findById(studySubjectId)
                .orElseThrow(() -> new ResourceNotFoundException("Study subject " + studySubjectId + " not found"));

        return studySubject;
    }

    @PostMapping(value = "/participant")
    public StudySubject addStudySubject(@RequestBody StudySubject studySubject) {
        return studySubjectService.save(studySubject);
    }

    @PutMapping(value = "/participant")
    public StudySubject updateStudySubject(@PathVariable("studySubjectId") int studySubjectId, @RequestBody StudySubject studySubject) {
        StudySubject studySubjectUpdate = studySubjectService.findById(studySubjectId)
                .orElseThrow(() -> new ResourceNotFoundException("Study subject " + studySubjectId + " not found"));

        //need update
        return studySubjectService.save(studySubjectUpdate);
    }

    @DeleteMapping(value = "/participant/{studySubjectId}")
    public String deleteStudySubject(@PathVariable("studySubjectId") int studySubjectId) {
        StudySubject studySubject = studySubjectService.findById(studySubjectId)
                .orElseThrow(() -> new ResourceNotFoundException("Study subject " + studySubjectId + " not found"));

        studySubjectService.deleteById(studySubject.getStudySubjectId());
        return "Study subject with ID = " + studySubjectId + " deleted";
    }


}
