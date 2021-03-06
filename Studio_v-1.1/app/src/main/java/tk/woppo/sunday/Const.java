package tk.woppo.sunday;

import tk.woppo.sunday.model.city.AreaModel;

/**
 * Created by Ho on 2014/6/25.
 */
public class Const {

    /** 是否调试 */
    public static final boolean DEBUG = true;

    /** 配置文件名 */
    public static final String CONFIG_NAME = "SunDay.cof";
    /** 是否退出时杀死进程 */
    public static final String CONFIG_EXIT_KILL = "exit_kill";
    /** 是否发送通知栏通知 */
    public static final String CONFIG_NOTIFY = "notify";
    /** 是否开启自动更新 */
    public static final String CONFIG_AUTO_UPDATE = "auto_update";
    /** 是否开启免杀模式 */
    public static final String CONFIG_NO_KILL = "no_kill";

    /** 我的城市文件名 */
    protected final static String FILE_MY_AREA = "MyArea";

    /** 默认城市信息 */
    public static final String DEF_CITY_ID = "010101";
    public static final String DEF_CITY_NAME = "北京";
    public static final String DEF_WEATHER_CODE = "101010100";


    /** 城市信息xml文件 */
    public static final String FILE_CITY_NAME = "city.xml";

    /** 天气详情  */
    public static final String WEATER_INFO_URL="http://tq.360.cn/api/weatherquery/query";
    /** 城市列表 */
    public static final String CITY_URL="http://cdn.weather.hao.360.cn/sed_api_area_query.php";
    /** 城市列表-省 */
    public static final String PROVINCE="http://cdn.weather.hao.360.cn/sed_api_area_query.php?grade=province&_jsonp=loadProvince";
    /** 城市列表-市 */
    public static final String CITY="http://cdn.weather.hao.360.cn/sed_api_area_query.php?grade=city&_jsonp=loadCity&code=08";
    /** 城市列表-县 */
    public static final String TOWN="http://cdn.weather.hao.360.cn/sed_api_area_query.php?grade=town&_jsonp=loadTown&code=0804";


//    /** 六天天气 */
//    public static final String WEATHER = "http://m.weather.com.cn/atad/";
//
//    /** 实时天气 */
//    public static final String WEATHER_NOW = "http://www.weather.com.cn/data/sk/";
//    public static final String WEATHER_CUR = "http://www.weather.com.cn/data/cityinfo/";
//
//    /** 测试URL */
//    public static final String TEST_URL = "http://m.weather.com.cn/atad/101110101.html";
}
