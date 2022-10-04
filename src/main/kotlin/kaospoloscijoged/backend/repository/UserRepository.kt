package kaospoloscijoged.backend.repository

import kaospoloscijoged.backend.entity.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, String> {

}