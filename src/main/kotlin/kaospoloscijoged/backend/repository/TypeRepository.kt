package kaospoloscijoged.backend.repository

import kaospoloscijoged.backend.entity.Type
import org.springframework.data.jpa.repository.JpaRepository

interface TypeRepository : JpaRepository<Type, String> {

}