package com.shopping.base.service;

import com.shopping.base.entity.BaseEntity;
import com.shopping.base.repo.BaseRepository;
import jakarta.persistence.MappedSuperclass;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;


@MappedSuperclass
public abstract class BaseService<T extends BaseEntity<ID>, ID extends Number> {


    @Autowired
    private BaseRepository<T, ID> baseRepository;

    public List<T> findAll() {
        return baseRepository.findAll();
    }

    public Optional<T> findById(ID id) {
        return baseRepository.findById(id);
    }

    public T update(T entity) {
        return baseRepository.save(entity);
    }

    public void deleteById(ID id) {
        baseRepository.deleteById(id);
    }

    public void deleteAllByIds(List<ID> ids) {
        ids.forEach(baseRepository::deleteById);
    }

    public T persist(T entity) {
        return baseRepository.saveAndFlush(entity);
    }
}
