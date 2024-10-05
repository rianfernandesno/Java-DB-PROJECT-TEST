package model.dao;

import model.entities.Department;

import java.util.List;

public interface DepartamentDao {
    void insert(Department obj);
    void update(Department obj);
    void deleteById(Integer id);
    Department findByInd(Integer id);
    List<Department> findAll();
}
