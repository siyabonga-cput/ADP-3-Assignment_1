package za.ac.cput.Repository;

import za.ac.cput.Domain.Entity.Admin;


import java.util.HashSet;
import java.util.Set;

public class AdminRepository implements IAdminRepository {

private  static AdminRepository repository = null;
private Set<Admin> adminDB = null;

private AdminRepository(){adminDB = new HashSet<Admin>();}

public static AdminRepository getRepository(){

    if(repository == null){
        repository = new AdminRepository();
    }
return repository;
}




    @Override
    public Admin create(Admin admin) {
    this.adminDB.add(admin);
    return admin;

    }

    @Override
    public Admin read(String adminID) {
      for( Admin a : adminDB){
         if (a.getAdminID().equals(adminID)){
             return a;
         }

      }
        return null;
    }

    @Override
    public Admin update(Admin admin) {

    Admin admin1 = read(admin.getAdminID());
    if (admin1 != null){
        adminDB.remove(admin1);
        adminDB.add(admin);
        return admin;
    }
    return null;

    }

    @Override
    public void  delete(String adminID) {
     Admin adminDelete = read(adminID);
     if (adminDelete == null){
         System.out.println("Admin is null");

     }
     adminDB.remove(adminDelete);
        System.out.println("Admin removed");
    }


    @Override
    public Set<Admin> getAll() {
        return adminDB ;
    }

}
