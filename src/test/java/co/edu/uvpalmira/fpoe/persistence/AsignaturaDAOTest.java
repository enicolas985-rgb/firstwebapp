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
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

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
            String codigo = asig.getCodigo();
            asig = null;
            Assert.assertNotNull(this.id);
            
            System.out.println("Buscar : " + this.id);
            asig= this.asignaturaDAO.buscarPorCodigo(codigo);
            Assert.assertEquals("750014C",codigo);
            
            System.out.println("Actualizar");
            asig.setNombre("Fundamentos de Programacion");
            this.asignaturaDAO.edit(asig);
            asig = null;
            asig = this.asignaturaDAO.buscarPorCodigo(codigo);
            Assert.assertEquals("Fundamentos de Programacion",asig.getNombre()
            );
            
        } catch (Exception ex) {
            Logger.getLogger(AsignaturaDAOTest.class.getName()).log(Level.SEVERE, null, ex);
        Assert.fail();
        }
        
        
              
    }

    /**
     * Test of buscarPorEscuela method, of class AsignaturaDAO.
     */
    @Test
    public void testBuscarPorEscuela() {
        try {
            System.out.println("Insertar asignaturas");
            
            Asignatura a1 =
                    new Asignatura("750001C",
                            "Matematicas",
                            (byte) 4,
                            (byte) 4);
            
            Asignatura a2 =
                    new Asignatura("750002C",
                            "Programacion",
                            (byte) 3,
                            (byte) 3);
            
            Asignatura a3 =
                    new Asignatura("760001C",
                            "Circuitos",
                            (byte) 3,
                            (byte) 2);
            
            this.asignaturaDAO.create(a1);
            this.asignaturaDAO.create(a2);
            this.asignaturaDAO.create(a3);
            
            System.out.println("buscar por escuela : 750 ");
            List<Asignatura> lista = this.asignaturaDAO.buscarPorEscuela("750%");

            Assert.assertNotNull(lista);

            Assert.assertEquals(2, lista.size());

            Assert.assertEquals("750001C",
                    lista.get(0).getCodigo());

            Assert.assertEquals("750002C",
                    lista.get(1).getCodigo());
        } catch (Exception ex) {
            Logger.getLogger(AsignaturaDAOTest.class.getName()).log(Level.SEVERE, null, ex);
            Assert.fail();
        }

    }
    
}
