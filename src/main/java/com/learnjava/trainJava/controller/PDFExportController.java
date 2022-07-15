package com.learnjava.trainJava.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.learnjava.trainJava.entity.Projects;
import com.learnjava.trainJava.repository.ProjectsRepository;
import com.learnjava.trainJava.service.PDFGenerator;
import com.learnjava.trainJava.service.ApplicationService;
import com.lowagie.text.DocumentException;



@Controller
public class PDFExportController {
	@Autowired
	private ApplicationService userService;
	
	@Autowired 
	private ProjectsRepository itemsRepository;
	
	private final PDFGenerator pdfGeneratorService;
	
	public PDFExportController(PDFGenerator pdfGeneratorService) {
		this.pdfGeneratorService = pdfGeneratorService;
	}
	
	@GetMapping("/exportPDF")
	public void generatePDF(HttpServletResponse response) throws DocumentException, IOException {
		response.setContentType("application/pdf");
		DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
		String currentDateTime = dateFormatter.format(new Date());
		
		String headerkey = "Content-Disposition";
		String headerValue = "attachment; filename=pdf_" + currentDateTime + ".pdf";
		response.setHeader(headerkey, headerValue);
		
//		List<Projects> items = userService.listAll();
//		PDFGenerator exporter = new PDFGenerator(items);
//		exporter.export(response);
//		this.pdfGeneratorService.export(response);
	}
}
