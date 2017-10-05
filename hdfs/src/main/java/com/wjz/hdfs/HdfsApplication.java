package com.wjz.hdfs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.hadoop.fs.FsShell;

@SpringBootApplication
public class HdfsApplication implements CommandLineRunner {

	@Autowired
	private FsShell shell;

	public static void main(String[] args) {
		SpringApplication.run(HdfsApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		for(String text :shell.text("/usr/test")){
			System.out.println(text);
		}
	}
}
