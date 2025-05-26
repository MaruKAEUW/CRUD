package com.example.demo.service;

import com.example.demo.model.SinhVien;
import com.example.demo.repository.SinhVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SinhVienService {

    @Autowired
    private SinhVienRepository repository;

    public List<SinhVien> layTatCa() {
        return repository.findAll();
    }

    public SinhVien taoMoi(SinhVien sv) {
        return repository.save(sv);
    }

    public void xoa(Long id) {
        repository.deleteById(id);
    }

    public SinhVien capNhat(Long id, SinhVien sv) {
        sv.setId(id);
        return repository.save(sv);
    }
}
