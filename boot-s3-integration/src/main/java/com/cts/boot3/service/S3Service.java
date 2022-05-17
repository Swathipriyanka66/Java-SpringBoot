package com.cts.boot3.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.multipart.MultipartFile;

@Service
@Slf4j
public class S3Service {
	
	@Value("${application.bucket.name}")
	private String bucketName;
	
	@Autowired 
	private AmazonS3 s3Client;
	
	public String uploadFile(MultipartFile file) throws FileNotFoundException {
		System.out.println(file.getSize()+">>>>>>>>>>>>>");
		File fileObj=convertMultiPartFileToFile(file);
		string fileName=System.currentTimeMillis()+"_"+ file.getOriginalFilename();
		ObjectMetadata metadata=new ObjectMetadata();
		metadata.setContentLength(fileObj.length());
		FileInputStream fis = new PutObjectRequest(bucketName,fileName,fis,metadata));
		s3Client.putObject(new PutObjectRequest(bucketName,fileName,fis,metadata));
		
		fileObj.delete();
		return "File uploaded : " + fileName;
	}
		
	public byte[] downloadFile(String fileName) {
		
		S3Object=s3Client.getObject(bucketName,filename);
		S3ObjectInputStream inputStream=s3Object.getObjectContent();
		try {
			
			byte[] content=IOUtils.toBy
			return content;		
		}catch(IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	public String deleteFile(String fileName) {
		
	private File convertMultiPartFileToFile(MultipartFile file) {
		File convertedFile=new File(file.getOriginalFilename());
	
		try(FileOutputStream fos=new FileOutputStream(convertedFile)){
			fos.write(file.getBytes());
		}catch(IOException e) {
			Log.error("error converting multipart to file",e);
		}
		return covertedFile;

	}
	}
	}

}
