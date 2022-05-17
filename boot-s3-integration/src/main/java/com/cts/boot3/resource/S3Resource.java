package com.cts.boot3.resource;

import java.io.FileNotFoundException;

import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.boot3.service.S3Service;

@RestController
@RequestMapping("/file")
public class S3Resource {
	
	private S3Service service;
	
	
	
	
	@PostMapping("/upload")
	public ResponseEntity<String> uploadFile(@RequestParam(value="file")MultipartFile file)
			throws FileNotFoundException{
		
		return new ResponseEntity<>(service.uploadFile(file),HttpStatus.OK);
	}
	@GetMapping("/download/{fileName}")
	public ResponseEntity<ByteArrayResource>downloadFile(@PathVariable String fileName) {
		byte[] data=service.downloadFile(fileName);
		ByteArrayResource resource=new ByteArrayResource(data);
		return ResponseEntity
				.ok()
				.contentLength(data.length)
				.header("Content-type",  "application/octet-stream")
				.header("content=diposition", "attatchment; filename=\""+fileName + "\"")
				.body(resource);
	}
	@DeletingMapping("/delete/{fileName}")
	public ResponseEntity<String> deleteFile(@PathVariable String fileName) {
		return new ResponseEntity
	}
	}

}
