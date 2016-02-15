package com.list;

import java.util.ArrayList;

import com.model.StringAndState;

public class AllListCell {

	private ArrayList<StringAndState> arrayList = new ArrayList<StringAndState>();

	private ArrayList<String> arrayListTwo = new ArrayList<String>();

	public ArrayList<StringAndState> getListOne() {
		arrayList.add(new StringAndState("解表药", 0));
		arrayList.add(new StringAndState("发散风寒药", 1));
		arrayList.add(new StringAndState("发散风热药", 1));
		arrayList.add(new StringAndState("清热药", 0));
		arrayList.add(new StringAndState("清热泻火药", 1));
		arrayList.add(new StringAndState("清热燥湿药", 1));
		arrayList.add(new StringAndState("清热解毒药", 1));
		arrayList.add(new StringAndState("清热凉血药", 1));
		arrayList.add(new StringAndState("清虚热药", 1));
		arrayList.add(new StringAndState("泻下药", 0));
		arrayList.add(new StringAndState("攻下药", 1));
		arrayList.add(new StringAndState("润下药", 1));
		arrayList.add(new StringAndState("峻下逐水药", 1));
		arrayList.add(new StringAndState("祛风湿药", 0));
		arrayList.add(new StringAndState("祛风寒湿药", 1));
		arrayList.add(new StringAndState("祛风湿热药", 1));
		arrayList.add(new StringAndState("祛风湿强筋骨药", 1));
		// arrayList.add(new StringAndState());
		// arrayList.add(new StringAndState());
		// arrayList.add(new StringAndState());
		// arrayList.add(new StringAndState());
		// arrayList.add(new StringAndState());
		// arrayList.add(new StringAndState());
		// arrayList.add(new StringAndState());
		// arrayList.add(new StringAndState());
		// arrayList.add(new StringAndState());
		// arrayList.add(new StringAndState());
		// arrayList.add(new StringAndState());
		// arrayList.add(new StringAndState());
		// arrayList.add(new StringAndState());
		// arrayList.add(new StringAndState());
		// arrayList.add(new StringAndState());
		// arrayList.add(new StringAndState());
		// arrayList.add(new StringAndState());
		// arrayList.add(new StringAndState());
		// arrayList.add(new StringAndState());
		// arrayList.add(new StringAndState());
		// arrayList.add(new StringAndState());
		// arrayList.add(new StringAndState());
		// arrayList.add(new StringAndState());
		// arrayList.add(new StringAndState());
		// arrayList.add(new StringAndState());
		// arrayList.add(new StringAndState());
		// arrayList.add(new StringAndState());
		// arrayList.add(new StringAndState());
		// arrayList.add(new StringAndState());
		// arrayList.add(new StringAndState());
		// arrayList.add(new StringAndState());
		// arrayList.add(new StringAndState());
		// arrayList.add(new StringAndState());
		// arrayList.add(new StringAndState());
		// arrayList.add(new StringAndState());
		// arrayList.add(new StringAndState());
		// arrayList.add(new StringAndState());
		// arrayList.add(new StringAndState());
		// arrayList.add(new StringAndState());
		// arrayList.add(new StringAndState());
		// arrayList.add(new StringAndState());
		// arrayList.add(new StringAndState());
		// arrayList.add(new StringAndState());
		// arrayList.add(new StringAndState());
		// arrayList.add(new StringAndState());
		// arrayList.add(new StringAndState());
		// arrayList.add(new StringAndState());
		// arrayList.add(new StringAndState());
		// arrayList.add(new StringAndState());
		// arrayList.add(new StringAndState());
		// arrayList.add(new StringAndState());
		// arrayList.add(new StringAndState());
		// arrayList.add(new StringAndState());
		// arrayList.add(new StringAndState());
		// arrayList.add(new StringAndState());
		// arrayList.add(new StringAndState());
		// arrayList.add(new StringAndState());

		return arrayList;
	}

	private String[] menuOne = { "解表药" };

	private String[] listOne = { "麻黄", "桂枝", "紫苏叶", "生姜", "香薷", "荆芥", "防风",
			"羌活", "白芷", "细辛", "藁本", "苍耳子", "辛夷", "葱白", "胡荽", "西河柳" };

	private String[] listTwo = { "薄荷", "牛蒡子", "蝉蜕", "桑叶", "菊花", "蔓荆子", "柴胡",
			"升麻", "葛根", "淡豆豉", "浮萍", "木贼", "谷精草" };

	private String[] menuTwo = { "清热药" };

	private String[] listThree = { "石膏", "寒水石", "知母", "芦根", "天花粉", "竹叶", "淡竹叶",
			"鸭跖草", "栀子", "夏枯草", "决明子", "密蒙花", "青葙子" };
	private String[] listFour = { "黄芩", "黄连", "黄柏", "龙胆", "秦皮", "苦参", "白鲜皮" };
	private String[] listFive = { "金银花", "连翘", "穿心莲", "大青叶", "板蓝根", "青黛", "贯众",
			"蒲公英", "紫花地丁", "野菊花", "重楼", "拳参", "漏芦", "土茯苓", "鱼腥草", "金荞麦", "大血藤",
			"败酱草", "射干", "山豆根", "马勃", "青果", "木蝴蝶", "白头翁", "马齿苋", "鸦胆子", "地锦草",
			"委陵菜", "半边莲", "白花蛇舌草", "山慈菇", "熊胆粉", "千里光", "白蔹", "四季青", "绿豆" };
	private String[] listSix = { "生地黄", "玄参", "牡丹皮", "赤芍", "紫草", "水牛角" };
	private String[] listSeven = { "青蒿", "白薇", "地骨皮", "银柴胡", "胡黄连" };

	private String[] menuthree = { "泻下药" };

	private String[] listEight = { "大黄", "芒硝", "番泻叶", "芦荟" };
	private String[] listNine = { "火麻仁", "郁李仁", "松子仁" };
	private String[] listTen = { "甘遂", "京大戟", "芫花", "商陆", "牵牛子", "巴豆霜", "千金子" };

	private String[] menuFour = { "祛风湿药" };

	private String[] listEleven = { "独活", "威灵仙", "徐长卿", "川乌", "蕲蛇", "乌梢蛇",
			"木瓜", "蚕沙", "伸筋草", "油松节", "海风藤", "青风藤", "丁公藤", "昆明山海棠", "路路通",
			"穿山龙" };
	private String[] listTwelve = { "秦艽", "防己", "桑枝", "豨莶草", "臭梧桐", "海桐皮",
			"络石藤", "雷公藤", "老鹳草", "丝瓜络" };
	private String[] listThirteen = { "五加皮", "桑寄生", "狗脊", "千年健", "雪莲花" };

	public ArrayList<String> getListTwo(int a) {
		arrayListTwo.clear();
		if (a == 0) {
			arrayListTwo = initList(menuOne);
		} else if (a == 1) {
			arrayListTwo = initList(listOne);
		} else if (a == 2) {
			arrayListTwo = initList(listTwo);
		} else if (a == 3) {
			arrayListTwo = initList(menuTwo);
		} else if (a == 4) {
			arrayListTwo = initList(listThree);
		} else if (a == 5) {
			arrayListTwo = initList(listFour);
		} else if (a == 6) {
			arrayListTwo = initList(listFive);
		} else if (a == 7) {
			arrayListTwo = initList(listSix);
		} else if (a == 8) {
			arrayListTwo = initList(listSeven);
		} else if (a == 9) {
			arrayListTwo = initList(menuthree);
		} else if (a == 10) {
			arrayListTwo = initList(listEight);
		} else if (a == 11) {
			arrayListTwo = initList(listNine);
		} else if (a == 12) {
			arrayListTwo = initList(listTen);
		} else if (a == 13) {
			arrayListTwo = initList(menuFour);
		} else if (a == 14) {
			arrayListTwo = initList(listEleven);
		} else if (a == 15) {
			arrayListTwo = initList(listTwelve);
		} else if (a == 16) {
			arrayListTwo = initList(listThirteen);
		}
		return arrayListTwo;
	}

	private ArrayList<String> initList(String[] a) {
		ArrayList<String> listFinish = new ArrayList<String>();
		for (int list = 0; list < a.length; list++) {
			listFinish.add(a[list]);
		}
		return listFinish;
	}
}
