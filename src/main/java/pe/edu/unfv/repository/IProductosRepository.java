package pe.edu.unfv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.unfv.model.ProductosModel;

public interface IProductosRepository extends JpaRepository<ProductosModel, Integer>{	

}