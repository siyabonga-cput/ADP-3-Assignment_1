/* TransportImpl.java
   Service Implementation for the Transport
   Author: Raeesah Williams (219091498)
   Date: 07 August 2022
*/

package za.ac.cput.services.Impl.StudentDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.StudentDetails.Transport;
import za.ac.cput.repository.StudentDetailsRepo.ITransportRepository;
import za.ac.cput.services.Interface.StudentDetails.ITransport;

import java.util.List;
import java.util.Optional;

@Service
public class TransportImpl implements ITransport
{
    private final ITransportRepository repository;

    @Autowired
    public TransportImpl(ITransportRepository repository)
    {
        this.repository = repository;
    }

    @Override
    public Transport save (Transport transport)
    {
        return this.repository.save(transport);
    }

    @Override
    public Optional<Transport> read(String s)
    {
        return this.repository.findById(s);
    }

    @Override
    public void delete (Transport transport)
    {
        this.repository.delete(transport);
    }

    @Override
    public List<Transport> findAll()
    {
        return this.repository.findAll();
    }
}