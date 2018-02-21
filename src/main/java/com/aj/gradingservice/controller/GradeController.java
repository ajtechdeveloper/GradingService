package com.aj.gradingservice.controller;

import com.aj.gradingservice.model.Grade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/")
public class GradeController {

    private static final Logger logger = LoggerFactory.getLogger(GradeController.class);

    @RequestMapping(value = "ping", method = RequestMethod.GET)
	public ResponseEntity<Map<String, String>> ping() {
		Map<String, String> response = new HashMap<>();
		response.put("message", "pong");
        return new ResponseEntity<>(response, HttpStatus.OK);
	}

    @RequestMapping(value = "grades", method = RequestMethod.GET)
    public ResponseEntity<List<Grade>> getGrades() {
        logger.info("In GradeController.getGrades(), fetching list of grades");
        List<Grade> grades = new ArrayList<>();
        grades.add(new Grade(1, "P001", "A+"));
        grades.add(new Grade(2, "C001", "A"));
        grades.add(new Grade(3, "M001", "B+"));
        return new ResponseEntity<>(grades, HttpStatus.OK);
    }
}
