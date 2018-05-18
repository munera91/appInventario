/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.Appinventario.Data;

import co.com.poli.Appinventario.Model.Producto;
import java.util.ArrayList;


import java.util.List;

/**
 *
 * @author Usuario
 */
public class ProductoData {
    
    private static ArrayList<Producto> listaProductos;
    
    static {
        listaProductos = new ArrayList<Producto>() {
            {
                add(new Producto("123", "Licuadora", 2.0));
                add(new Producto("1234", "Televisor", 4.0));
                add(new Producto("1235", "Lavadora", 2.0));
            }  
        };
    }
    
    public static List<Producto> getListaProducto(){
        return listaProductos;
    }
    
    public static void setListaProducto (List<Producto> listaProducto){
        ProductoData.listaProductos = listaProductos;
    }
    
}
