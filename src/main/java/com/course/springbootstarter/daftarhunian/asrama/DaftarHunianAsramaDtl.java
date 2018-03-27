package com.course.springbootstarter.daftarhunian.asrama;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
//import com.gigy.model.Person;

@Entity
@Table(name = "daftarhunian_dtl")
public class DaftarHunianAsramaDtl implements Serializable{
	
    private static final long serialVersionUID = -3009157732242241606L;
    
    @Embeddable
//    public class MyCompositePK implements Serializable{ 
//
//	However, I found that if I change class Id to static. Everything will be fine.
//	I am just curious about how all these stuff can happen.
//	https://stackoverflow.com/questions/6805143/no-default-constructor-for-entity-for-inner-class-in-hibernate
//
    //harus static : sumber stackoverflow.com/questions/6805143
    public static class MyCompositePK implements Serializable{ 
        @Column(name="no_trx")
        private int noTrx;

        @Column(name="no_kamar")
        private String noKamar;
        
//        public MyCompositePK(){
        protected MyCompositePK(){
        	
        }
        
    	public String getNoKamar() {
    		return noKamar;
    	}

    	public void setNoKamar(String noKamar) {
    		this.noKamar = noKamar;
    	}

		public int getNoTrx() {
			return noTrx;
		}

		public void setNoTrx(int noTrx) {
			this.noTrx = noTrx;
		}

    }

    @EmbeddedId
    private MyCompositePK id; //= new DaftarHunianAsramaDtl().new MyCompositePK();
    
    @Column(name="seq_no")
    private int seqNo;

//    @SuppressWarnings("unused")
    @MapsId("noTrx")
    @ManyToOne(optional=false, cascade = CascadeType.ALL)
	@JoinColumn (name="no_trx", nullable=false, updatable=false, referencedColumnName = "no_trx")	//adalah : foreign key
//    @JoinColumn(name="no_trx")
    @JsonBackReference
	private DaftarHunianAsrama daftarHunianAsrama;	//single class

    @MapsId("noKamar")
    @ManyToOne(optional=false, cascade = CascadeType.ALL)
	@JoinColumn (name="no_kamar", nullable=false, updatable=false, referencedColumnName = "no")	//adalah : foreign key
//    @JoinColumn(name="no_kamar")
    @JsonBackReference
	private Room room;	//single class

	public int getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(int seqNo) {
		this.seqNo = seqNo;
	}

	public MyCompositePK getId() {
		return id;
	}

	public void setId(MyCompositePK id) {
		this.id = id;
	}

	public DaftarHunianAsrama getDaftarHunianAsrama() {
		return daftarHunianAsrama;
	}

	public void setDaftarHunianAsrama(DaftarHunianAsrama daftarHunianAsrama) {
		this.daftarHunianAsrama = daftarHunianAsrama;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}
	
	public DaftarHunianAsramaDtl(){
		
	}
	
}
