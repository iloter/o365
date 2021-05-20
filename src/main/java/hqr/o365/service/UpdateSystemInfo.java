package hqr.o365.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hqr.o365.dao.TaMasterCdRepo;
import hqr.o365.domain.TaMasterCd;

@Service
public class UpdateSystemInfo {

	@Autowired
	private TaMasterCdRepo tmc;
	
	public boolean updateInfo(String keyTy, String cd, String decode) {
		boolean flag = false;
		Optional<TaMasterCd> opt = tmc.findById(keyTy);
		if(opt.isPresent()) {
			TaMasterCd enti = opt.get();
			enti.setCd(cd);
			enti.setDecode(decode);
			tmc.saveAndFlush(enti);
			flag = true;
		}
		return flag;
	}
	
}