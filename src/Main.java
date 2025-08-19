import AST.Nodes.ProgramNode;
import AST.Visitor.BaseVisitor;
import gen.lexicalanalysis;
import gen.myParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import sementicserror.*;
import java.io.IOException;
import static org.antlr.v4.runtime.CharStreams.fromFileName;
public class Main {
    public static void main(String[] args) throws IOException {
        String source = "test4.txt";
        handleerror handle = handleerror.getInstance();
        CharStream cs = fromFileName(source);
        lexicalanalysis lexer = new lexicalanalysis(cs);
        CommonTokenStream token = new CommonTokenStream(lexer);
        myParser parser = new myParser(token);
        ParseTree tree = parser.program();
        ProgramNode doc = (ProgramNode) new BaseVisitor(handle.getSymboles()).visit(tree);
        System.out.println("Start AST tree");
        System.out.println(doc);
        System.out.println("END");
        handle.generateErrorFile();
//        handle.printSymboletable();
//        onlyonecomponentsymboltyble componentSymbolTable= new onlyonecomponentsymboltyble();
//        System.out.println(componentSymbolTable.getSymbole().toString());
//        System.out.println("Abstract Syntax Tree (AST):\n");
//        BaseVisitor visitor = new BaseVisitor();
//        visitor.printAST(tree, parser);



//        SymbolTable symbolTable = visitor.getSymbolTable();

    }


    }

