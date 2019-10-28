package com.softserve.lukas20191022;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhotoCheckInFields {
	public void fetchChild(File file, List<PhotoCheck> photocheckset) {
		TxtFileFilter filter = new TxtFileFilter(); 
		
		if (file.isDirectory()) {

			File[] children = file.listFiles();

			for (File child : children) {
				this.fetchChild(child, photocheckset);
			}

		} else {

			if (filter.accept(file.getAbsoluteFile())) {
				try {
					photocheckset.add(new PhotoCheck(getFileDate(file
							.getAbsolutePath()), file.getAbsolutePath(), file
							.getName(), transformNametoArticle(file.getName())));
				} catch (TransformNameToArticleException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}

			// for test
			// System.out.println(file.getName());
			// try {
			// System.out.println(transformNametoArticle(file.getName()));
			// } catch (TransformNameToArticleException e) {
			// // TODO Auto-generated catch block
			// e.printStackTrace();
			// }
			// System.out.println(file.getAbsolutePath());
			// System.out.println(getFileDate(file.getAbsolutePath()));

		}

	}

	public LocalDate getFileDate(String fileName) {

		FileReader fr = null;
		BufferedReader br = null;
		String s = null;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy")
				.withLocale(Locale.US);

		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);

			// System.out.println("Read date: " + fileName);
			if ((s = br.readLine()) != null) {
				fr.close();
				br.close();
				return LocalDate.parse(s, formatter);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	public int transformNametoArticle(String name)
			throws TransformNameToArticleException {
		String pattern = "(\\d{3,4})";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(name);

		if (m.find()) {
			return Integer.parseInt(name.substring(m.start(), m.end()));
		} else {
			// System.out.println(name);
			throw new TransformNameToArticleException(
					"The name does not include numbers.Correct it.", name);
			// return 0;
		}

	}
}