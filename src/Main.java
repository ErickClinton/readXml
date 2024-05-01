
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Main {
    public  static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();

        Document doc = builder.parse("person.xml");
        NodeList listPerson = doc.getElementsByTagName("pessoa");

        for(int i=0; i<listPerson.getLength();i++){
            Node personItem = listPerson.item(i);
            if (personItem.getNodeType() == Node.ELEMENT_NODE) {

                Node elementPerson = findInformationId(personItem);
                NodeList listChildrenPerson = elementPerson.getChildNodes();
                for (int indexChildren=0 ; indexChildren<listChildrenPerson.getLength();indexChildren++){
                    findInformationChildren(listChildrenPerson,indexChildren);
                }
            }
        }
    }

    private static Node findInformationId(Node personItem){
        Element elementPerson = (Element) personItem;
        String id = elementPerson.getAttribute("id");

        System.out.println(id);

        return elementPerson;
    }

    private static void findInformationChildren(NodeList listChildrenPerson, int indexChildren){
        Node children = listChildrenPerson.item(indexChildren);
        if(children.getNodeType() == Node.ELEMENT_NODE){
            Element elementChildren = (Element) children;

            switch (elementChildren.getTagName()){
                case "nome":
                    System.out.println(elementChildren.getTextContent());
                    break;
                case "idade":
                    System.out.println(elementChildren.getTextContent());
                    break;
                case "peso":
                    System.out.println(elementChildren.getTextContent());
                    break;
            }
        }
    }

}