package com.learnjava.trainJava.service;

import java.awt.Color;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;

import com.learnjava.trainJava.entity.Projects;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

@Service
public class PDFGenerator {
	private List<Projects> items;

	public PDFGenerator(List<Projects> items) {
		this.items = items;
	}
	
	private void writeTableHeader(PdfPTable table) {
		PdfPCell cell = new PdfPCell();
		cell.setBackgroundColor(Color.BLUE);
		cell.setPadding(5);

		Font font = FontFactory.getFont(FontFactory.HELVETICA);
		font.setColor(Color.WHITE);

		cell.setPhrase(new Phrase("Items ID", font));

		table.addCell(cell);

		cell.setPhrase(new Phrase("Capacity", font));
		table.addCell(cell);

		cell.setPhrase(new Phrase("Duration", font));
		table.addCell(cell);

		cell.setPhrase(new Phrase("Employment Mode", font));
		table.addCell(cell);

		cell.setPhrase(new Phrase("Name Project", font));
		table.addCell(cell);

		cell.setPhrase(new Phrase("Link Project", font));
		table.addCell(cell);

		cell.setPhrase(new Phrase("Link URL", font));
		table.addCell(cell);

		cell.setPhrase(new Phrase("Role", font));
		table.addCell(cell);

		cell.setPhrase(new Phrase("Team Size", font));
		table.addCell(cell);

		cell.setPhrase(new Phrase("Start Year", font));
		table.addCell(cell);
	}

//	private void writeTableData(PdfPTable table) {
//		for (Projects items : items) {
//			table.addCell(String.valueOf(items.getPid()));
//			table.addCell(items.getCapacity());
//			table.addCell(String.valueOf(items.getDuration()));
//			table.addCell(items.getEmployment_mode());
//			table.addCell(items.getName_project());
//			table.addCell(items.getLink_repo());
//			table.addCell(items.getLink_url());
//			table.addCell(items.getRole());
//			table.addCell(String.valueOf(items.getTeam_size()));
//			table.addCell(items.getStart_year());
//		}
//	}

	public void export(HttpServletResponse response) throws DocumentException, IOException {
//		Document document = new Document(PageSize.A4);
//		PdfWriter.getInstance(document, response.getOutputStream());
//
//		document.open();
//		Font fontTitle = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
//		fontTitle.setSize(18);
//
//		Paragraph paragraph = new Paragraph("This is a title", fontTitle);
//
//		Font fontParagraph = FontFactory.getFont(FontFactory.HELVETICA);
//		fontParagraph.setSize(12);
//
//		Paragraph paragraph2 = new Paragraph("This is a paragraph", fontParagraph);
//		paragraph2.setAlignment(Paragraph.ALIGN_LEFT);
//
//		document.add(paragraph);
//		document.add(paragraph2);
//		document.close();

		Document document = new Document(PageSize.A4);
		PdfWriter.getInstance(document, response.getOutputStream());

		document.open();
		Font font = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
		font.setSize(18);
		font.setColor(Color.BLUE);

		Paragraph p = new Paragraph("List of Users", font);
		p.setAlignment(Paragraph.ALIGN_CENTER);

		document.add(p);

		PdfPTable table = new PdfPTable(10);
		table.setWidthPercentage(100f);
		table.setWidths(new float[] { 2f, 1.5f, 2.0f, 3.0f, 1.5f, 1.5f, 3.0f, 1.5f, 3.0f, 1.5f });
		table.setSpacingBefore(10);

		writeTableHeader(table);
//		writeTableData(table);

		document.add(table);

		document.close();

	}
}
