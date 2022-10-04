package kaospoloscijoged.backend.repository

import kaospoloscijoged.backend.entity.Color
import org.springframework.data.jpa.repository.JpaRepository

interface ColorRepository : JpaRepository<Color, String> {
}