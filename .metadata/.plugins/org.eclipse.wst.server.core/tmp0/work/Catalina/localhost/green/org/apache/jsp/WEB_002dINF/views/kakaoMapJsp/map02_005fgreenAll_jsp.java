/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.41
 * Generated at: 2022-01-10 04:20:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.kakaoMapJsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class map02_005fgreenAll_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("jar:file:/D:/MTest/MyWork/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Spring02/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("jar:file:/D:/MTest/MyWork/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Spring02/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1640065543731L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("  \r\n");
      out.write(" \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>** kakaoMap02_주소를 좌표로 변환하여 위치와 설명 표시 **</title>\r\n");
      out.write("<script src=\"resources/myLib/jquery-3.2.1.min.js\"></script>\r\n");
      out.write("<style>\r\n");
      out.write("/* ** info Design ** */\r\n");
      out.write(".label {margin-bottom: 96px;}\r\n");
      out.write(".label * {display:inline-block; vertical-align:middle;}\r\n");
      out.write(".label .left {background: url(\"http://t1.daumcdn.net/localimg/localimages/07/2011/map/storeview/tip_l.png\") no-repeat;display: inline-block;height: 20px;overflow: hidden;vertical-align:middle;width: 7px;}\r\n");
      out.write(".label .center {background: url(http://t1.daumcdn.net/localimg/localimages/07/2011/map/storeview/tip_bg.png) repeat-x;display: inline-block;height: 20px;font-size: 12px;font-weight:bold;line-height: 12px;}\r\n");
      out.write(".label .right {background: url(\"http://t1.daumcdn.net/localimg/localimages/07/2011/map/storeview/tip_r.png\") -1px 0  no-repeat;display: inline-block;height: 20px;overflow: hidden;width: 6px;}\r\n");
      out.write("</style>\t\t\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<h2>** Map Test02 : 주소를 좌표로 변환하여 위치와 설명 표시 **</h2>\r\n");
      out.write("<br><hr>\r\n");
      out.write("<div id=\"map\" style=\"width:90%;height:400px;\"></div>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" \r\n");
      out.write("\t\tsrc=\"//dapi.kakao.com/v2/maps/sdk.js?appkey=dd110a227c3d8de36931003064d64525&libraries=services\">\r\n");
      out.write("</script>\r\n");
      out.write("<script>\r\n");
      out.write("// 이 스크립트는 BODY 영역에 작성 한다. \r\n");
      out.write("var mapContainer = document.getElementById('map'), // 지도를 표시할 div \r\n");
      out.write("    mapOption = {\r\n");
      out.write("        center: new kakao.maps.LatLng(33.450701, 126.570667), // 지도의 중심좌표\r\n");
      out.write("        level: 3 // 지도의 확대 레벨\r\n");
      out.write("    };  \r\n");
      out.write("// 지도를 생성합니다    \r\n");
      out.write("var map = new kakao.maps.Map(mapContainer, mapOption); \r\n");
      out.write("\r\n");
      out.write("// Test Data -> 주소와 Info\r\n");
      out.write("// From DB Data -> json 형태로 전달되면 ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Lemon}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" 처럼 전달 가능\r\n");
      out.write("// var add=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Lemon}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(";\r\n");
      out.write("// var addrs = add;\r\n");
      out.write("\r\n");
      out.write("var addrs = [\r\n");
      out.write("\t\t{ content:'성남1',  // 마커 롤오버시 표시할 내용\r\n");
      out.write("\t\t  addr:'경기 성남시 분당구 구미동 7-2 (돌마로 46) 5층' },\r\n");
      out.write("\t\t{ content:'성남2',   \r\n");
      out.write("\t\t  addr:'경기 성남시 분당구 금곡동 167 (돌마로 47) 이코노샤르망 4층' },  \r\n");
      out.write("\t\t{ content:'강남1',  \r\n");
      out.write("\t\t  addr:'서울시 강남구 역삼동 815-4 (강남대로 428) 만이빌딩 4층, 9층' },\r\n");
      out.write("\t\t{ content:'강남2',  \r\n");
      out.write("\t\t  addr:'서울시 강남구 역삼동 649-14 (테헤란로 119) 대호빌딩 8층' },\r\n");
      out.write("\t\t{ content:'수원1',  \r\n");
      out.write("\t\t  addr:'경기도 수원시 팔달구 매산로 1가 55-3 (매산로 12-1) 3~4층' },\r\n");
      out.write("\t\t{ content:'수원2',   \r\n");
      out.write("\t\t  addr:'경기도 수원시 팔달구 매산로1가 11-12, 아이메카빌딩 5층, 11층' },  \r\n");
      out.write("\t\t{ content:'안양',   \r\n");
      out.write("\t\t  addr:'경기 안양시 만안구 안양 4동 676 - 91 (안양로 303) 안양메쎄타워 2F' }\r\n");
      out.write("\t];\r\n");
      out.write("\r\n");
      out.write("// 주소-좌표 변환 객체를 생성합니다\r\n");
      out.write("var geocoder = new kakao.maps.services.Geocoder();\r\n");
      out.write("\r\n");
      out.write("// 지도의 중심좌표를 표시 위치에 따라 재설정 하기위한 bounds 생성\t\r\n");
      out.write("var bounds = new kakao.maps.LatLngBounds();\t\r\n");
      out.write("// lat : 위도(latitude) , lng [long] : 경도(longitude)\r\n");
      out.write("// coordinate [coords] :  1.조직, 편성하다  2.(몸의 움직임을) 조정하다 \r\n");
      out.write("//                        3.(옷차림가구 등) 꾸미다[코디하다], 잘 어울리다[조화되다]\r\n");
      out.write("//                        4.수학 에서 좌표\r\n");
      out.write("\r\n");
      out.write("// 주소를 좌표로 전환하기 \r\n");
      out.write("// => geocoder.addressSearch(...) 는 콜백함수를 사용하기 때문에 \r\n");
      out.write("//    배열 addrs가 addr 하나의 데이터 속성만 있다면 무관 하지만 \r\n");
      out.write("//    위의 경우처럼 content 가 있는경우에는 이 content 값은 마지막 값만 볼수 있게 된다\r\n");
      out.write("//    왜냐하면 반복문이 실행되는 동안 콜백 함수는 자신의 매개변수들을 차곡 차곡 보관해 놓고, \r\n");
      out.write("//    반복문이 종료되어 더이상 매개변수가 전달되지 않으면 하나씩 실행이 시작되는 구조 이기 때문에\r\n");
      out.write("//    이 상황에서 i 는 마지막 값이고, content 역시 마지막 값이므로... \r\n");
      out.write("// => 해결은 여러가지가 있겠지만, 데이터의 구조와 특징에 따라 구현하는것이 좋을듯\r\n");
      out.write("// => https://devtalk.kakao.com/t/addresssearch/44163/4\r\n");
      out.write("\r\n");
      out.write("var total = addrs.length;\r\n");
      out.write("var counter = 0;\r\n");
      out.write("\r\n");
      out.write("// Version01 -> i 대신 counter 변수를 사용하여 한번에 처리\r\n");
      out.write("// => 오류 : JS 의 콜백함수는 비동기 실행 을 하기 때문에  일정 순서대로 실행되지 않기 때문에\r\n");
      out.write("//          content 값의 순서와 다르다.\r\n");
      out.write("// => 결론 : DB에 자료를 보관할때 주소와 좌표를 모두 보관해야 정확하게 info를 DB에서 읽어 표시할 수 있다. \r\n");
      out.write("for(var i=0; i<total; i++) {\r\n");
      out.write("\tvar address=addrs[i].addr ;\r\n");
      out.write("\tgeocoder.addressSearch(address, function(result, status) {\r\n");
      out.write("\t\tif (status === kakao.maps.services.Status.OK) {\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar coords = new kakao.maps.LatLng(result[0].y, result[0].x);\r\n");
      out.write("\t\t\tconsole.log('i='+i+'yLat[i]='+result[0].y+'xLng[i]='+result[0].x);\r\n");
      out.write("\t\t\tconsole.log('address='+address);\r\n");
      out.write("\r\n");
      out.write("\t\t\tvar marker = new kakao.maps.Marker({\r\n");
      out.write("\t\t\t\tmap: map,\r\n");
      out.write("\t\t\t\tposition: coords\r\n");
      out.write("\t\t\t}); // marker\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t// marking 좌표를 포함하도록 영역 정보를 확장한다.\r\n");
      out.write("\t\t\tbounds.extend(coords);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t// 인포윈도우로 장소에 대한 설명을 표시합니다 \r\n");
      out.write("\t\t\t//var content = addrs[counter].content;\r\n");
      out.write("\t\t\t/* 인포윈도우 : BigBox 참고\r\n");
      out.write("\t\t\tvar content = '<div class =\"label\"><span class=\"left\"></span><span class=\"center\">'\r\n");
      out.write("\t\t\t\t+addrs[counter].content+'<br><a href=\"https://map.kakao.com/link/map/'\r\n");
      out.write("\t\t\t\t+addrs[counter].content+','+result[0].y+','+result[0].x\r\n");
      out.write("\t\t\t\t+'\" style=\"color:blue\" target=\"_blank\">Click</a></span><span class=\"right\"></span></div>';\r\n");
      out.write("\t\t\t*/\r\n");
      out.write("\t\t\t// 인포윈도우 : info & link\r\n");
      out.write("\t\t\tvar content = '<div class =\"label\"><span class=\"left\"></span><span class=\"center\">'\r\n");
      out.write("\t\t\t\t+'<a href=\"https://map.kakao.com/link/map/'\r\n");
      out.write("\t\t\t\t+addrs[counter].content+','+result[0].y+','+result[0].x\r\n");
      out.write("\t\t\t\t+'\" style=\"color:blue\" target=\"_blank\">'+addrs[counter].content+'</a></span><span class=\"right\"></span></div>';\r\n");
      out.write("\t\t\t// console.log('counter='+counter+'info='+content);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//infowindow.setContent(info);\r\n");
      out.write("\t\t\t// => 전역으로 생성된 하나의 객체에 계속 OverWrite 되어 마지막 값만 표시됨\r\n");
      out.write("\t\t\t//    아래처럼 매번 생성해야 한다.\r\n");
      out.write("\t\t\t/*\r\n");
      out.write("\t\t\tvar infowindow = new kakao.maps.InfoWindow({\r\n");
      out.write("\t\t        content: content\r\n");
      out.write("\t\t        });\r\n");
      out.write("\t\t\tinfowindow.open(map,marker);\r\n");
      out.write("\t\t\t*/\r\n");
      out.write("\t\t\t// custom Info Design 을 사용하기 위헤 \r\n");
      out.write("\t\t\tvar customOverlay = new kakao.maps.CustomOverlay({\r\n");
      out.write("\t\t\t    position: coords,\r\n");
      out.write("\t\t\t    content: content   \r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t// 항상 표시\r\n");
      out.write("\t\t\t//customOverlay.setMap(map);\r\n");
      out.write("\t\t\t/*  */\r\n");
      out.write("\t\t\t// 마커에 마우스오버 이벤트를 등록합니다\r\n");
      out.write("\t\t\tkakao.maps.event.addListener(marker, 'mouseover', function() {\r\n");
      out.write("\t\t\t  // 마커에 마우스오버 이벤트가 발생하면 인포윈도우를 마커위에 표시합니다\r\n");
      out.write("\t\t\t    customOverlay.setMap(map);\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t// 마커에 마우스아웃 이벤트를 등록합니다\r\n");
      out.write("\t\t\tkakao.maps.event.addListener(marker, 'mouseout', function() {\r\n");
      out.write("\t\t\t    // 마커에 마우스아웃 이벤트가 발생하면 인포윈도우를 제거합니다\r\n");
      out.write("\t\t\t\tcustomOverlay.setMap(null);\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tcounter++ ;\r\n");
      out.write("\t\t\t// addressSearch 메서드의 매개변수 callBack 함수 특성상\r\n");
      out.write("\t\t\t// for 구문 밖의 구문이 먼저 실행되기 때문에 메서드 내에서 종료를 확인하고 \r\n");
      out.write("\t\t\t// 아래 구문을 처리 해야 함\r\n");
      out.write("\t\t\t// ( 실행 순서 : for외의 모든 구문 - for 구문 - callBack 함수 )\r\n");
      out.write("\t\t\t// 모든 marking 좌표를 포함하도록 영역을 확장\r\n");
      out.write("\t\t\tif (total===counter) map.setBounds(bounds);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t} // if\t\r\n");
      out.write("\t}); // geocoder.addressSearch\t\r\n");
      out.write("} // for\t\r\n");
      out.write("\r\n");
      out.write("/*\r\n");
      out.write("// Version02 -> 주소를 좌표로 변환하여 배열에 넣고 처리\r\n");
      out.write("\r\n");
      out.write("var yLat = new Array(); // y 좌표를 담을 배열\r\n");
      out.write("var xLng = new Array(); // x 좌표를 담을 배열\r\n");
      out.write("\r\n");
      out.write("for(var i=0; i<total; i++) {\r\n");
      out.write("\tvar address=addrs[i].addr ;\r\n");
      out.write("\tgeocoder.addressSearch(address, function(result, status) {\r\n");
      out.write("\t\tif (status === kakao.maps.services.Status.OK) {\r\n");
      out.write("\t\t\tyLat[counter] = result[0].y;\r\n");
      out.write("\t\t\txLng[counter] = result[0].x;\r\n");
      out.write("\t\t\tconsole.log(\"counter=>\"+counter+'i='+i+'result[0].y='+result[0].y+'result[0].x='+result[0].x );\r\n");
      out.write("\t\t\tcounter++;\r\n");
      out.write("\t\t\tif (total===counter) {\r\n");
      out.write("\t\t\t\tconsole.log(\"** geocoder.addressSearch END **\");\r\n");
      out.write("\t\t\t\t//모든 주소의 좌표가 배열로 옮겨졌으면 지도에 marking 한다. \r\n");
      out.write("\t\t\t\tmarkingMap(); \r\n");
      out.write("\t\t\t} \r\n");
      out.write("\t\t} // if\t\r\n");
      out.write("\t}); // geocoder.addressSearch\t\r\n");
      out.write("} // for\t\r\n");
      out.write("\r\n");
      out.write("// 지도에 marking\r\n");
      out.write("function markingMap() {\r\n");
      out.write("//\t  console.log(\"yLat=>\"+yLat);\r\n");
      out.write("//\t  console.log(\"xLat=>\"+xLng);\r\n");
      out.write("\tfor(var i=0; i<total; i++) {\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar coords = new kakao.maps.LatLng(yLat[i], xLng[i]);\r\n");
      out.write("\t\tconsole.log('i='+i+'yLat[i]='+yLat[i]+'xLng[i]='+xLng[i]);\r\n");
      out.write("\r\n");
      out.write("\t\tvar marker = new kakao.maps.Marker({\r\n");
      out.write("\t\t\tmap: map,\r\n");
      out.write("\t\t\tposition: coords\r\n");
      out.write("\t\t}); // marker\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// marking 좌표를 포함하도록 영역 정보를 확장한다.\r\n");
      out.write("\t\tbounds.extend(coords);\r\n");
      out.write("\t\t// 인포윈도우로 장소에 대한 설명을 표시합니다 \r\n");
      out.write("\t\tvar info = addrs[i].content;\r\n");
      out.write("\t\tconsole.log('i='+i+'info='+info);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//infowindow.setContent(info);\r\n");
      out.write("\t\t// => 전역으로 생성된 하나의 객체에 계속 OverWrite 되어 마지막 값만 표시됨\r\n");
      out.write("\t\t//    아래처럼 매번 생성해야 한다.\r\n");
      out.write("\t\tvar infowindow = new kakao.maps.InfoWindow({\r\n");
      out.write("\t        content: info });\r\n");
      out.write("\t\tinfowindow.open(map,marker);\r\n");
      out.write("\t} // for\r\n");
      out.write("\tmap.setBounds(bounds);\r\n");
      out.write("} // function markingMap\r\n");
      out.write("*/\r\n");
      out.write("</script> \r\n");
      out.write("<br><hr><br>\r\n");
      out.write("<a href=\"home\">[HOME]</a>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
