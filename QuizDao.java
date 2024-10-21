package com.telusko.quizapp.dao;

import com.telusko.quizapp.model.Question;
import com.telusko.quizapp.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface QuizDao extends JpaRepository<Quiz,Integer> {


}
