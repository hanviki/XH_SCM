
package cc.mrbird.febs.webService.OwnToOwn;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ScmJobImplService", targetNamespace = "urn:ScmJob.webService.febs.mrbird.cc", wsdlLocation = "http://testscmapi.whuh.com/webservice/sjob?wsdl")
public class ScmJobImplService
    extends Service
{

    private final static URL SCMJOBIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException SCMJOBIMPLSERVICE_EXCEPTION;
    private final static QName SCMJOBIMPLSERVICE_QNAME = new QName("urn:ScmJob.webService.febs.mrbird.cc", "ScmJobImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://testscmapi.whuh.com/webservice/sjob?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SCMJOBIMPLSERVICE_WSDL_LOCATION = url;
        SCMJOBIMPLSERVICE_EXCEPTION = e;
    }

    public ScmJobImplService() {
        super(__getWsdlLocation(), SCMJOBIMPLSERVICE_QNAME);
    }

    public ScmJobImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SCMJOBIMPLSERVICE_QNAME, features);
    }

    public ScmJobImplService(URL wsdlLocation) {
        super(wsdlLocation, SCMJOBIMPLSERVICE_QNAME);
    }

    public ScmJobImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SCMJOBIMPLSERVICE_QNAME, features);
    }

    public ScmJobImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ScmJobImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IScmJobService
     */
    @WebEndpoint(name = "sapPort")
    public IScmJobService getSapPort() {
        return super.getPort(new QName("urn:ScmJob.webService.febs.mrbird.cc", "sapPort"), IScmJobService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IScmJobService
     */
    @WebEndpoint(name = "sapPort")
    public IScmJobService getSapPort(WebServiceFeature... features) {
        return super.getPort(new QName("urn:ScmJob.webService.febs.mrbird.cc", "sapPort"), IScmJobService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SCMJOBIMPLSERVICE_EXCEPTION!= null) {
            throw SCMJOBIMPLSERVICE_EXCEPTION;
        }
        return SCMJOBIMPLSERVICE_WSDL_LOCATION;
    }

}