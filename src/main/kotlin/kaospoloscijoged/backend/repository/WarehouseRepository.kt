package kaospoloscijoged.backend.repository

import kaospoloscijoged.backend.entity.Warehouse
import org.springframework.data.jpa.repository.JpaRepository

interface WarehouseRepository : JpaRepository<Warehouse, String> {

}