package com.course.springbootstarter.daftarhuniandtl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DaftarhunianDtlService {

    @Autowired
    private DaftarhunianDtlRepository daftarhunianDtlRepository;

    public List<DaftarhunianDtl> getAllDaftarhunianDtls() {
        List<DaftarhunianDtl> daftarhunianDtls = new ArrayList<>();
        daftarhunianDtlRepository.findAll().forEach(daftarhunianDtls::add);
        return daftarhunianDtls;
    }

    public DaftarhunianDtl getDaftarhunianDtl(int no) {
        //return daftarhunianDtls.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        String s = String.valueOf(no);
        return daftarhunianDtlRepository.findOne(s);
    }

    public void addDaftarhunianDtl(DaftarhunianDtl daftarhunianDtl) {
        daftarhunianDtlRepository.save(daftarhunianDtl);
    }

    void updateDaftarhunianDtl(int no, DaftarhunianDtl daftarhunianDtl) {
        daftarhunianDtlRepository.save(daftarhunianDtl);
    }

    void deleteDaftarhunianDtl(int no) {
        String s = String.valueOf(no);
        daftarhunianDtlRepository.delete(s);
    }

}
