package com.gondev.todolist.repository

import com.gondev.todolist.model.AuthProvider
import com.gondev.todolist.model.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface UserRepository : JpaRepository<User, Long> {

    fun findByEmail(email: String): Optional<User>

    fun existsByEmailAndProvider(email: String, provider: AuthProvider): Boolean

}
