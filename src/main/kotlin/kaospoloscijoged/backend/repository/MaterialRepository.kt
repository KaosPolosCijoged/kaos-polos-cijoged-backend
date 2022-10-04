package kaospoloscijoged.backend.repository

import kaospoloscijoged.backend.entity.Material
import org.springframework.data.jpa.repository.JpaRepository

interface MaterialRepository : JpaRepository<Material, String> {
}