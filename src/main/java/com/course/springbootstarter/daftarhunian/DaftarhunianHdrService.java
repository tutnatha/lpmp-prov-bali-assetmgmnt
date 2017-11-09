package com.course.springbootstarter.daftarhunian;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DaftarhunianHdrService {

    @Autowired
    private DaftarhunianHdrRepository daftarhunianHdrRepository;

    public List<DaftarhunianHdr> getAllDaftarhunianHdrs() {
        List<DaftarhunianHdr> daftarhunianHdrs = new ArrayList<>();
        daftarhunianHdrRepository.findAll().forEach(daftarhunianHdrs::add);
        return daftarhunianHdrs;
    }

    public DaftarhunianHdr getDaftarhunianHdr(int no) {
        //return daftarhunianHdrs.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        String s = String.valueOf(no);
        return daftarhunianHdrRepository.findOne(s);
    }

    public void addDaftarhunianHdr(DaftarhunianHdr daftarhunianHdr) {
        daftarhunianHdrRepository.save(daftarhunianHdr);
    }

    void updateDaftarhunianHdr(int no, DaftarhunianHdr daftarhunianHdr) {
        daftarhunianHdrRepository.save(daftarhunianHdr);
    }

    void deleteDaftarhunianHdr(int no) {
        String s = String.valueOf(no);
        daftarhunianHdrRepository.delete(s);
    }

}
