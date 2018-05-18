/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.Appinventario.DAO;


import co.com.poli.Appinventario.Model.Producto;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface IProductoDao {
    
    List<Producto> obtenerProductos();
    Producto obtenerProducto(String codigo);
    String crearProducto(Producto producto);
    String eliminarProducto(String codigo);
    String modificarProducto(Producto producto);
    
}
