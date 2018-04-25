package com.course.springbootstarter.daftarhuniandtl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("user")		//auth login user:mukesh/m123
public class DaftarhunianDtlController {

    @Autowired
    private DaftarhunianDtlService daftarhunianDtlService;

    //tanpa parameter
    @RequestMapping("/daftarhunianDtls")
    public List<DaftarhunianDtl> getAllDaftarhunianDtls() {
        return daftarhunianDtlService.getAllDaftarhunianDtls();
    }

    //filter by : noTrx - parameter
    @RequestMapping("/daftarhunianDtls/{no}")
    public List<DaftarhunianDtl> getDaftarhunianDtl(@PathVariable String no) {
        int iNo = Integer.valueOf(no);
        return daftarhunianDtlService.getDaftarhunianDtl(iNo);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/daftarhunianDtls")
    public void addDaftarhunianDtl(@RequestBody DaftarhunianDtl daftarhunianDtl) {
        daftarhunianDtlService.addDaftarhunianDtl(daftarhunianDtl);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/daftarhunianDtls/{no}")
    public void updateTopic(@RequestBody DaftarhunianDtl daftarhunianDtl, @PathVariable String no) {
        int iNo = Integer.valueOf(no);
        daftarhunianDtlService.updateDaftarhunianDtl(iNo, daftarhunianDtl);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/daftarhunianDtls/{no}")
    public void deleteDaftarhunianDtl(@PathVariable String no) {
        int iNo = Integer.valueOf(no);
        daftarhunianDtlService.deleteDaftarhunianDtl(iNo);
    }

}
