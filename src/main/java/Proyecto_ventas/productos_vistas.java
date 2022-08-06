/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Proyecto_ventas;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class productos_vistas {
    JPanel productos = new JPanel();
    JTable tabla = new JTable();
    JScrollPane sp = new JScrollPane();
    
    
    private void botones(){
    
        productos.setLayout(null);
        JButton crear = new JButton("Crear");
        crear.setBounds(500, 100, 130, 50);
        productos.add(crear);
        
        JButton carga = new JButton("Carga Masiva");
        carga.setBounds(670, 100, 130, 50);
        productos.add(carga);
        
        JButton actualizar = new JButton("Actualizar");
        actualizar.setBounds(500, 250, 130, 50);
        productos.add(actualizar);
        
        JButton eliminar = new JButton("Eliminar");
        eliminar.setBounds(670, 250, 130, 50);
        productos.add(eliminar);
        
        JButton exportar = new JButton("Exportar PDF");
        exportar.setBounds(500, 400, 300, 50);
        productos.add(exportar);
        
    
    
    }
    
    private void tabla(){
        
        String columnas []= {"Código","Producto","Proveedor","Stock","Fecha de Vecimiento"};
        Object filas [][]={{"2020","Gallo Pinto","Pio Lindo","150","20/08/2022"}};
        tabla = new JTable(filas,columnas);
        sp = new JScrollPane(tabla);
        sp.setBounds(10, 20, 430, 600);
        productos.add(sp);
        
    
    
    }
    
    public void ejecutar(){
    botones();
    tabla();
    }
    
}
