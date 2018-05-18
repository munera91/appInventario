/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.Appinventario.Controller;


import co.com.poli.Appinventario.Business.IProductoBusiness;
import co.com.poli.Appinventario.Model.Producto;
import co.com.poli.Appinventario.Path.Path.PathProducto;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author sala305
 */
@RestController
@RequestMapping(value = "/")
public class ProductoController {

    @Autowired
    private IProductoBusiness productoBusiness;

    @GetMapping(PathProducto.PRODUCTO)
    public List<Producto> obtenerProductos(HttpServletResponse hsr) {
        return productoBusiness.obtenerProductos();
    }
    
    @GetMapping(PathProducto.PRODUCTO_COD)
    public Producto obtenerProducto (@PathVariable String codigo, 
            HttpServletResponse hsr){
        return productoBusiness.obtenerProducto(codigo);
    }
    
    @PostMapping(PathProducto.PRODUCTO)
    public String crearProducto (@RequestBody Producto producto,
            HttpServletResponse hsr){
        return productoBusiness.crearProducto(producto);
    }
    
    @PutMapping(PathProducto.PRODUCTO)
    public String modificarProducto(@RequestBody Producto producto,
            HttpServletResponse hsr){
        return productoBusiness.modificarProducto(producto);
    }
    
    @DeleteMapping(PathProducto.PRODUCTO)
    public String eliminarProducto(@RequestBody Producto producto,
            HttpServletResponse hsr){
        return productoBusiness.eliminarProducto(producto.getCodigo());
    }
}
