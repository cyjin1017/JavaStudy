
public class NetworkMain {
	public static void main(String[] args) {
		NetworkUtil nu = new NetworkUtil();
		String result = nu.get("https://www.dhlottery.co.kr/gameResult.do?method=byWin&drwNo=857");
		System.out.println(result);
		
		int s_idx = result.indexOf("num win");
		int e_idx = result.indexOf("</p>", s_idx);
		String data = result.substring(s_idx, e_idx);
		System.out.println(data);
		//<span class="ball_645 lrg ball1">6</span>
		
		String lotto ="";
		e_idx = 0;
		while(true) {
		s_idx = data.indexOf("<span class=", e_idx);
		if(s_idx == -1) break;
		s_idx = data.indexOf(">", s_idx);
		e_idx = data.indexOf("<", s_idx);
		String s = data.substring(s_idx+1, e_idx);
		lotto += (s.length()<2) ? "0" + s : s;
		//System.out.println(data.substring(s_idx+1, e_idx));
		s_idx = e_idx;
		}
		System.out.println(lotto);
	}
}
