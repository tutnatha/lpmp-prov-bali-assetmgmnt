package com.course.springbootstarter.penugasan;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the surat_tugas_dtl database table.
 * 
 */
@Entity
@Table(name="surat_tugas_dtl")
@NamedQuery(name="SuratTugasDtl.findAll", query="SELECT s FROM SuratTugasDtl s")
public class SuratTugasDtl2 implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SuratTugasDtlPK id;

	@Column(name="is_valid")
	private String isValid;

//	private String isValid;

	@Column(name="nomor_urut")
	private int nomorUrut;

	private String nomorSurat;

	@Temporal(TemporalType.TIMESTAMP)
	private Date tglPemantauan;

	private String tujuanSekolah;

	//bi-directional many-to-one association to LokasiTujuan
	@ManyToOne
	@JoinColumn(name="tujuan_sekolah")
	private LokasiTujuan2 lokasiTujuan;

	//bi-directional many-to-one association to Pegawai
	@ManyToOne
	@JoinColumn(name="nip", insertable=false, updatable=false)
	private Pegawai2 pegawai;

	public SuratTugasDtl2() {
	}

	public SuratTugasDtlPK getId() {
		return this.id;
	}

	public void setId(SuratTugasDtlPK id) {
		this.id = id;
	}

//	public String getIsValid() {
//		return this.isValid;
//	}
//
//	public void setIsValid(String isValid) {
//		this.isValid = isValid;
//	}

	public String getIsValid() {
		return this.isValid;
	}

	public void setIsValid(String isValid) {
		this.isValid = isValid;
	}

	public int getNomorUrut() {
		return this.nomorUrut;
	}

	public void setNomorUrut(int nomorUrut) {
		this.nomorUrut = nomorUrut;
	}

	public String getNomorSurat() {
		return this.nomorSurat;
	}

	public void setNomorSurat(String nomorSurat) {
		this.nomorSurat = nomorSurat;
	}

	public Date getTglPemantauan() {
		return this.tglPemantauan;
	}

	public void setTglPemantauan(Date tglPemantauan) {
		this.tglPemantauan = tglPemantauan;
	}

	public String getTujuanSekolah() {
		return this.tujuanSekolah;
	}

	public void setTujuanSekolah(String tujuanSekolah) {
		this.tujuanSekolah = tujuanSekolah;
	}

	public LokasiTujuan2 getLokasiTujuan() {
		return this.lokasiTujuan;
	}

	public void setLokasiTujuan(LokasiTujuan2 lokasiTujuan) {
		this.lokasiTujuan = lokasiTujuan;
	}

	public Pegawai2 getPegawai() {
		return this.pegawai;
	}

	public void setPegawai(Pegawai2 pegawai) {
		this.pegawai = pegawai;
	}

}