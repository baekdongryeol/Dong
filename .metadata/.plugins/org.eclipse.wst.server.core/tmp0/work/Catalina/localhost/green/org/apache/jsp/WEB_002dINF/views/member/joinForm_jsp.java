/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.41
 * Generated at: 2022-01-10 03:07:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class joinForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/D:/MTest/MyWork/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Spring02/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>** Spring_Mybatis MemberJoin Form **</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"resources/myLib/myStyle.css\">\r\n");
      out.write("<script src=\"resources/myLib/jquery-3.2.1.min.js\"></script>\r\n");
      out.write("<script src=\"resources/myLib/inCheck.js\"></script>\r\n");
      out.write("<script src=\"resources/myLib/axTest01.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("//1) 개별적 오류 확인을 위한 switch 변수 (전역)\t\r\n");
      out.write("  var iCheck=false;\r\n");
      out.write("  var pCheck=false;\t\r\n");
      out.write("  var nCheck=false;\r\n");
      out.write("  var bCheck=false;\r\n");
      out.write("  var oCheck=false; \r\n");
      out.write("  var wCheck=false; \r\n");
      out.write("\r\n");
      out.write("// 2) 개별적 오류점검위한 focusout 이벤트 핸들러 : JQuery\r\n");
      out.write("  $(function() {\r\n");
      out.write("\t  $('#id').focus();\r\n");
      out.write("\t  $('#id').keydown(function(e){\r\n");
      out.write("\t\t  // enter 누르면 다음 으로 이동\r\n");
      out.write("\t\t\tif (e.which==13) {\r\n");
      out.write("\t\t\t\te.preventDefault(); \r\n");
      out.write("\t\t\t\t$('#idDup').focus()\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t  }).focusout(function() {\r\n");
      out.write("\t\t \tiCheck=idCheck();\r\n");
      out.write("\t  }); //id_focusout\r\n");
      out.write("\t  \r\n");
      out.write("\t  $('#password').focusout(function(){\r\n");
      out.write("\t\t\tpCheck=pwCheck();\t\t  \r\n");
      out.write("\t  }); //password_focusout\r\n");
      out.write("\t  \r\n");
      out.write("\t  $('#name').focusout(function(){\r\n");
      out.write("\t\t\tnCheck=nmCheck();\t\t  \r\n");
      out.write("\t  }); //name_focusout\r\n");
      out.write("\t  \r\n");
      out.write("\t  $('#birthd').focusout(function(){\r\n");
      out.write("\t\t\tbCheck=bdCheck();\t\t  \r\n");
      out.write("\t  }); //birthd_focusout\r\n");
      out.write("\t  \r\n");
      out.write("\t  $('#point').focusout(function(){\r\n");
      out.write("\t\t\toCheck=poCheck();\t\t  \r\n");
      out.write("\t  }); //point_focusout\r\n");
      out.write("\t  \r\n");
      out.write("\t  $('#weight').focusout(function(){\r\n");
      out.write("\t\t\twCheck=weCheck();\t\t  \r\n");
      out.write("\t  }); //weight_focusout\r\n");
      out.write("  }); //ready\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("// 3) submit 여부를 판단 & 실행 : JS 의 function\r\n");
      out.write("  function inCheck(){\r\n");
      out.write("\t// 모든 항목에 오류 없음을 확인 : switch 변수\r\n");
      out.write("\tif (iCheck==false) {\r\n");
      out.write("\t\t$('#iMessage').html('~~ id 를 확인하세요 ~~');\r\n");
      out.write("\t}\r\n");
      out.write("\tif (pCheck==false) {\r\n");
      out.write("\t\t$('#pMessage').html('~~ password 를 확인하세요 ~~');\r\n");
      out.write("\t}\t\r\n");
      out.write("\tif (nCheck==false) {\r\n");
      out.write("\t\t$('#nMessage').html('~~ name 을 확인하세요 ~~');\r\n");
      out.write("\t}\t\r\n");
      out.write("\tif (bCheck==false) {\r\n");
      out.write("\t\t$('#bMessage').html('~~ birthday 를 확인하세요 ~~');\r\n");
      out.write("\t}\r\n");
      out.write("\tif (oCheck==false) {\r\n");
      out.write("\t\t$('#oMessage').html('~~ point 를 확인하세요 ~~');\r\n");
      out.write("\t}\r\n");
      out.write("\tif (wCheck==false) {\r\n");
      out.write("\t\t$('#wMessage').html('~~ weight 를 확인하세요 ~~');\r\n");
      out.write("\t}\t\r\n");
      out.write("\t// 모든 오류 확인완료 \r\n");
      out.write("\t// => 없으면 submit : return true , \r\n");
      out.write("\t//    있으면 submit 을 취소 : return false \r\n");
      out.write("\tif ( iCheck && pCheck && nCheck &&\r\n");
      out.write("\t\t bCheck && oCheck && wCheck ) {\r\n");
      out.write("\t\t// => submit : 404\r\n");
      out.write("\t\tif (confirm(\"~~ 정말 가입 하십니까 ? (Yes:확인 / No:취소)\")==false) {   \r\n");
      out.write("\t\t \t  alert('~~ 가입이 취소 되었습니다 ~~');\r\n");
      out.write("\t\t \t  return false;\r\n");
      out.write("\t\t}else return true; // submit 진행 -> server의 join  \r\n");
      out.write("\t} else return false; \r\n");
      out.write("  } //inCheck\r\n");
      out.write("\r\n");
      out.write("  //** ID 중복 확인하기\r\n");
      out.write("  function idDupCheck() {\r\n");
      out.write("\t// id 의 입력값 무결성 점검 확인\r\n");
      out.write("\tif (iCheck==false) {\r\n");
      out.write("\t\tiCheck=idCheck();\r\n");
      out.write("\t}else { \r\n");
      out.write("\t\t// id 중복확인\r\n");
      out.write("\t\t// => id를 서버로 보내 중복확인, 결과 처리 \r\n");
      out.write("\t\t// => window.open(url,'','')\r\n");
      out.write("\t\t//    url 요청을 서버로 전달(request) 하고, 그결과(response)를 Open 해줌\r\n");
      out.write("\t\tvar url=\"idcheck?id=\"+$('#id').val(); \r\n");
      out.write("\t\twindow.open(url,'_blank',\r\n");
      out.write("\t\t\t\t'toolbar=no,menubar=yes,scrollbars=yes,resizable=yes,width=400,height=300');\r\n");
      out.write("\t}  \r\n");
      out.write("  } //idDupCheck\r\n");
      out.write("  \r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<h3>** Spring_Mybatis MemberJoin **</h3>\r\n");
      out.write("<!-- <pre><h3>\r\n");
      out.write("=> FileUpLoad TestForm\r\n");
      out.write("=> form 과 table Tag 사용시 주의사항 : form 내부에 table 사용해야함\r\n");
      out.write("   -> form 단위작업시 인식안됨\r\n");
      out.write("   -> JQ 의 serialize, FormData 의 append all 등\r\n");
      out.write("</h3></pre>\r\n");
      out.write(" -->\r\n");
      out.write("<form action=\"join\" method=\"post\" enctype=\"multipart/form-data\" id=\"myForm\">\r\n");
      out.write("<!-- => method=\"post\" : 255 byte 이상 대용량 전송 가능 하므로 \r\n");
      out.write("\t => enctype=\"multipart/form-data\" : 화일 upload 를 가능하게 해줌 \r\n");
      out.write("\t** multipart/form-data는 파일업로드가 있는 입력양식요소에 사용되는 enctype 속성의 값중 하나이고, \r\n");
      out.write("       multipart는 폼데이터가 여러 부분으로 나뉘어 서버로 전송되는 것을 의미\r\n");
      out.write("       이 폼이 제출될 때 이 형식을 서버에 알려주며, \r\n");
      out.write("       multipart/form-data로 지정이 되어 있어야 서버에서 정상적으로 데이터를 처리할 수 있다.  -->\r\n");
      out.write("<table>\r\n");
      out.write("\t<tr height=\"40\"><td bgcolor=\"aqua\">I D</td>\r\n");
      out.write("\t\t<td><input type=\"text\" name=\"id\" id=\"id\" value=\"testid\" size=\"20\">&nbsp;&nbsp;\r\n");
      out.write("\t\t\t<input type=\"button\" value=\"ID중복확인\" id=\"idDup\" onclick=\"idDupCheck()\"><br>\r\n");
      out.write("\t\t\t<span id=\"iMessage\" class=\"eMessage\"></span></td></tr>\r\n");
      out.write("\t<tr height=\"40\"><td bgcolor=\"aqua\">Password</td>\r\n");
      out.write("\t\t<td><input type=\"password\" name=\"password\" id=\"password\" value=\"12345\" size=\"20\"><br>\r\n");
      out.write("\t\t\t<span id=\"pMessage\" class=\"eMessage\"></span></td></tr>\t\r\n");
      out.write("\t<tr height=\"40\"><td bgcolor=\"aqua\">Name</td>\r\n");
      out.write("\t\t<td><input type=\"text\" name=\"name\" id=\"name\" value=\"홍길동\" size=\"20\"><br>\r\n");
      out.write("\t\t\t<span id=\"nMessage\" class=\"eMessage\"></span></td></tr>\r\n");
      out.write("\t<tr height=\"40\"><td bgcolor=\"aqua\">Level</td>\r\n");
      out.write("\t\t<td><select name=\"lev\" id=\"lev\">\r\n");
      out.write("\t\t\t\t<option value=\"A\" >관리자</option>\r\n");
      out.write("\t\t\t\t<option value=\"B\" >나무</option>\r\n");
      out.write("\t\t\t\t<option value=\"C\" >잎새</option>\r\n");
      out.write("\t\t\t\t<option value=\"D\" selected>새싹</option>\r\n");
      out.write("\t\t\t</select>\r\n");
      out.write("\t\t</td></tr>\r\n");
      out.write("\t<tr height=\"40\"><td bgcolor=\"aqua\">Birthday</td>\r\n");
      out.write("\t\t<td><input type=\"date\" name=\"birthd\" id=\"birthd\"><br>\r\n");
      out.write("\t\t\t<span id=\"bMessage\" class=\"eMessage\"></span></td></tr>\r\n");
      out.write("\t<tr height=\"40\"><td bgcolor=\"aqua\">Point</td>\r\n");
      out.write("\t\t<td><input type=\"text\" name=\"point\" id=\"point\" value=\"3000\" size=\"20\"><br>\r\n");
      out.write("\t\t\t<span id=\"oMessage\" class=\"eMessage\"></span></td></tr>\r\n");
      out.write("\t<tr height=\"40\"><td bgcolor=\"aqua\">Weight</td>\r\n");
      out.write("\t\t<td><input type=\"text\" name=\"weight\" id=\"weight\" value=\"66.77\" size=\"20\"><br>\r\n");
      out.write("\t\t\t<span id=\"wMessage\" class=\"eMessage\"></span></td></tr>\r\n");
      out.write("\t<tr height=\"40\"><td bgcolor=\"aqua\">추천인ID</td>\r\n");
      out.write("\t\t<td><input type=\"text\" name=\"rid\" id=\"rid\" size=\"20\"></td>\r\n");
      out.write("\t</tr>\t\t\r\n");
      out.write("\t<tr height=\"40\"><td bgcolor=\"aqua\">Image</td>\r\n");
      out.write("\t\t<td><img src=\"\" class=\"select_img\"><br>\r\n");
      out.write("\t\t\t<input type=\"file\" name=\"uploadfilef\" id=\"uploadfilef\">\r\n");
      out.write("\t\t\t<script>\r\n");
      out.write("\t\t\t// 해당 파일의 서버상의 경로를 src로 지정하는것으로는 클라이언트 영역에서 이미지는 표시될수 없기 때문에\r\n");
      out.write("\t\t\t// 이를 해결하기 위해 FileReader이라는 Web API를 사용\r\n");
      out.write("\t\t\t// => 이 를 통해 url data를 얻을 수 있음.\r\n");
      out.write("\t\t\t//    ( https://developer.mozilla.org/ko/docs/Web/API/FileReader)\r\n");
      out.write("\t\t\t// ** FileReader\r\n");
      out.write("\t\t\t// => 웹 애플리케이션이 비동기적으로 데이터를 읽기 위하여 읽을 파일을 가리키는File\r\n");
      out.write("\t\t\t//    혹은 Blob 객체를 이용해 파일의 내용을(혹은 raw data버퍼로) 읽고 \r\n");
      out.write("\t\t\t//    사용자의 컴퓨터에 저장하는 것을 가능하게 해줌.\t\r\n");
      out.write("\t\t\t// => FileReader.onload 이벤트의 핸들러.\r\n");
      out.write("\t\t\t//    읽기 동작이 성공적으로 완료 되었을 때마다 발생.\r\n");
      out.write("\t\t\t// => e.target : 이벤트를 유발시킨 DOM 객체\r\n");
      out.write("\t  \t\t\r\n");
      out.write("\t\t\t\t$('#uploadfilef').change(function(){\r\n");
      out.write("\t\t\t\t\tif(this.files && this.files[0]) {\r\n");
      out.write("\t\t\t\t\t\tvar reader = new FileReader;\r\n");
      out.write("\t\t\t\t \t\t\treader.onload = function(e) {\r\n");
      out.write("\t\t\t \t\t\t\t$(\".select_img\").attr(\"src\", e.target.result)\r\n");
      out.write("\t\t\t \t\t\t\t\t.width(100).height(100); \r\n");
      out.write("\t\t\t \t\t\t\t} // onload_function\r\n");
      out.write("\t\t\t \t\t\t\treader.readAsDataURL(this.files[0]);\r\n");
      out.write("\t\t\t \t\t} // if\r\n");
      out.write("\t\t\t\t}); // change\t\t\t\r\n");
      out.write("\t\t\t</script>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\t\t\r\n");
      out.write("\t<tr height=\"40\"><td></td>\r\n");
      out.write("\t\t<td><input type=\"submit\" value=\"가입\" onclick=\"return inCheck()\" id=\"submit\" disabled>&nbsp;&nbsp;\r\n");
      out.write("\t\t\t<input type=\"reset\" value=\"취소\">&nbsp;&nbsp;\r\n");
      out.write("\t\t\t<span id=\"axjoin\" class=\"textLink\">AxJoin</span>\r\n");
      out.write("\t\t</td></tr>\t\t\t\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<hr>\r\n");
      out.write("<a href=\"home\">[Home]</a>\r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /WEB-INF/views/member/joinForm.jsp(194,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty message}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("<br>=> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("<br><br> \r\n");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }
}
