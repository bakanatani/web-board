package work;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class WebBoardServlet extends HttpServlet {
	/**
	 * GETリクエストで呼ばれる処理
	 *
	 * @param request  Httpリクエスト
	 * @param response Httpレスポンス
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

		// TODO サービスメソッドを使用してメッセージを取得する

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		// 掲示板画面出力
		out.println("<html>");
		out.println("<head>");
		out.println("  <style type=\"text/css\">");
		out.println("    <!-- body {font-family: meiryo, arial; max-width: 80%; margin: 0 auto; } -->");
		out.println("    <!-- h1 {text-align: center; background: lime; } -->");
		out.println("  </style>");
		out.println("  <meta charset=\"UTF-8\">");
		out.println("  <title>IT基礎研修掲示板</title>");
		out.println("</heda>");
		out.println("<body>");
		out.println("  <h1>IT基礎研修掲示板</h1>");
		out.println("  <form action=\"./\" method=\"post\">");
		out.println("    <input type=\"text\" name=\"name\" placeholder=\"name\" required></br>");
		out.println(
				"    <textarea name=\"message\" rows=\"4\" cols=\"50\" maxlength=\"250\" placeholder=\"message\"></textarea></br>");
		out.println("    </br>");
		out.println("    <input type=\"submit\" value=\"投稿\">");
		out.println("  </form>");

		// TODO 掲示板データを描画する処理を実装する

		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * POSTリクエストで呼ばれる処理
	 *
	 * @param request  Httpリクエスト
	 * @param response Httpレスポンス
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		request.setCharacterEncoding("UTF-8");

		// TODO サービスメソッドを使用してメッセージを登録する

		// リダイレクトを設定
		response.sendRedirect("./");
	}
}
