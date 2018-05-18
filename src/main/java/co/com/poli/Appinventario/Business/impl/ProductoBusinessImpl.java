/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.Appinventario.Business.impl;


import co.com.poli.Appinventario.DAO.IProductoDao;
import co.com.poli.Appinventario.Model.Producto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.com.poli.Appinventario.Business.IProductoBusiness;


/**
 *
 * @author sala305
 */
@Service
public class ProductoBusinessImpl implements IProductoBusiness{

    @Autowired
    private IProductoDao productodaoDao;
 

    @Override
    public Producto obtenerProducto(String documento) {
        return productodaoDao.obtenerProducto(documento);
    }

    @Override
    public String crearProducto(Producto producto) {
        return productodaoDao.crearProducto(producto);
    }

    @Override
    public String eliminarProducto(String documento) {
        return productodaoDao.eliminarProducto(documento);
    }

    @Override
    public String modificarProducto(Producto producto) {
        return productodaoDao.modificarProducto(producto);
    }

    @Override
    public List<Producto> obtenerProductos() {
        return productodaoDao.obtenerProductos();
    }
    
}
