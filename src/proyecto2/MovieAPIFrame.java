/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.*;

public class MovieAPIFrame extends JFrame {

    ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();

    public MovieAPIFrame() {
        setTitle("Movies from TMDb");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea movieList = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(movieList);
        add(scrollPane);

        try {
            //URL url = new URL("https://api.themoviedb.org/3/movie/popular?api_key=eba71768ad1290ad4dc8d305cef81e0a");
           // https://api.themoviedb.org/3/movie/670292?language=en-US
            URL url = new URL("https://api.themoviedb.org/3/movie/670292?language=en-US&api_key=eba71768ad1290ad4dc8d305cef81e0a");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);               
            }
            reader.close();

            JsonObject jsonObject = JsonParser.parseString(response.toString()).getAsJsonObject();
            JsonArray results = jsonObject.getAsJsonArray("results");

           

            for (int i = 0; i < results.size(); i++) {
                
                JsonObject movie = results.get(i).getAsJsonObject();
                
                String title = movie.get("title").getAsString();
                String originalTitle = movie.get("original_title").getAsString();
                String overview = movie.get("overview").getAsString();
                String posterPath = movie.get("poster_path").getAsString();

                Pelicula peli = new Pelicula(title, originalTitle, overview, posterPath);
                peliculas.add(peli);
            }

            StringBuilder strB = new StringBuilder();

            for (Pelicula result : peliculas) {
                strB.append(result.getTitulo());
                strB.append("\n");
                strB.append(result.getOverview());
                strB.append("\n");
                strB.append(result.getPosterPath());
                strB.append("\n");
                strB.append("\n");

            }
            movieList.setText(strB.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MovieAPIFrame frame = new MovieAPIFrame();
            frame.setVisible(true);
        });
    }
}
