package za.ac.cput.Repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.Domain.Entity.Teacher;
import za.ac.cput.Factory.TeacherFactory;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)

class TeacherRepositoryTest {
    private static TeacherRepository repository = TeacherRepository.getRepository();
    private static Teacher teacher = TeacherFactory.createTeacher("2315"
            ,"1561"
            ,"Bob"
            ,"Sponge"
            ,"0239856749"
            ,"Master"
            ,"Stress"
            ,"Government");

    @Test
    void a_create() {
        Teacher created = repository.create(teacher);
        assertEquals(teacher.getTeacherID(), created.getTeacherID());
        System.out.println("Create: " + created);
    }

    @Test
    void b_read(){
        Teacher read = repository.read(teacher.getTeacherID());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void c_update() {
        Teacher updated = new Teacher.Builder().copy(teacher)
                .setAdminID("9685")
                .setSubDeptID("6597")
                .setTeachName("Mark")
                .setTeachSurname("Gray")
                .setCellNum("0659732235")
                .setQualification("PhD")
                .setImportantInfo("depression")
                .setPost("Home")
                .build();
        assertNotNull(repository.update(updated));
        System.out.println("Updated: "+ updated);
    }

    @Test
    void e_delete() {
        boolean success = repository.delete(teacher.getTeacherID());
        assertTrue(success);
        System.out.println("Deleted: " + success);

    }

    @Test
    void d_getAll() {
        System.out.println("Show all: ");
        System.out.println(repository.getAll());
    }
}
