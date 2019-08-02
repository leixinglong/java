package com.zte.dom4j;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
            Document document = DocumentHelper.createDocument();
            Element root = document.addElement("root");

            Element author1 = root.addElement("author")
                    .addAttribute("name", "James")
                    .addAttribute("location", "UK")
                    .addText("James Strachan");

            Element author2 = root.addElement("author")
                    .addAttribute("name", "Bob")
                    .addAttribute("location", "US")
                    .addAttribute("test", "1 >  2")
                    .addText("Bob McWhirter");

            // lets write to a file
            FileWriter fileWiter = new FileWriter("D://output.xml");
            OutputFormat format = OutputFormat.createPrettyPrint();
            XMLWriter writer = new XMLWriter(fileWiter, format);
            writer.setEscapeText(false);
            writer.write( document );
            writer.close();


            // 测试
    }
}
