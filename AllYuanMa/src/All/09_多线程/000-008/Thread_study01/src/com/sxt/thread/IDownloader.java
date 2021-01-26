package com.sxt.thread;

public class IDownloader implements Runnable{
	private String url; //远程路径
	private String name;  //存储名字
	
	public IDownloader(String url, String name) {
		this.url = url; 
		this.name = name;
	}

	@Override
	public void run() {
		WebDownloader wd =new WebDownloader();
		wd.download(url, name);		
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		IDownloader td1 =new IDownloader("http://upload.news.cecb2b.com/2014/0511/1399775432250.jpg","phone.jpg");
		IDownloader td2 =new IDownloader("http://p1.pstatp.com/large/403c00037462ae2eee13","spl.jpg");
		IDownloader td3 =new IDownloader("http://5b0988e595225.cdn.sohucs.com/images/20170830/d8b57e0dce0d4fa29bd5ef014be663d5.jpeg","success.jpg");
		
		//启动三个线程
		new Thread(td1).start();
		new Thread(td2).start();
		new Thread(td3).start();
	}
}
