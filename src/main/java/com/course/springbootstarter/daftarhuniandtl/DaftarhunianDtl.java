//no_trx
//seq_no
//no_kamar

package com.course.springbootstarter.daftarhuniandtl;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import java.util.Date;

@Entity
@Table(name = "daftarhunian_dtl")
public class DaftarhunianDtl {

    private static final long serialVersionUID = -3009157732242241606L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="no_trx")
    ///private int no;
    private String no;          //catatan: pakai String dulu ya..
    @Column(name="seq_no")
    private int seqNo;
    @Column(name="no_kamar")
    private int noKamar;

    public DaftarhunianDtl() {

    }

    //    public DaftarhunianHdr(int no, String noKamar, String regNo, String isUsed, Date startDate, Date endDate) {
    public DaftarhunianDtl(String no, int seqNo, int noKamar) {
        super();
        this.no = no;
        this.seqNo = seqNo;
        this.noKamar = noKamar;
    }

    //    public int getNo() {
    public String getNo() {
        return no;
    }

    //    public void setNo(int no) {
//        this.no = no;
//    }
    public void setNo(String no) {
        this.no = no;
    }

    public int getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(int seqNo) {
        this.seqNo = seqNo;
    }

    public int getNoKamar() {
        return noKamar;
    }

    public void setNoKamar(int noKamar) {
        this.noKamar = noKamar;
    }

}
