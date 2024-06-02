package lr8.task1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import java.io.File;

public class MyCreateXmlFile {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("tasks");
            doc.appendChild(rootElement);

            Element task1 = doc.createElement("task");
            rootElement.appendChild(task1);

            Element name1 = doc.createElement("title");
            name1.appendChild(doc.createTextNode("Погулять с собакой"));
            task1.appendChild(name1);

            Element deadline1 = doc.createElement("deadline");
            deadline1.appendChild(doc.createTextNode("17:00, 02.06.2024"));
            task1.appendChild(deadline1);

            Element task2 = doc.createElement("task");
            rootElement.appendChild(task2);

            Element name2 = doc.createElement("title");
            name2.appendChild(doc.createTextNode("Поиграть с кошкой"));
            task2.appendChild(name2);

            Element deadline2 = doc.createElement("deadline");
            deadline2.appendChild(doc.createTextNode("20:00, 02.06.2024"));
            task2.appendChild(deadline2);

            doc.setXmlStandalone(true);
            doc.normalizeDocument();
            javax.xml.transform.TransformerFactory tf = javax.xml.transform.TransformerFactory.newInstance();
            javax.xml.transform.Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            javax.xml.transform.dom.DOMSource source = new javax.xml.transform.dom.DOMSource(doc);
            javax.xml.transform.stream.StreamResult result = new javax.xml.transform.stream.StreamResult(new File("src/lr8/task1/my_example.xml"));
            transformer.transform(source, result);
            System.out.println("XML-файл успешно создан!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
