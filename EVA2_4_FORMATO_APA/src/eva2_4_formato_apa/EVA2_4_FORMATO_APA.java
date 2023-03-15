/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_4_formato_apa;

/**
 *
 * @author invitado
 */
public class EVA2_4_FORMATO_APA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //HACER FICHA BIBLIOGRAFICA COMO EN WORD
        //SUPERCLASE DOCUMENTO
        //AUTOR TITULO AÑO MES DIA CIUDAD
        
        //AGREGAR 2 ATRIBUTOS DISTINTOS A CADA UNO
        
        //HEREDAR DE DOCUMENTO
        //LIBROS, 
//        ARTICULOS, 
//        INFORME, 
//        SITIO 
//        WEB
        
    Libros libro=new Libros();
        
        libro.setTitulo("Atlas de Mexico");
        libro.setAutor("Carlitos");
        libro.setCiudad("Ciudad de Mexico");
        libro.setAño(1999);
        libro.setMes("Agosto");
        libro.setDia(5);
        libro.setEditorial("SEP");
        libro.setGenero("Educacion");

        
        System.out.println("Libro referencia formato APA");
        System.out.println("Titulo: "+libro.getTitulo());
        System.out.println("Autor: "+libro.getAutor());
        System.out.println("Ciudad: "+libro.getCiudad());
        System.out.println("Año: "+libro.getAño());
        System.out.println("Mes: "+libro.getMes());
        System.out.println("Dia: "+libro.getDia());
        System.out.println("Editorial: "+libro.getEditorial());
        System.out.println("Genero: "+libro.getGenero());
        
        
        
        
    }
    
}
