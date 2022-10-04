package kaospoloscijoged.backend.repository

import kaospoloscijoged.backend.entity.Stock
import org.springframework.data.jpa.repository.JpaRepository

interface StockRepository : JpaRepository<Stock, String> {

}