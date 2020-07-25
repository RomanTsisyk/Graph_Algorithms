package WebCrawler;

 class App {

	public static void main(String[] args) {
		
		String root = "https://rp.pl";
		BFS bfs = new BFS();	
		bfs.discoverWeb(root);
		
	}
}
