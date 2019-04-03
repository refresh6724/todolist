package com.gondev.todolist.repository

import com.gondev.todolist.model.Question
import com.gondev.todolist.model.Survey
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface QuestionRepository:JpaRepository<Question, Long> {
    fun countBySurvey(survey: Survey): Int
}