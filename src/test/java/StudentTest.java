import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

public class StudentTest {

    //This test sees if the object is successfully created
    @Test
    public void testIfStudentCreates(){
        Student alex = new Student(1L, "Alex");
        Student nullStudent = null;
        assertNotNull(alex);
        assertNull(nullStudent);
    }

    //This tests if the fields of the object are properly set
    @Test
    public void testIfFieldsWork(){
        Student alex = new Student(1L, "Alex");
        assertEquals(1L, alex.getId());
        assertEquals("Alex", alex.getName());

        Student james = new Student(50L, "James");
        assertEquals(50L, james.getId());
        assertEquals("James", james.getName());
    }

    @Test
    public void testAddGrades(){
        Student alex = new Student(5L, "Alex");
        assertEquals(0, alex.getGrades().size());
        alex.addGrade(85);
        assertEquals(1, alex.getGrades().size());
        alex.addGrade(97);
        assertEquals(2, alex.getGrades().size());
    }

    @Test
    public void testGetGrades(){
        Student alex = new Student(5L, "Alex");
        alex.addGrade(85);
        alex.addGrade(97);
        assertSame(85, alex.getGrades().get(0));
        assertSame(97, alex.getGrades().get(1));
    }


    @Test
    public void testGetGradeAverage(){
        Student alex = new Student(5L, "Alex");
        alex.addGrade(100);
        alex.addGrade(80);
        assertEquals(90.0, alex.getGradeAverage(), 0);
    }
}
