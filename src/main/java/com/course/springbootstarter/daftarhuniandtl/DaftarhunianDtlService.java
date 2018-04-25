package com.course.springbootstarter.daftarhuniandtl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DaftarhunianDtlService {

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
//         return daftarhunianDtlRepository.findOne(s);
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

    @Override
    public List<DaftarhunianDtl> findAll(String[] s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public <S extends DaftarhunianDtl> S save(S s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public <S extends DaftarhunianDtl> Iterable<S> save(Iterable<S> itrbl) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DaftarhunianDtl findOne(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean exists(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterable<DaftarhunianDtl> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterable<DaftarhunianDtl> findAll(Iterable<String> itrbl) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long count() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(DaftarhunianDtl t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Iterable<? extends DaftarhunianDtl> itrbl) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
