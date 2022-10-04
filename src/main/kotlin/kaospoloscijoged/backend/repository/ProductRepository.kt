package kaospoloscijoged.backend.repository

import kaospoloscijoged.backend.entity.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository : JpaRepository<Product, String> {
}