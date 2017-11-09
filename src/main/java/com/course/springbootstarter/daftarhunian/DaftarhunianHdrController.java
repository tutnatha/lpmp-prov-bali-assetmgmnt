package com.course.springbootstarter.daftarhunian;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("user")		//auth login user:mukesh/m123
public class DaftarhunianHdrController {

    @Autowired
    private DaftarhunianHdrService daftarhunianHdrService;

    @RequestMapping("/daftarhunianHdrs")
    public List<DaftarhunianHdr> getAllDaftarhunianHdrs() {
        return daftarhunianHdrService.getAllDaftarhunianHdrs();
    }

    @RequestMapping("/daftarhunianHdrs/{no}")
    public DaftarhunianHdr getDaftarhunianHdr(@PathVariable String no) {
        int iNo = Integer.valueOf(no);
        return daftarhunianHdrService.getDaftarhunianHdr(iNo);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/daftarhunianHdrs")
    public void addDaftarhunianHdr(@RequestBody DaftarhunianHdr daftarhunianHdr) {
        daftarhunianHdrService.addDaftarhunianHdr(daftarhunianHdr);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/daftarhunianHdrs/{no}")
    public void updateTopic(@RequestBody DaftarhunianHdr daftarhunianHdr, @PathVariable String no) {
        int iNo = Integer.valueOf(no);
        daftarhunianHdrService.updateDaftarhunianHdr(iNo, daftarhunianHdr);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/daftarhunianHdrs/{no}")
    public void deleteDaftarhunianHdr(@PathVariable String no) {
        int iNo = Integer.valueOf(no);
        daftarhunianHdrService.deleteDaftarhunianHdr(iNo);
    }

}
