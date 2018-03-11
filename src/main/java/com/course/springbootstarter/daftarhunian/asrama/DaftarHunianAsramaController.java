package com.course.springbootstarter.daftarhunian.asrama;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class DaftarHunianAsramaController {
	@Autowired
    private DaftarHunianAsramaService dhaService;

    @RequestMapping("/getAllQueriDfrtHunianHdrDtls")
    public List<QueriDfrtHunianHdrDtl> getAllQueriDfrtHunianHdrDtls() {
        return dhaService.getAllQueriDfrtHunianHdrDtls();
    }
}
