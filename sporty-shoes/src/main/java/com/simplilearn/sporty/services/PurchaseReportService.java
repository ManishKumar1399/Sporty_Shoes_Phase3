package com.simplilearn.sporty.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.sporty.Entity.PurchaseReport;
import com.simplilearn.sporty.repo.RepoPurchaseReport;


@Service
public class PurchaseReportService {

	@Autowired
	private RepoPurchaseReport purchaseReportRepository;

	public void savePurchaseReport(String productName, String category, int productPrice, String userName, String userEmail, Date date) {
		PurchaseReport purchaseReport = new PurchaseReport(productName, category, productPrice, userName, userEmail, date);
		purchaseReportRepository.save(purchaseReport);
	}

	public List<PurchaseReport> getAllPurchaseReport() {
		List<PurchaseReport> purchaseReports = purchaseReportRepository.findAll();
		return purchaseReports;
	}

	public List<PurchaseReport> getPurchaseReportBasedOnCategory(String category) {
		List<PurchaseReport> purchaseReports = purchaseReportRepository.findAllByCategory(category);
		return purchaseReports;
	}

	public List<PurchaseReport> getPurchaseReportBasedOnDate(String date) throws ParseException {
		List<PurchaseReport> purchaseReports = purchaseReportRepository.findAllByDate(new SimpleDateFormat("yyyy-MM-dd").parse(date));
		return purchaseReports;
	}

}
