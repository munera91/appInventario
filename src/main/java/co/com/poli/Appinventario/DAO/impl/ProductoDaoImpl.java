/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.Appinventario.DAO.impl;


import co.com.poli.Appinventario.DAO.IProductoDao;
import co.com.poli.Appinventario.Data.ProductoData;
import co.com.poli.Appinventario.Model.Producto;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sala305
 */
@Repository
public class ProductoDaoImpl implements IProductoDao {

    @Override
    public List<Producto> obtenerProductos() {
         System.out.println("Entro DAo");
        return ProductoData.getListaProducto();
    }

    @Override
    public Producto obtenerProducto(String documento) {
        Producto producto = new Producto();
        List<Producto> listado = ProductoData.getListaProducto();
        for (Producto prod : listado) {
            producto = prod;
        }
        return producto;
    }

    @Override
    public String crearProducto(Producto producto) {
        String respuesta = "Producto ya existe";
        List<Producto> listado = ProductoData.getListaProducto();
        Double valorEnvio = 0.0;
        if (!listado.contains(producto)) {            
            listado.add(producto);
            ProductoData.setListaProducto(listado);
            respuesta = "Producto registrado";
        }
        return respuesta;
    }


    @Override
    public String eliminarProducto(String codigo) {
        String respuesta = "Producto eliminado";
        List<Producto> listado = ProductoData.getListaProducto();
        Producto producto = new Producto(codigo, "", 0.0);
        listado.remove(producto);
        ProductoData.setListaProducto(listado);
        return respuesta;
    }

    @Override
    public String modificarProducto(Producto producto) {
        String respuesta = "Producto actualizado";
        List<Producto> listado = ProductoData.getListaProducto();
        listado.set(listado.indexOf(producto), producto);
        ProductoData.setListaProducto(listado);
        return respuesta;
    }

}
