package com.mycompany.proyecto1.Repositorys;

import com.mycompany.proyecto1.Productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductoRepo extends JpaRepository<Productos, Object> {
}
