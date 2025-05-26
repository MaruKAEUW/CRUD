package com.example.demo.controller;

import com.example.demo.model.SinhVien;
import com.example.demo.service.SinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sinhvien")
public class SinhVienController {

    @Autowired
    private SinhVienService service;

    @GetMapping
    public List<SinhVien> layTatCa() {
        return service.layTatCa();
    }

    @PostMapping
    public SinhVien taoMoi(@RequestBody SinhVien sv) {
        return service.taoMoi(sv);
    }

    @PutMapping("/{id}")
    public SinhVien capNhat(@PathVariable Long id, @RequestBody SinhVien sv) {
        return service.capNhat(id, sv);
    }

    @DeleteMapping("/{id}")
    public void xoa(@PathVariable Long id) {
        service.xoa(id);
    }
}
