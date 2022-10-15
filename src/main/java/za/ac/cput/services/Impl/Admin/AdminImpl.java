package za.ac.cput.services.Impl.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Admin.Admin;
import za.ac.cput.repository.AdminRepo.IAdminRepository;
import za.ac.cput.services.Interface.Admin.IAdmin;

import java.util.List;
import java.util.Optional;

@Service
public class AdminImpl implements IAdmin {
    private final IAdminRepository repository;

    @Autowired
    public AdminImpl(IAdminRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Admin> findall() {
        return this.repository.findAll();
    }

    @Override
    public List<Admin> findAll() {
        return this.repository.findAll();
    }

    @Override
    public Admin save(Admin admin) {
        return this.repository.save(admin);
    }

    @Override
    public Optional<Admin> read(String s) {
        return this.repository.findById(s);
    }

    @Override
    public void delete(Admin admin) {
        this.repository.findAll();
    }
}