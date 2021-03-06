package com.sjzmlb.cms.resume.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sjzmlb.cms.resume.dao.LanguageDAO;
import com.sjzmlb.cms.resume.vo.LanguageModel;
import com.sjzmlb.cms.resume.vo.LanguageQueryModel;
import com.sjzmlb.common.service.BaseService;

@Service
@Transactional
public class LanguageService extends BaseService<LanguageModel, LanguageQueryModel> implements ILanguageService{
	private LanguageDAO dao = null;
	@Autowired
	private void setDao(LanguageDAO dao){
		this.dao = dao;
		super.setDAO(dao);
	}
	public LanguageModel getByResumeId(String resumeId) {
		return dao.getByResumeId(resumeId);
	}
	
}
