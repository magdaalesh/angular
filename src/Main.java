import AST.Nodes.ProgramNode;
import AST.Visitor.BaseVisitor;
import gen.lexicalanalysis;
import gen.myParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import sementicserror.handleerror;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.antlr.v4.runtime.CharStreams.fromFileName;
public class Main {
    public static void main(String[] args) throws IOException {
        String source ="test01.txt";
        String source2 ="test02.txt";
        String source3 ="test03.txt";
        String source4 ="test04.txt";
        String source5 ="test05.txt";
        String source6 ="test06.txt";
        String source7 ="test07.txt";
        List<String> programm = new ArrayList<>();
        programm.add(source);
        programm.add(source2);
        programm.add(source3);
        programm.add(source4);
        programm.add(source5);
        programm.add(source6);
        programm.add(source7);
        handleerror handle = handleerror.getInstance();
        for (int i=0 ;i< programm.size() ;i++){
            System.out.println(programm.get(i));
        CharStream cs = fromFileName(programm.get(i));
        lexicalanalysis lexer = new lexicalanalysis(cs);
        CommonTokenStream token = new CommonTokenStream(lexer);
        myParser parser = new myParser(token);
        ParseTree tree = parser.program();
        ProgramNode doc = (ProgramNode) new BaseVisitor(handle.getSymboles()).visit(tree);
        System.out.println("Start AST tree");
        System.out.println(doc);
        System.out.println("END");}
        handle.generateErrorFile();
        handle.printSymboletable();
//        onlyonecomponentsymboltyble componentSymbolTable= new onlyonecomponentsymboltyble();
//        System.out.println(componentSymbolTable.getSymbole().toString());
//        System.out.println("Abstract Syntax Tree (AST):\n");
//        BaseVisitor visitor = new BaseVisitor();
//        visitor.printAST(tree, parser);



//        SymbolTable symbolTable = visitor.getSymbolTable();

    }


    }

