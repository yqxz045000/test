package com.example.demo.pattern;

/**
 * 
 * @author cfyj 2017年9月7日 上午9:56:44 单例设计模式：懒汉式
 *
 */
public class Singletion {

	private static Singletion singletion = null;

	private Singletion() {
	}

	public static Singletion getInstantce() {
		// 双重锁定
		if (singletion == null) {
			synchronized (Singletion.class) {
				if (singletion == null) {
					singletion = new Singletion();
				}
			}
		}
		return singletion;
	}

	public static void main(String[] args) {

		Singletion s1 = Singletion.getInstantce();
		Singletion s2 = Singletion.getInstantce();

		System.out.println(s1 == s2);

	}

}
