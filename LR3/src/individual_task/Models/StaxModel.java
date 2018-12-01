package individual_task.Models;

import javax.xml.stream.*;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class StaxModel {

    XMLOutputFactory xmlOutputFactory;
    XMLStreamWriter xmlStreamWriter;
    StringWriter stringWriter;

    XMLInputFactory factory;
    XMLEventReader eventReader;

    public StaxModel() throws XMLStreamException {
        this.stringWriter = new StringWriter();
        this.xmlOutputFactory = XMLOutputFactory.newFactory();
        this.xmlStreamWriter = xmlOutputFactory.createXMLStreamWriter(stringWriter);
    }

    public StaxModel createDocument() throws XMLStreamException {
        xmlStreamWriter.writeStartDocument();

        return this;
    }

    public StaxModel StartCategory(String name) throws XMLStreamException {
        xmlStreamWriter.writeStartElement("Category");
        xmlStreamWriter.writeAttribute("name", name);

        return this;
    }

    public StaxModel StartCategories() throws XMLStreamException {
        xmlStreamWriter.writeStartElement("Categories");

        return this;
    }

    public StaxModel EndCategories() throws XMLStreamException {
        xmlStreamWriter.writeEndElement();

        return this;
    }


    public StaxModel CreateFlower(String name, String type) throws XMLStreamException {
        xmlStreamWriter.writeStartElement("Flower");
        xmlStreamWriter.writeAttribute("name", name);
        xmlStreamWriter.writeAttribute("type", type);
        xmlStreamWriter.writeEndElement();

        return this;
    }

    public StaxModel EndCategory() throws XMLStreamException {
        xmlStreamWriter.writeEndElement();
        return this;
    }

    public StaxModel endDocument() throws XMLStreamException {
        xmlStreamWriter.writeEndDocument();

        xmlStreamWriter.flush();
        xmlStreamWriter.close();

        return this;
    }

    public void writeToFile(String path) throws IOException {
        Files.deleteIfExists(Paths.get(path));

        BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
        writer.append(stringWriter.getBuffer().toString());


        writer.close();
    }

    public List<Category> parse(String path) throws FileNotFoundException, XMLStreamException {
        factory = XMLInputFactory.newInstance();

        XMLEventReader eventReader = factory.createXMLEventReader(new FileReader(path));

        List<Category> categories = new ArrayList<>();
        Category category = new Category();
        Flower flower = new Flower();

        while (eventReader.hasNext()) {
            XMLEvent event = eventReader.nextEvent();

            StartElement startElement;
            EndElement endElement;
            String qName;

            switch (event.getEventType()) {
                case XMLStreamConstants.END_ELEMENT: {
                    endElement = event.asEndElement();
                    qName = endElement.getName().getLocalPart();

                    if (qName.equalsIgnoreCase("category")) {
                        categories.add(category);
                    }

                    if (qName.equalsIgnoreCase("flower")) {
                        category.flowers.add(flower);
                    }
                    break;
                }

                case XMLStreamConstants.START_ELEMENT:
                    startElement = event.asStartElement();

                    qName = startElement.getName().getLocalPart();
                    if (qName.equalsIgnoreCase("categories")) {
                        categories = new ArrayList<>();
                    } else {
                        if (qName.equalsIgnoreCase("category")) {
                            category = new Category();

                            Iterator<Attribute> attributeIterator = startElement.getAttributes();

                            while (attributeIterator.hasNext()) {
                                Attribute attribute = attributeIterator.next();

                                category.setName(attribute.getValue());
                            }

                        } else {
                            if (qName.equalsIgnoreCase("flower")) {
                                flower = new Flower();

                                Iterator<Attribute> attributeIterator = startElement.getAttributes();

                                while (attributeIterator.hasNext()) {
                                    Attribute attribute = attributeIterator.next();

                                    if (attribute.getName().toString().equals("name")) {
                                        flower.setName(attribute.getValue());
                                    }

                                    if (attribute.getName().toString().equals("type")) {
                                        flower.setType(attribute.getValue());
                                    }
                                }
                            }
                        }
                    }
                    break;
            }
        }

        return categories;

    }
}
