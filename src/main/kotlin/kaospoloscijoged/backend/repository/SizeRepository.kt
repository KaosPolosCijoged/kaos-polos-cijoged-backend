package kaospoloscijoged.backend.repository

import kaospoloscijoged.backend.entity.Size
import org.springframework.data.jpa.repository.JpaRepository

interface SizeRepository : JpaRepository<Size, String> {

}