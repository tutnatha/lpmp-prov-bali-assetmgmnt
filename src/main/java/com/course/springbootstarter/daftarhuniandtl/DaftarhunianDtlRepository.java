package com.course.springbootstarter.daftarhuniandtl;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface DaftarhunianDtlRepository extends CrudRepository<DaftarhunianDtl, String> {
  public List<DaftarhunianDtl> findAll(String s);

}
