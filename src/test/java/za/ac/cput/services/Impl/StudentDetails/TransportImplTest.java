package za.ac.cput.services.Impl.StudentDetails;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.StudentDetails.Transport;
import za.ac.cput.factory.StudentDetails.TransportFactory;
import za.ac.cput.services.Interface.StudentDetails.ITransport;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TransportImplTest
{
    private Transport transport;

    @Autowired
    private ITransport service;

    @BeforeEach
    void setUp()
    {
        this.transport = TransportFactory.createTransport("395704859", "30954", "Car");
        Transport save = this.service.save(this.transport);
        assertAll(
                () -> assertNotNull(save),
                () -> assertEquals(this.transport, save)
        );
    }
    @Test
    void findAll()
    {
        List<Transport> transportList = this.service.findAll();
        System.out.println(transportList);
        assertEquals(1, transportList.size());
    }

    @Test
    void save()
    {
        Transport save = this.service.save(this.transport);
        System.out.println(save);
        assertNotNull(save);
    }

    @Test
    void read()
    {
        Optional<Transport> read = this.service.read(this.transport.transportID);
        assertAll(
                () -> assertTrue(read.isPresent()),
                () -> assertEquals(this.transport, read.get())
                );
    }

    @Test
    void delete()
    {
        Transport delete = this.service.save(this.transport);
        List<Transport> transportList = this.service.findAll();
        assertEquals(1, transportList.size());
        System.out.println("Deleted");
        this.service.delete(delete);
    }
}