package codegenerate;

import AST.Nodes.HtmlNode;
import AST.Nodes.Node;
import AST.Nodes.ProgramNode;

import java.io.FileWriter;
import java.io.IOException;

public class codegenerate {

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
                // أي عقدة أخرى تعتبر JS
                hasJs = true;
                jsSb.append(child.codegenerate()).append("\n");
            }
        }

        // كتابة ملف HTML إذا كان هناك HTMLNode
        if (hasHtml) {
            writehtmlpage(htmlSb.toString(), name);
        }

        // كتابة ملف JS إذا كان هناك عقدة غير HTMLNode
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

        String htmlContent = "<!DOCTYPE html>\n<html lang=\"en\">\n" +
                "<head>\n" +
                "  <meta charset=\"UTF-8\">\n" +
                "  <title>" + filename + "</title>\n" +
                "</head>\n<body>\n" +
                bodyContent +
                "\n</body>\n</html>";

        try (FileWriter writer = new FileWriter("codegenerate\\" + filename, false)) { // false → overwrite
            writer.write(htmlContent);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("✅ HTML generated in: " + filename);
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
