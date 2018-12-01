package general_team_task.Entities;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.File;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public class XmlDom {
    private TransformerFactory transformerFactory;
    private Transformer transformer;
    private DocumentBuilderFactory factory;
    private DocumentBuilder builder;
    private Document document;
    private XPath xPath;

    public XmlDom() throws ParserConfigurationException {
        this.factory = DocumentBuilderFactory.newInstance();
        this.builder = this.factory.newDocumentBuilder();

        this.xPath = XPathFactory.newInstance().newXPath();
    }

    public XmlDom createDocument() {
        this.document = this.builder.newDocument();

        return this;
    }

    public XmlDom createStudentList() throws XPathExpressionException {
        if (!isStudentListExistsInDocument()) {
            Element studentList = this.document.createElement("Students");

            this.document.appendChild(studentList);
        }

        return this;
    }

    public XmlDom AddStudent(String _fio, String _class, int _age, Mark... _marks) throws XPathExpressionException {
        if (isStudentListExistsInDocument()) {
            Element studentList = (Element) xPath.compile("Students").evaluate(this.document, XPathConstants.NODE);

            Element student = this.document.createElement("Student");
            Element marks;

            setStudentAttributes(student, _fio, _age, _class);

            if ((marks = setStudentMarks(_marks)) != null) {
                student.appendChild(marks);
            }

            studentList.appendChild(student);
        }

        return this;
    }

    public XmlDom RemoveStudent(String fio) throws XPathExpressionException {
        if (isStudentListExistsInDocument()) {
            Element studentList = (Element) this.document.getFirstChild();

            Element removableStudent = (Element) xPath
                    .compile(
                            MessageFormat.format("/Students/Student[@fio=''{0}'']", fio)
                    )
                    .evaluate(this.document, XPathConstants.NODE);

            if (removableStudent != null) {
                studentList.removeChild(removableStudent);
            }

        }

        return this;
    }

    private Element setStudentMarks(Mark... _marks) {
        Element marks = null;

        if (_marks != null) {
            if (_marks.length > 0) {
                marks = this.document.createElement("Marks");

                for (Mark m : _marks) {
                    Element mark = document.createElement("Mark");

                    setMarkAttributes(m, mark);

                    marks.appendChild(mark);
                }
            }
        }

        return marks;
    }

    private void setMarkAttributes(Mark m, Element mark) {
        mark.setAttribute("subject", m.getSubject());
        mark.setAttribute("value", String.valueOf(m.getValue()));
    }

    private void setStudentAttributes(Element student, String _fio, int _age, String _class) {
        student.setAttribute("fio", _fio);
        student.setAttribute("class", _class);
        student.setAttribute("age", String.valueOf(_age));
    }

    private boolean isStudentListExistsInDocument() throws XPathExpressionException {
        if (this.document.hasChildNodes()) {
            Node node = (Node) xPath.compile("Students").evaluate(this.document, XPathConstants.NODE);

            return node != null;
        }

        return false;
    }

    public XmlDom WriteToFile(String path) throws TransformerException {
        this.transformerFactory = TransformerFactory.newInstance();
        this.transformer = this.transformerFactory.newTransformer();
        this.transformer.setOutputProperty(OutputKeys.INDENT, "yes");

        DOMSource domSource = new DOMSource(this.document);

        StreamResult streamResult = new StreamResult(new File(path));
        transformer.transform(domSource, streamResult);

        return this;
    }
    public XmlDom Parse(String filePath) throws IOException, SAXException, XPathExpressionException {
        this.document = this.builder.parse(filePath);

        this.document.normalize();

        return this;
    }

    public List<Student> getData() throws XPathExpressionException {
        return GenerateList();
    }

    private List<Student> GenerateList() throws XPathExpressionException {
        List<Student> studentList = null;

        if(this.document.hasChildNodes()){
            if(this.document.getDocumentElement().hasChildNodes()){
                studentList = new ArrayList<>();

                parseStudents(studentList);
            }
        }

        return studentList;
    }

    private void parseStudents(List<Student> studentList) throws XPathExpressionException {
        NodeList xmlStudents = (NodeList) xPath
                .compile("/Students/Student")
                .evaluate(this.document, XPathConstants.NODESET);

        for (int i = 0; i < xmlStudents.getLength(); i++) {
            Element xmlStudent = (Element) xmlStudents.item(i);

            Student student = new Student(
                    xmlStudent.getAttribute("fio"),
                    xmlStudent.getAttribute("class"),
                    Integer.parseInt(xmlStudent.getAttribute("age"))
            );

            if(xmlStudent.hasChildNodes()){
                parseXmlMarks(i, xmlStudent, student);
            }
            studentList.add(student);
        }
    }

    private void parseXmlMarks(int i, Element xmlStudent, Student student) throws XPathExpressionException {
        NodeList xmlMarks = (NodeList) xPath
                .compile(MessageFormat.format("/Students/Student[@fio=''{0}'']/Marks/Mark",student.getFIO()))
                .evaluate(this.document, XPathConstants.NODESET);
        for (int j = 0; j < xmlMarks.getLength(); j++) {
            Element xmlMark = (Element) xmlMarks.item(j);

            Mark mark = new Mark(
                    xmlMark.getAttribute("subject"),
                    Integer.parseInt(xmlMark.getAttribute("value"))
            );
            
            student.addMark(mark);
        }
    }
}
