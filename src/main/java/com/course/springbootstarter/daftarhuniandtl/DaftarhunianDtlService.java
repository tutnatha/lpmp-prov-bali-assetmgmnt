package com.course.springbootstarter.daftarhuniandtl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//public class DaftarhunianDtlService implements DaftarhunianDtlRepository{
public class DaftarhunianDtlService{
    
    @Autowired
    private DaftarhunianDtlRepository daftarhunianDtlRepository;

    //tanpa parameter
    public List<DaftarhunianDtl> getAllDaftarhunianDtls() {
        List<DaftarhunianDtl> daftarhunianDtls = new ArrayList<>();
        daftarhunianDtlRepository.findAll().forEach(daftarhunianDtls::add);
        return daftarhunianDtls;
    }

    //filter by : noTrx - parameter
    public List<DaftarhunianDtl> getDaftarhunianDtl(int no) {
        //return daftarhunianDtls.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        String s = String.valueOf(no);
        String[] as = {s};
//        return daftarhunianDtlRepository.findOne(s);  //ambil banyak row: bukan satu row.
        List<DaftarhunianDtl> daftarhunianDtls = new ArrayList<>();
        daftarhunianDtlRepository.findAll(as).forEach(daftarhunianDtls::add);
        return daftarhunianDtls;
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
