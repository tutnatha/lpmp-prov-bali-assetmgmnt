package com.course.springbootstarter.daftarhunian;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface DaftarhunianHdrRepository extends CrudRepository<DaftarhunianHdr, String> {

    //Query penyelenggara
    @Query ("select d from DaftarhunianHdr d where d.penyelenggara = ?1")     //Simple as that
    public List<DaftarhunianHdr> findByPenyelenggara(String penyelenggara);

    //Query kodeKegiatan
//    @Query ("select e from DaftarhunianHdr e where kodeKegiatan = ?1")
//    public List<DaftarhunianHdr> findByKegiatan(String kodeKegiatan);

}
