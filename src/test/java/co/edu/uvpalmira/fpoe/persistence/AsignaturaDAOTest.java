/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package co.edu.uvpalmira.fpoe.persistence;

import co.edu.uvpalmira.fpoe.modelo.Asignatura;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sala Sistemas
 */
public class AsignaturaDAOTest {
    private AsignaturaDAO asignaturaDAO;
    private Long id;
    
    public AsignaturaDAOTest() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("proyect_web");
        this.asignaturaDAO = new AsignaturaDAO(emf);
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of buscarPorCodigo method, of class AsignaturaDAO.
     */
    @Test
    public void testBuscarPorCodigo() {
        try {
            System.out.println("insertar");
            Asignatura asig = new Asignatura ("750014C","FPOE", (byte)3,(byte)3);
            asignaturaDAO.create(asig);
            this.id = asig.getId();
            System.out.println(this.id);
        } catch (Exception ex) {
            Logger.getLogger(AsignaturaDAOTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
              
    }

    /**
     * Test of buscarPorEscuela method, of class AsignaturaDAO.
     */
    @Test
    public void testBuscarPorEscuela() {
        
    }
    
}
