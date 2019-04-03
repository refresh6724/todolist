package com.gondev.todolist.repository

import com.gondev.todolist.model.TodoEntity
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TodoRepository: JpaRepository<TodoEntity, Long> {
    fun findAllByUserId(pageable: Pageable, userId: Long): Page<TodoEntity>

    fun findByIdAndUserId(id: Long, userId: Long): TodoEntity?

    fun deleteByUserId(userId: Long)
}