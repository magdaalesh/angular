package codegenerate;

import AST.Nodes.HtmlNode;
import AST.Nodes.Node;
import AST.Nodes.ProgramNode;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

public class codegenerate {
   public codegenerate(){}

    public void writercodegenerate(String name, ProgramNode tree) {
        StringBuilder htmlSb = new StringBuilder();
        StringBuilder jsSb = new StringBuilder();
        boolean hasHtml = false;
        boolean hasJs = false;

        for (Node child : tree.getNodes()) {
            if (child instanceof HtmlNode) {
                hasHtml = true;
                HtmlNode htmlNode = (HtmlNode) child;
                htmlSb.append(htmlNode.codegenerate()).append("\n");
            } else {
                hasJs = true;
                jsSb.append(child.codegenerate()).append("\n");
            }
        }

        if (hasHtml) {
            writehtmlpage(htmlSb.toString(), name);
        }

        if (hasJs) {
            writejspage(jsSb.toString(), name);
        }

        if (!hasHtml && !hasJs) {
            System.out.println("❌ No nodes found, no file generated.");
        }
    }
    public void writehtmlpage(String bodyContent, String filename) {
        if (!filename.toLowerCase().endsWith(".html")) {
            filename += ".html";
        }

        File file = new File("codegenerate\\" + filename);
        String htmlContent;

        if (file.exists()) {

            try {
                String existing = new String(Files.readAllBytes(file.toPath()));
                htmlContent = existing.replace("</body>", bodyContent + "\n</body>");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            htmlContent = "<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n" +
                    "  <meta charset=\"UTF-8\">\n" +
                    "  <title>" + filename + "</title>\n</head>\n<body>\n" +
                    bodyContent + "\n</body>\n</html>";
        }

        try (FileWriter writer = new FileWriter(file, false)) { // false → overwrite بعد التعديل
            writer.write(htmlContent);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("✅ HTML generated/updated: " + filename);
    }

    public void writejspage(String jsContent, String filename) {
        if (!filename.toLowerCase().endsWith(".js")) {
            filename += ".js";
        }

        try (FileWriter writer = new FileWriter("codegenerate\\" + filename)) { // true → append
            writer.write(jsContent + "\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("✅ JS generated in: " + filename);
    }
}
