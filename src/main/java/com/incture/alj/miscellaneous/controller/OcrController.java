package com.incture.alj.miscellaneous.controller;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import javax.imageio.ImageIO;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;

import com.incture.alj.miscellaneous.entities.OcrModel;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;




@RestController
public class OcrController {

	
	
	 @RequestMapping("/test")
	  public String index() {
	    return "Ocr Testing";
	  }
	
	
	 @RequestMapping(value = "/uploadFile2", method = RequestMethod.POST)
	 @ResponseBody
	 public String DoOCR2(@RequestParam("uploadfile") MultipartFile uploadfile) throws IOException {
	 
		 
		 if(uploadfile != null && uploadfile.isEmpty() == false)
		 {
			 String text="a";
			 Tesseract tesseract = new Tesseract(); 
		        try { 
		  
		        	tesseract.setDatapath("..//tessdata");
		            text 
		                = tesseract.doOCR(convert(uploadfile)); 
		  
		            System.out.print(text); 
		        } 
		        catch (TesseractException e) { 
		            e.printStackTrace(); 
		        } 
		        return text;
			 
		 }
		 return "FILE IS NULL";
	 }
	

	
	 @RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
	 @ResponseBody
	 public String DoOCR(@RequestParam("uploadfile") MultipartFile uploadfile) throws IOException {

		
		OcrModel request = new OcrModel();
		request.setDestinationLanguage("eng");
		request.setImage(uploadfile);

		ITesseract instance = new Tesseract();

		try {
			
			
			BufferedImage in = ImageIO.read(convert(uploadfile));

			BufferedImage newImage = new BufferedImage(in.getWidth(), in.getHeight(), BufferedImage.TYPE_INT_ARGB);
            
			Graphics2D g = newImage.createGraphics();
			g.drawImage(in, 0, 0, null);
			g.dispose();
            
			instance.setLanguage(request.getDestinationLanguage());
			instance.setDatapath("..//tessdata");

			String result = instance.doOCR(newImage);

			return result;

		} catch (TesseractException | IOException e) {
			System.err.println(e.getMessage());
			return "Error while reading image";
		}

	}
	
	public static File convert(MultipartFile file) throws IOException {
	    File convFile = new File(file.getOriginalFilename());
	    convFile.createNewFile();
	    FileOutputStream fos = new FileOutputStream(convFile);
	    fos.write(file.getBytes());
	    fos.close();
	    return convFile;
	}
}