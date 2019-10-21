/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaweb.controller;

import com.javaweb.dto.DiplomadoDTO;
import com.javaweb.dto.EstudianteDTO;
import com.javaweb.dto.UniversidadDTO;
import com.javaweb.entity.Diplomado;
import com.javaweb.entity.Estudiante;
import com.javaweb.entity.Universidad;
import com.javaweb.entity.Vista;
import com.javaweb.interfaces.DiplomadoFacadeLocal;
import com.javaweb.interfaces.EstudianteFacadeLocal;
import com.javaweb.interfaces.UniversidadFacadeLocal;
import com.javaweb.interfaces.VistaFacadeLocal;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.model.SelectItem;
import org.primefaces.model.UploadedFile;

/**
 *
 * @author juan
 */
@Named(value = "universidadController")
@SessionScoped
public class universidadController implements Serializable {

    @EJB
    private UniversidadFacadeLocal universidadEJB;
    
    @EJB 
    private DiplomadoFacadeLocal diplomadoEJB;
    
    @EJB
    private EstudianteFacadeLocal estudianteEJB;
    
    @EJB
    private VistaFacadeLocal vistaEJB;
    
    private DiplomadoDTO diplomado;
    private UniversidadDTO universidad;
    private EstudianteDTO estudiante;
    
    private List<SelectItem> dip;
    private List<Vista> listarDatos = new ArrayList<>();
    private int d;
    
    private String direccion;
    private UploadedFile f;

    /**
     *
     */
    public universidadController() {
    }
    
    /**
     *inicializamos todas los DTO objetos para conectarlos con los Entities
     */
    @PostConstruct
    public void init(){
        diplomado = new DiplomadoDTO();
        universidad = new UniversidadDTO();
        estudiante = new EstudianteDTO();
        listarDatos = vistaEJB.findAll();
        
    }
    
    /**
     *metodo para crear todos los objetos en cadena
     * @param u
     * @param d
     * @param e
     */
    public void crearTodos(UniversidadDTO u, DiplomadoDTO d, EstudianteDTO e ){
        try {
            Universidad uni = new Universidad(u.getNombre(), u.getUbicacion());
            Diplomado dip = new Diplomado(d.getNombre(), d.getDuracion(), uni, d.getInicio(), d.getFin());
            dip.setUniversity(uni);
        
            InputStream input = f.getInputstream();
            ByteArrayOutputStream output = new ByteArrayOutputStream();
            byte [] buffer = new byte[1024];
            
            for(int length = 0 ; (length= input.read(buffer))>0;){
                output.write(buffer, 0, length);
            }
            
            Estudiante est = new Estudiante(e.getNombre(),e.getCedula() , dip);
            //est.setFoto(output.toByteArray());
            est.setDiplomados(dip);
         
            List<Diplomado> listaDiplomado = new ArrayList<>();
            listaDiplomado.add(dip);

            List<Estudiante> listaEstudiante = new ArrayList<>();
            listaEstudiante.add(est);

            uni.setListaDiplomados(listaDiplomado);
            dip.setListaEstudiantes(listaEstudiante);
            universidadEJB.create(uni);
           
            
        } catch (Exception exc) {
            System.out.println("no se guardo");
        }
        
         
        
    }
    
    /**
     *Metodo para crear unicamente una universidad
     * @param u
     */
    public void crearUniversidadSola(UniversidadDTO u){
        Universidad uni = new Universidad(u.getNombre(), u.getUbicacion());
        universidadEJB.create(uni);
    }

    /**
     *metodo para crear diplomado con el id de la universidad
     * @param u
     * @param d
     */
    public void crearDiplomadoUniversidad(UniversidadDTO u, DiplomadoDTO d){
         Universidad uni =  universidadEJB.find(u.getId());
         Diplomado dip = new Diplomado(d.getNombre(), d.getDuracion(), uni, d.getInicio(), d.getFin());
         List<Diplomado> listaDiplomado = new ArrayList<>();
         listaDiplomado.add(dip);
         dip.setUniversity(uni);
         diplomadoEJB.create(dip);
    }
    
    /**
     *metodo para asignarle el diplomado al estudiante
     * @param d
     * @param e
     */
    public void crearEstudianteDiplomado(DiplomadoDTO d, EstudianteDTO e){
         Diplomado dip =  diplomadoEJB.find(d.getId());
         Estudiante est = new Estudiante(e.getNombre(), e.getCedula(), dip);
         List<Estudiante> listaEstudiante = new ArrayList<>();
         listaEstudiante.add(est);
         est.setDiplomados(dip);
         estudianteEJB.create(est);
    }
    
    /**
     *metodo que me va a retornar la vista
     * @return
     */
    public List<Vista> ob(){
        return this.vistaEJB.obtenerRegistro();
    }
    
     /**
     *metodo que me va a retornar la universidad
     * @return
     */
    public List<Universidad>uni(){
        return this.universidadEJB.findAll();
    }
    
     /**
     *metodo que me va a retornar el diplomado
     * @return
     */
    public List<Diplomado>dip(){
        return this.diplomadoEJB.findAll();
    }
    
    /**
     *
     * @return
     */
    public DiplomadoDTO getDiplomado() {
        return diplomado;
    }

    /**
     *
     * @param diplomado
     */
    public void setDiplomado(DiplomadoDTO diplomado) {
        this.diplomado = diplomado;
    }

    /**
     *
     * @return
     */
    public UniversidadDTO getUniversidad() {
        return universidad;
    }

    /**
     *
     * @param universidad
     */
    public void setUniversidad(UniversidadDTO universidad) {
        this.universidad = universidad;
    }

    /**
     *
     * @return
     */
    public EstudianteDTO getEstudiante() {
        return estudiante;
    }

    /**
     *
     * @param estudiante
     */
    public void setEstudiante(EstudianteDTO estudiante) {
        this.estudiante = estudiante;
    }

    /**
     *
     * @return
     */
    public UploadedFile getF() {
        return f;
    }

    /**
     *
     * @param f
     */
    public void setF(UploadedFile f) {
        this.f = f;
    }

    /**
     *
     * @return
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     *
     * @param direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     *
     * @return
     */
    public int getD() {
        return d;
    }

    /**
     *
     * @param d
     */
    public void setD(int d) {
        this.d = d;
    }

    /**
     *
     * @return
     */
    public List<Vista> getListarDatos() {
        return listarDatos;
    }

    /**
     *
     * @param listarDatos
     */
    public void setListarDatos(List<Vista> listarDatos) {
        this.listarDatos = listarDatos;
    }
  
}
