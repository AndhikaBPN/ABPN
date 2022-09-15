package latihan.restassured;

public class UrlSOAPExample {
//	https://www.baeldung.com/java-soap-web-service
	/*
	 * <?xml version="1.0" encoding="UTF-8"?>
<definitions <!-- namespace declarations -->
    targetNamespace="http://server.ws.soap.baeldung.com/" name="CountryServiceImplService">
    <types>
        <xsd:schema>
            <xsd:import namespace="http://server.ws.soap.baeldung.com/" 
              schemaLocation="http://localhost:8888/ws/country?xsd=1"></xsd:import>
        </xsd:schema>
    </types>
    <message name="findByName">
        <part name="arg0" type="xsd:string"></part>
    </message>
    <message name="findByNameResponse">
        <part name="return" type="tns:country"></part>
    </message>
    <portType name="CountryService">
        <operation name="findByName">
            <input wsam:Action="http://server.ws.soap.baeldung.com/CountryService/findByNameRequest" 
              message="tns:findByName"></input>
            <output wsam:Action="http://server.ws.soap.baeldung.com/CountryService/findByNameResponse" 
              message="tns:findByNameResponse"></output>
        </operation>
    </portType>
    <binding name="CountryServiceImplPortBinding" type="tns:CountryService">
        <soap:binding transport="http://schemas.xmlsoap.org/soap/http" style="rpc"></soap:binding>
        <operation name="findByName">
            <soap:operation soapAction=""></soap:operation>
            <input>
                <soap:body use="literal" namespace="http://server.ws.soap.baeldung.com/"></soap:body>
            </input>
            <output>
                <soap:body use="literal" namespace="http://server.ws.soap.baeldung.com/"></soap:body>
            </output>
        </operation>
    </binding>
    <service name="CountryServiceImplService">
        <port name="CountryServiceImplPort" binding="tns:CountryServiceImplPortBinding">
            <soap:address location="http://localhost:8888/ws/country"></soap:address>
        </port>
    </service>
</definitions>

plugin> 
    <groupId>org.codehaus.mojo</groupId>
    <artifactId>jaxws-maven-plugin</artifactId>
    <version>2.6</version>
    <executions> 
        <execution> 
            <id>wsimport-from-jdk</id>
            <goals>
                <goal>wsimport</goal>
            </goals>
        </execution>
    </executions>
    <configuration>
        <wsdlUrls>
            <wsdlUrl>http://localhost:8888/ws/country?wsdl</wsdlUrl> 
        </wsdlUrls>
        <keep>true</keep> 
        <packageName>com.baeldung.soap.ws.client.generated</packageName> 
        <sourceDestDir>src/main/java</sourceDestDir>
    </configuration>
</plugin>
	 */
}