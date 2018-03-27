package com.course.springbootstarter.daftarhunian.asrama;

import java.util.Collection;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//import com.gigy.model.Party;
//import com.gigy.repository.PartyRepository;

@RestController
@RequestMapping("user")
public class DaftarHunianAsramaController {
	@Autowired
    private DaftarHunianAsramaService dhaService;

	@Autowired
	private RoomsUsedService ruService;	//coba ini dulu

//	@RequestMapping(method = RequestMethod.GET)
//	public ResponseEntity<Collection<Party>> getParties() {
//		return new ResponseEntity<>(partyRepo.findAll(), HttpStatus.OK);
//	}

	
    @RequestMapping("/getAllQueriDfrtHunianHdrDtls")
    public List<QueriDfrtHunianHdrDtl> getAllQueriDfrtHunianHdrDtls() {
        return dhaService.getAllQueriDfrtHunianHdrDtls();
    }
    
    @RequestMapping("/gsonAllQueriDfrtHunianHdrDtls")
    public String gsonQueryDftrHunianHdrDtls() {
        return dhaService.gsonQueryDftrHunianHdrDtls();
    }
    
    @RequestMapping("/getAllDaftarHunianAsramas")
    public List<DaftarHunianAsrama> getAllDaftarhunianAsramas(){
    	return dhaService.getAllDaftarhunianAsramas();
    }
    
    @RequestMapping("/getAllRoomsUsed")
    public List<Room> getAllRoomsUsed(){
    	return ruService.getAllRoomsUsed();
    }
}
