
package cc.mrbird.febs.webService.OwnToOwn;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IScmJobService", targetNamespace = "http://ScmJob.webService.febs.mrbird.cc/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IScmJobService {


    /**
     * 
     * @return
     *     returns java.util.List<cc.mrbird.febs.webService.OwnToOwn.User>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUserWithoutOpenid", targetNamespace = "http://ScmJob.webService.febs.mrbird.cc/", className = "cc.mrbird.febs.webService.OwnToOwn.GetUserWithoutOpenid")
    @ResponseWrapper(localName = "getUserWithoutOpenidResponse", targetNamespace = "http://ScmJob.webService.febs.mrbird.cc/", className = "cc.mrbird.febs.webService.OwnToOwn.GetUserWithoutOpenidResponse")
    public List<User> getUserWithoutOpenid();

    /**
     * 
     * @return
     *     returns java.util.List<cc.mrbird.febs.webService.OwnToOwn.VMsgFilevalidinfo>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getFileValidMsg", targetNamespace = "http://ScmJob.webService.febs.mrbird.cc/", className = "cc.mrbird.febs.webService.OwnToOwn.GetFileValidMsg")
    @ResponseWrapper(localName = "getFileValidMsgResponse", targetNamespace = "http://ScmJob.webService.febs.mrbird.cc/", className = "cc.mrbird.febs.webService.OwnToOwn.GetFileValidMsgResponse")
    public List<VMsgFilevalidinfo> getFileValidMsg();

    /**
     * 
     * @return
     *     returns java.util.List<cc.mrbird.febs.webService.OwnToOwn.VMsgGysysauditnot>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getGysysauditNot", targetNamespace = "http://ScmJob.webService.febs.mrbird.cc/", className = "cc.mrbird.febs.webService.OwnToOwn.GetGysysauditNot")
    @ResponseWrapper(localName = "getGysysauditNotResponse", targetNamespace = "http://ScmJob.webService.febs.mrbird.cc/", className = "cc.mrbird.febs.webService.OwnToOwn.GetGysysauditNotResponse")
    public List<VMsgGysysauditnot> getGysysauditNot();

    /**
     * 
     * @return
     *     returns java.util.List<cc.mrbird.febs.webService.OwnToOwn.VMsgOrderinfomodify>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getOrderModifyMsg", targetNamespace = "http://ScmJob.webService.febs.mrbird.cc/", className = "cc.mrbird.febs.webService.OwnToOwn.GetOrderModifyMsg")
    @ResponseWrapper(localName = "getOrderModifyMsgResponse", targetNamespace = "http://ScmJob.webService.febs.mrbird.cc/", className = "cc.mrbird.febs.webService.OwnToOwn.GetOrderModifyMsgResponse")
    public List<VMsgOrderinfomodify> getOrderModifyMsg();

    /**
     * 
     * @return
     *     returns java.util.List<cc.mrbird.febs.webService.OwnToOwn.VMsgGysysaudit>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getGysysaudit", targetNamespace = "http://ScmJob.webService.febs.mrbird.cc/", className = "cc.mrbird.febs.webService.OwnToOwn.GetGysysaudit")
    @ResponseWrapper(localName = "getGysysauditResponse", targetNamespace = "http://ScmJob.webService.febs.mrbird.cc/", className = "cc.mrbird.febs.webService.OwnToOwn.GetGysysauditResponse")
    public List<VMsgGysysaudit> getGysysaudit();

    /**
     * 
     * @return
     *     returns java.util.List<cc.mrbird.febs.webService.OwnToOwn.VMsgVendoraudit>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getVendoraudit", targetNamespace = "http://ScmJob.webService.febs.mrbird.cc/", className = "cc.mrbird.febs.webService.OwnToOwn.GetVendoraudit")
    @ResponseWrapper(localName = "getVendorauditResponse", targetNamespace = "http://ScmJob.webService.febs.mrbird.cc/", className = "cc.mrbird.febs.webService.OwnToOwn.GetVendorauditResponse")
    public List<VMsgVendoraudit> getVendoraudit();

    /**
     * 
     * @return
     *     returns java.util.List<cc.mrbird.febs.webService.OwnToOwn.VMsgOrderinfo>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getOrderMsg", targetNamespace = "http://ScmJob.webService.febs.mrbird.cc/", className = "cc.mrbird.febs.webService.OwnToOwn.GetOrderMsg")
    @ResponseWrapper(localName = "getOrderMsgResponse", targetNamespace = "http://ScmJob.webService.febs.mrbird.cc/", className = "cc.mrbird.febs.webService.OwnToOwn.GetOrderMsgResponse")
    public List<VMsgOrderinfo> getOrderMsg();

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "setUserOpenid", targetNamespace = "http://ScmJob.webService.febs.mrbird.cc/", className = "cc.mrbird.febs.webService.OwnToOwn.SetUserOpenid")
    @ResponseWrapper(localName = "setUserOpenidResponse", targetNamespace = "http://ScmJob.webService.febs.mrbird.cc/", className = "cc.mrbird.febs.webService.OwnToOwn.SetUserOpenidResponse")
    public void setUserOpenid(
        @WebParam(name = "arg0", targetNamespace = "")
        List<User> arg0);

    /**
     * 
     * @return
     *     returns java.util.List<cc.mrbird.febs.webService.OwnToOwn.VMsgPlanundo>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPlanundo", targetNamespace = "http://ScmJob.webService.febs.mrbird.cc/", className = "cc.mrbird.febs.webService.OwnToOwn.GetPlanundo")
    @ResponseWrapper(localName = "getPlanundoResponse", targetNamespace = "http://ScmJob.webService.febs.mrbird.cc/", className = "cc.mrbird.febs.webService.OwnToOwn.GetPlanundoResponse")
    public List<VMsgPlanundo> getPlanundo();

    /**
     * 
     * @return
     *     returns java.util.List<cc.mrbird.febs.webService.OwnToOwn.VMsgQuerypriceinfo>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getQueryPriceMsg", targetNamespace = "http://ScmJob.webService.febs.mrbird.cc/", className = "cc.mrbird.febs.webService.OwnToOwn.GetQueryPriceMsg")
    @ResponseWrapper(localName = "getQueryPriceMsgResponse", targetNamespace = "http://ScmJob.webService.febs.mrbird.cc/", className = "cc.mrbird.febs.webService.OwnToOwn.GetQueryPriceMsgResponse")
    public List<VMsgQuerypriceinfo> getQueryPriceMsg();

    /**
     * 
     * @return
     *     returns java.util.List<cc.mrbird.febs.webService.OwnToOwn.VMsgReportinfo>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getReportMsg", targetNamespace = "http://ScmJob.webService.febs.mrbird.cc/", className = "cc.mrbird.febs.webService.OwnToOwn.GetReportMsg")
    @ResponseWrapper(localName = "getReportMsgResponse", targetNamespace = "http://ScmJob.webService.febs.mrbird.cc/", className = "cc.mrbird.febs.webService.OwnToOwn.GetReportMsgResponse")
    public List<VMsgReportinfo> getReportMsg();

    /**
     * 
     * @return
     *     returns java.util.List<cc.mrbird.febs.webService.OwnToOwn.VMsgMaterinfovalid>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getMaterValidMsg", targetNamespace = "http://ScmJob.webService.febs.mrbird.cc/", className = "cc.mrbird.febs.webService.OwnToOwn.GetMaterValidMsg")
    @ResponseWrapper(localName = "getMaterValidMsgResponse", targetNamespace = "http://ScmJob.webService.febs.mrbird.cc/", className = "cc.mrbird.febs.webService.OwnToOwn.GetMaterValidMsgResponse")
    public List<VMsgMaterinfovalid> getMaterValidMsg();

}