package com.course.springbootstarter.daftarhunian.asrama;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DaftarHunianAsramaService {
	@Autowired
    private DaftarHunianAsramaService daftarHunianAsramaService;

    @PersistenceContext	
    private EntityManager entityManager;	
	
    public List<QueriDfrtHunianHdrDtl> getAllQueriDfrtHunianHdrDtls() {
        List<QueriDfrtHunianHdrDtl> daftarhunianHdrs = new ArrayList<>();
//        daftarhunianHdrRepository.findAll().forEach(daftarhunianHdrs::add);
        Query nativeQuery = entityManager.createNativeQuery("select a.no_trx,"
                + "a.penyelenggara,"
                + "a.tgl_mulai,"
                + "a.tgl_selesai,"
                + "a.jml_peserta,"
                + "a.sudah_selesai,"
                + "a.kode_kegiatan,"
                + "b.seq_no,"
                + "b.no_kamar "
                + "from daftarhunian_hdr a,"
                + " daftarhunian_dtl b "
                + " where a.no_trx = b.no_trx");
//        return nativeQuery.getResultList();
        daftarhunianHdrs = nativeQuery.getResultList();
        return daftarhunianHdrs;
    }
}
