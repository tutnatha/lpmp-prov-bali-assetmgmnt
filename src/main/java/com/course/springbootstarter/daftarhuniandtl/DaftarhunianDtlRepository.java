package com.course.springbootstarter.daftarhuniandtl;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface DaftarhunianDtlRepository extends CrudRepository<DaftarhunianDtl, String>, CustomizedFindAll {

    public List<DaftarhunianDtl> findAll(String[] s);
//    public Object findAll(String[] s);

    public List<DaftarhunianDtl> findByNoTrx(String[] as);
}
